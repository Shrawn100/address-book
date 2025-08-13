package com.example.addressbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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


    @FXML private CheckBox agreeCheckBox;

    @FXML private Button nextButton;

    @FXML
    protected void onAgreeCheckBoxClick(){
        boolean accepted= agreeCheckBox.isSelected();

        nextButton.setDisable(!accepted);
    }

    @FXML protected void onNextButtonClick()throws IOException {
        Stage stage= (Stage) nextButton.getScene().getWindow();

        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(),640,360);
        stage.setScene(scene);
    }




}