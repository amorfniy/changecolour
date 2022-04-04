package com.example.changecolour;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Button colourButton;

    @FXML
    private VBox box;


    @FXML
    protected void onClick() {
        box.setStyle("-fx-background-color: blue");
    }
}