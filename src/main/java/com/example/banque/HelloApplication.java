package com.example.banque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //public static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 843, 483);
        stage.setTitle("Welcome page");
        stage.setScene(scene);
        stage.show();


   /* public void ChangeScene(String xml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource((xml)));
        stg.getScene().setRoot(root);*/
    }



    public static void main(String[] args) {
        launch();

    }
}