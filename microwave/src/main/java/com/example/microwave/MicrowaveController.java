package com.example.microwave;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MicrowaveController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}