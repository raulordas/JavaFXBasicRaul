package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private AnchorPane mypane;
	
	@Override
	public void start(Stage stage) {
		
		//primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/VistaPrincipal.fxml"));
		
		try {
			//Sobre el atributo panel mypane cargamos el FxmlLoader
			mypane = (AnchorPane) loader.load();
			//Asignamos al stage el titulo, y la escena con el panel mypane y lo mostramos
			stage.setTitle("PRIMERA APLICACION");
			stage.setScene(new Scene(mypane));
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
