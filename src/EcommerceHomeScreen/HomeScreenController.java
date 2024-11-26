package EcommerceHomeScreen;

import java.io.IOException;

import EcommerceProductManagement.ProductScreenViewer;
import EcommerceUserManagement.UserScreenViewer;


import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeScreenController {

	@FXML
	Button productManagementButton;
	@FXML
	Button userManagementButton;
	@FXML
	Button logOut;

		public void userManagementButton() throws IOException {
			
		System.out.println("userManagementButton clicked");
		UserScreenViewer.show();

	
		}
	
		public void productManagementButton() throws IOException {
			System.out.println("productManagementButton clicked");
			ProductScreenViewer.show();
	
		}
	
		public void logoutButton() {
	
		}

}
