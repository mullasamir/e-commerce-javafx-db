package EcommerceDeleteUser;

import java.sql.SQLException;

import CommonDatabase.DbUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteUserController {
	
	@FXML
	TextField userTodelete;

	@FXML
	Button deleteUserBtn;

	@FXML
	Label deletemsg;

	public void deleteUserButton() throws SQLException {

		String deleteUser = userTodelete.getText();
		String query = "delete from e_user where fname = '" + deleteUser + "'";

		DbUtils.executeQuery(query);
		deletemsg.setText(deleteUser + " deleted from user table");

	}

}
