package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AvailAirCon {
	@FXML
	private Stage stage;
	@FXML
	 private Scene scene;
	@FXML
	 private Parent root;

	public void adderscene(ActionEvent event) {
		try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightLoader.fxml"));
	        Parent root = loader.load();
	        Stage stage = new Stage();
	        stage.setTitle("Add Flights");
	        stage.setScene(new Scene(root));
	        stage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	 public void previousScene(ActionEvent event)throws Exception{	
			root = FXMLLoader.load(getClass().getResource("AviationM.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();	  
		}
	
}
