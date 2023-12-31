package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class NoticeController {
	@FXML
	private TextArea area;

	public void show(ActionEvent event) {
		try {
            FileReader fileReader = new FileReader("Notices.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            StringBuilder notif = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                notif.append(line).append("\n");
            }

            // Set the text in the TextArea
            area.setText(notif.toString());

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
