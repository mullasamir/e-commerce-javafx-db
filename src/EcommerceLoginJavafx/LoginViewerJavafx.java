package EcommerceLoginJavafx;

import java.net.URL;
import java.nio.file.Paths;

import StageHolder.CommonStage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginViewerJavafx extends Application {

	public static void main(String[] args) {
		Application.launch(LoginViewerJavafx.class, args);
	}

	@Override
	public void start(Stage stagecreatedByjavafx) throws Exception {
		
		CommonStage.stage = stagecreatedByjavafx;

		URL fxmlurl = Paths
				.get("C:/Users/91853/eclipse-workspace/Ecommerce_javafx/src/EcommerceLoginJavafx/loginscreen.fxml")
				.toUri().toURL();
		Parent actorGroup = FXMLLoader.load(fxmlurl);
		CommonStage.stage.setTitle("Login Form");
		Scene scene = new Scene(actorGroup, 600, 400);
		CommonStage.stage.setScene(scene);
		CommonStage.stage.show();

	}

}
