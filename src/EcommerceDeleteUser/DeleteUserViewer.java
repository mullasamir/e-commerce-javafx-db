package EcommerceDeleteUser;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import StageHolder.CommonStage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteUserViewer {
	
	
	public static void show() throws IOException {

		URL fxmlurl = Paths
				.get("C:/Users/91853/eclipse-workspace/Ecommerce_javafx/src/EcommerceDeleteUser/DeleteUser.fxml")
				.toUri().toURL();
		Parent actorGroup = FXMLLoader.load(fxmlurl);
		CommonStage.stage.setTitle("Delete User");
		Scene scene = new Scene(actorGroup, 600, 400);
		CommonStage.stage.setScene(scene);
		CommonStage.stage.show();

	}

}
