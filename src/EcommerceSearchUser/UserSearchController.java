package EcommerceSearchUser;

import java.sql.ResultSet;
import java.sql.SQLException;

import CommonDatabase.DbUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class UserSearchController {
	
	@FXML
	TextField userToSearch;
	
	@FXML
	Button searchUserButton;
	
	@FXML
	Label foundmsg;
	
	public void searchUser() throws NumberFormatException, SQLException {
		String UserToSearchField=userToSearch.getText();
		
		if(validatesearchProduct(UserToSearchField)){
			foundmsg.setText("User Found!!");
			foundmsg.setTextFill(Color.GREEN);
		}
		else {
			foundmsg.setText("User Not Found!!");
			foundmsg.setTextFill(Color.RED);
		}
	}
	public boolean validatesearchProduct(String userToSearch) throws SQLException {
		String query="SELECT * FROM e_user where fname='"+userToSearch+"'";
		
		ResultSet result=DbUtils.selectQuery(query);
		
		return result.next();
	}
}
