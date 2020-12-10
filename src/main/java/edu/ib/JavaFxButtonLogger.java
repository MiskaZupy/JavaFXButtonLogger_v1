package edu.ib;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class JavaFxButtonLogger {

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/logger.fxml"));
        Scene scene= new Scene(root,800,600);
        stage.setScene(scene);
        stage.show();


    }
}
