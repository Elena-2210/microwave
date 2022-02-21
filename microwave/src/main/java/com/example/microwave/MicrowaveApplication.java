package com.example.microwave;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MicrowaveApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MicrowaveApplication.class.getResource("hello-view.fxml"));
        System.out.println("fxmlLoader = " + fxmlLoader);
        Scene scene = new Scene(fxmlLoader.load(), 622, 342);
        System.out.println("scene = " + scene);
        stage.setTitle("Microwave Application!");
        stage.setScene(scene);
        stage.setResizable(false);
        System.out.println("scene = " + scene);
        stage.show();
        System.out.println("scene = " + scene);
    }

    public static void main(String[] args) {
        launch();
    }
}