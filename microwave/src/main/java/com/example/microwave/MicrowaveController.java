package com.example.microwave;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;
import lombok.SneakyThrows;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

public class MicrowaveController implements Initializable {

    private final MicrowaveModel model = new MicrowaveModel();
    @FXML
    private Text timerText;
    @FXML
    private ImageView freshChickenPicture;
    @FXML
    private ImageView wellDoneChickenPicture;
    @FXML
    private ImageView firedChickenPicture;
    @FXML
    private Shape openedDoorPicture;
    @FXML
    private Shape closedDoorPicture;
    @FXML
    private Button addOneMinuteTimerButton;
    @FXML
    private Button addTenSecondsTimerButton;
    @FXML
    private Button openDoorButton;
    @FXML
    private Button closeDoorButton;
    @FXML
    private Button putChickenButton;
    @FXML
    private Button extractChickenButton;
    @FXML
    private Button startButton;
    @FXML
    private Button stopButton;
    @FXML
    private Button resetButton;
    private Timeline timeline;

    @FXML
    public void addOneMinuteTimer() {
        model.getTimer().addOneMinute();
    }

    @FXML
    public void addTenSecondsTimer() {
        model.getTimer().addTenSeconds();
    }


    @FXML
    public void openDoor() {
        closedDoorPicture.setVisible(false);
        openedDoorPicture.setVisible(true);
        closeDoorButton.setDisable(false);
        openDoorButton.setDisable(true);
    }

    @FXML
    public void closeDoor() {
        closedDoorPicture.setVisible(true);
        openedDoorPicture.setVisible(false);
        closeDoorButton.setDisable(true);
        openDoorButton.setDisable(false);
    }


    @FXML
    public void putChicken() {
        model.getContainer().openDoor();
        model.getContainer().putChicken();
        model.getContainer().closeDoor();
        if (model.getContainer().isChickenInside()) {
            showChickenFresh();
            putChickenButton.setDisable(true);
            extractChickenButton.setDisable(false);
        }
    }

    private void showChickenFresh() {
        freshChickenPicture.setVisible(true);
    }

    @FXML
    public void extractChicken() {
        model.getContainer().openDoor();
        model.getContainer().extractChicken();
        model.getContainer().closeDoor();
        if (model.getContainer().isChickenInside()) {
            clearContainer();
            putChickenButton.setDisable(false);
            extractChickenButton.setDisable(true);
        }
    }

    private void showChickenWellDonePicture() {
        if (model.getContainer().isChickenInside() && model.getContainer().isChickenWellDone()) {
            clearContainer();
            wellDoneChickenPicture.setVisible(true);
        }
    }

    private void showChickenFiredPicture() {
        if (model.getContainer().isChickenInside() && model.getContainer().isChickenFired()) {
            clearContainer();
            wellDoneChickenPicture.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.setDefaultState();
        timerText.setText(String.format("%s:%s", getMinutesForView(), getSecondsForView()));
    }

    private String getSecondsForView() {
        return Optional.ofNullable(model.getTimer().getSeconds())
                .map(v -> String.format("%2d", v))
                .orElse("--");
    }

    private String getMinutesForView() {
        return Optional.ofNullable(model.getTimer().getMinutes())
                .map(v -> String.format("%2d", v))
                .orElse("--");
    }

    private void clearContainer() {
        freshChickenPicture.setVisible(false);
        wellDoneChickenPicture.setVisible(false);
        firedChickenPicture.setVisible(false);
    }

    @FXML
    public void startHeating() {
        startButton.setDisable(true);
        stopButton.setDisable(false);
    }

    @FXML
    public void stopHeating() {
        startButton.setDisable(false);
        stopButton.setDisable(true);
    }

    @SneakyThrows
    @FXML
    public void resetTimer() {
        AtomicInteger skipKeyframes = new AtomicInteger(1);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(3), actionEvent -> {
            timerText.setText("");
            if (skipKeyframes.get() > 0) {
                skipKeyframes.decrementAndGet();
            } else {
                timeline.stop();
            }
        });
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
        timerText.setText("--:--");
    }
}