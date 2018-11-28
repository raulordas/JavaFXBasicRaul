package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class BlurController {
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private Button btnBlur;
	
	@FXML
	private Button btnSalir;
	
	public void clickbtnBlur() {
		System.out.println("hola");
		imageView.setEffect(new GaussianBlur(30));
	}
	
	public void salir() {
		System.exit(0);
	}
}
