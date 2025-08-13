package com.example.addressbook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea termsAndConditions;

    @FXML public void initialize(){
        termsAndConditions.setText("""
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR LOREM IPSUM DOLOR
                """);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Address Book Application!");
    }
}