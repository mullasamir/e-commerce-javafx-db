package EcommerceProductManagement;

import java.io.IOException;

import EcommerceAddProduct.AddProductViewer;
import EcommerceAddUser.AddUserScreen;
import EcommerceDeleteProduct.DeleteProductViewer;
import EcommerceSearchProduct.SearchProductViewer;
import EcommerceUpdateProduct.ProductUpdateViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductScreenController {

	@FXML
	Button addProduct;
	@FXML
	Button updateProduct;
	@FXML
	Button searchProduct;
	@FXML
	Button deleteProduct;
	@FXML
	Button printProduct;
	@FXML
	Button logOut;

	public void addProductButton() throws IOException {

		System.out.println("add user clicked");
		AddProductViewer.show();
	}

	public void updateProductButton() throws IOException {
		System.out.println("update user clicked");
		ProductUpdateViewer.show();

	}

	public void searchProductButton() throws IOException {
		System.out.println("searchUserButton clicked");
		SearchProductViewer.show();

	}

	public void deleteProductButton() throws IOException {

		System.out.println("deleteUserButton clicked");
		DeleteProductViewer.show();

	}

	public void printProductButton() {
		System.out.println("printUserButton clicked");

	}

	public void logoutButton() {
		System.out.println("logoutButton clicked");

	}

}
