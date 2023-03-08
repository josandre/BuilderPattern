package com.example.builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 689, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        mainScene = scene;
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public static void changeScene(String sceneName) throws IOException {
        String scene = sceneName + ".fxml";
        Parent parent = null;
        parent = FXMLLoader.load(Main.class.getResource(scene));
        mainScene.setRoot(parent);
    }
}