package EcommerceDeleteProduct;

import java.sql.SQLException;

import CommonDatabase.DbUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteProductController {

	@FXML
	TextField DeleteProduct;

	@FXML
	Button deleteProductBtn;

	@FXML
	Label deletemsg;

	public void deleteProduct() throws SQLException {

		String deleteProduct = DeleteProduct.getText();
		String query = "delete from product where product_name = '" + deleteProduct + "'";

		DbUtils.executeQuery(query);
		deletemsg.setText(deleteProduct + " deleted from product table");

	}
}
