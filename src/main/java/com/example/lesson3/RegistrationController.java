package com.example.lesson3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public  class RegistrationController  implements Initializable {

    @FXML
    private ComboBox<String> ComboBox, ComboBoxgr;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String choose_classroom[] = {"202", "203", "204", "205", "206",};
        ObservableList<String> data = FXCollections.observableArrayList(choose_classroom);
        ComboBox.setItems(data);

        String choose_group[] = {"3B", "3G", "3E", "4G", "4H",};
        ObservableList<String> data1 = FXCollections.observableArrayList(choose_group);
        ComboBoxgr.setItems(data1);
    }


    @FXML
    TextField nameTextField, surTextField, emailTextField, numberTextField, passTextField;
    @FXML
    Button registerButton, cancelButton;

    @FXML
    protected void CancelOnClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 356, 410);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    protected void registerButtonClicked(ActionEvent event) {
        registerButton.setText("Clicked");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Welcome to Application");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


        String comboBoxText = ComboBox.getValue();
        System.out.println(comboBoxText);
    }

}
