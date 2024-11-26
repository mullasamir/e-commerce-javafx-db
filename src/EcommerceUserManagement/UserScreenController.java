package EcommerceUserManagement;

import java.io.IOException;

import EcommerceAddUser.AddUserScreen;
import EcommerceDeleteProduct.DeleteProductViewer;
import EcommerceDeleteUser.DeleteUserViewer;
import EcommerceSearchUser.UserSeachViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserScreenController {
	
	@FXML
	Button addUser;
	@FXML
	Button updateUser;
	@FXML
	Button searchUser;
	@FXML
	Button deleteUser;
	@FXML
	Button printUser;
	@FXML
	Button logOut;

		public void addUserButton() throws IOException {
			
		System.out.println("add user clicked");
		AddUserScreen.show();

	
		}
	
		public void updateUserButton() throws IOException {
			System.out.println("update user clicked");
			
	
		}
	
		public void searchUserButton() throws IOException {
			System.out.println("searchUserButton clicked");
			UserSeachViewer.show();
	
		}

		public void deleteUserButton() throws IOException {
			
		System.out.println("deleteUserButton clicked");
		DeleteUserViewer.show();
	
		}
		public void printUserButton() {
			System.out.println("printUserButton clicked");
	
		}
		public void logoutButton() {
			System.out.println("logoutButton clicked");
	
		}
	
		
	
	

}
