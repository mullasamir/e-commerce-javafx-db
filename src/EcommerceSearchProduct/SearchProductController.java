package EcommerceSearchProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import CommonDatabase.DbUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchProductController {
	
	
	@FXML
	TextField productToSearch;
	
	@FXML
	Button searchProductBtn;
	
	@FXML
	Label foundmsg;
	
	public void searchProduct() throws NumberFormatException, SQLException {
		String ProductIdToSearchField=productToSearch.getText();
		
		if(validatesearchProduct(Integer.parseInt(ProductIdToSearchField))){
			foundmsg.setText("Product Found!!");
			foundmsg.setTextFill(Color.GREEN);
		}
		else {
			foundmsg.setText("Product Not Found!!");
			foundmsg.setTextFill(Color.RED);
		}
	}
	public boolean validatesearchProduct(int ProductId) throws SQLException {
		String query="SELECT * FROM product where product_id='"+ProductId+"'";
		
		ResultSet result=DbUtils.selectQuery(query);
		
		return result.next();
	}

}
