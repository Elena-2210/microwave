package com.example.microwave;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MicrowaveController implements Initializable {

    private final MicrowaveModel model = new MicrowaveModel();
    @FXML
    private Text timer;
    @FXML
    private ImageView freshChickenPicture;
    @FXML
    private ImageView wellDoneChickenPicture;
    @FXML
    private ImageView firedChickenPicture;
    @FXML
    private Shape openedDoor;
    @FXML
    private Shape closedDoor;

    @FXML
    public void plus1MinuteTimer() {

    }

    @FXML
    public void plus10MinuteTimer() {

    }


    @FXML
    public void openDoor() {
        closedDoor.setVisible(false);
        openedDoor.setVisible(true);
    }

    @FXML
    public void closeDoor() {
        closedDoor.setVisible(true);
        openedDoor.setVisible(false);
    }



    @FXML
    public void putChicken() {
        model.getContainer().openDoor();
        model.getContainer().putChicken();
        model.getContainer().closeDoor();
        if (model.getContainer().isChickenInside()) {
            freshChickenPicture.setVisible(true);
        }
    }

    @FXML
    public void extractChicken() {
        model.getContainer().openDoor();
        model.getContainer().extractChicken();
        model.getContainer().closeDoor();
        if (model.getContainer().isChickenInside()) {
            clearContainer();
        }
    }

    private void showChickenWellDone() {
        if (model.getContainer().isChickenInside() && model.getContainer().isChickenWellDone()) {
            clearContainer();
            wellDoneChickenPicture.setVisible(true);
        }
    }

    private void showChickenFired() {
        if (model.getContainer().isChickenInside() && model.getContainer().isChickenFired()) {
            clearContainer();
            wellDoneChickenPicture.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.setDefaultState();
        timer.setText(String.format("%02d:%02d", model.getTimer().getMinutes(), model.getTimer().getSeconds()));
        freshChickenPicture.setVisible(false);
    }

    private void clearContainer() {
        freshChickenPicture.setVisible(false);
        wellDoneChickenPicture.setVisible(false);
        firedChickenPicture.setVisible(false);
    }

    @FXML
    public void plus10Seconds() {
    }

    @FXML
    public void startHeating() {
    }

    @FXML
    public void stopHeating() {
    }

    @FXML
    public void resetTimer() {
    }
}