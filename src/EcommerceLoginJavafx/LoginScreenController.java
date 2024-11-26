package EcommerceLoginJavafx;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import CommonDatabase.DbUtils;
import EcommerceHomeScreen.HomeScreenViewer;
import StageHolder.CommonStage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	@FXML
	TextField uname;
	@FXML
	TextField upass;
	@FXML
	Label msg;

	public void loginButtonMsg() throws SQLException, IOException {

		String usernm = uname.getText();
		String userpass = upass.getText();

		if (loginValidate(usernm, userpass)) {
			HomeScreenViewer.show();
				
	
		} else {
			msg.setText("Login Failed..");
			msg.setTextFill(Color.RED);
		}

	}

	public boolean loginValidate(String username, String userpass) throws SQLException {

		String query = "select fname , pass from e_user where fname = '" + username + "' and pass = '" + userpass + "'";
		ResultSet resultSet = DbUtils.selectQuery(query);
		return resultSet.next();
	}

}