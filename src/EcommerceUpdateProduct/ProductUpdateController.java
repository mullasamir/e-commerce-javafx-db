package EcommerceUpdateProduct;

import java.sql.SQLException;

import CommonDatabase.DbUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ProductUpdateController {

    @FXML
    TextField ProductIdToUpdate;

    @FXML
    TextField new_prod_id;

    @FXML
    TextField new_pname;

    @FXML
    TextField new_pqty;

    @FXML
    TextField new_pprc;

    @FXML
    Button UpdateProductButton;

    @FXML
    Label updateMsg;

    public void updateProductButton() {
        // Retrieve inputs from text fields
        String ProductIdField = ProductIdToUpdate.getText();
        String UpdatedProductIdField = new_prod_id.getText();
        String UpdatedProductNameField = new_pname.getText();
        String UpdatedProductQuantityField = new_pqty.getText();
        String UpdatedProductPriceField = new_pprc.getText();

        // Validate input fields
        if (ProductIdField.isEmpty() || UpdatedProductIdField.isEmpty() || UpdatedProductNameField.isEmpty()
                || UpdatedProductQuantityField.isEmpty() || UpdatedProductPriceField.isEmpty()) {
            updateMsg.setText("Please fill in all fields.");
            updateMsg.setTextFill(Color.RED);
            return;
        }

        try {
            // Parse integer fields
            int productId = Integer.parseInt(ProductIdField);
            int updatedProductId = Integer.parseInt(UpdatedProductIdField);
            int updatedProductQuantity = Integer.parseInt(UpdatedProductQuantityField);
            int updatedProductPrice = Integer.parseInt(UpdatedProductPriceField);

            // Call the database update method
            if (updateProductInDb(productId, updatedProductId, UpdatedProductNameField, updatedProductQuantity,
                    updatedProductPrice)) {
                updateMsg.setText("Product updated successfully!!");
                updateMsg.setTextFill(Color.GREEN);
                clearFields();
            } else {
                updateMsg.setText("Failed to update product!!");
                updateMsg.setTextFill(Color.RED);
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format
            updateMsg.setText("Invalid number format in one of the fields.");
            updateMsg.setTextFill(Color.RED);
        }
    }

    private void clearFields() {
        // Clear all text fields
        ProductIdToUpdate.clear();
        new_prod_id.clear();
        new_pname.clear();
        new_pqty.clear();
        new_pprc.clear();
    }

    public boolean updateProductInDb(int productId, int updatedProductId, String updatedProductName,
            int updatedProductQuantity, int updatedProductPrice) {
        // Correct the SQL query to use actual values from method arguments
        String query = "UPDATE product SET product_id = " + updatedProductId +
                       ", product_name = '" + updatedProductName + 
                       "', product_qty = " + updatedProductQuantity + 
                       ", product_prc = " + updatedProductPrice + 
                       " WHERE product_id = " + productId;

        boolean isUpdated = false;
        try {
            // Use the existing DbUtils class to execute the query
            isUpdated = DbUtils.executeQuery(query);
        } catch (SQLException e) {
            // Log the exception for debugging
            e.printStackTrace();
        }

        return isUpdated;
    }
}
