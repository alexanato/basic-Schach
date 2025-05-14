package com.example.pro;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    public static Image BLACK_KING = load("black_king.png");
    @Override
    public void start(Stage primaryStage) {
        GameManager manager = new GameManager(primaryStage);
        manager.addGame(new Schach("Schach",null,"Schach.fxml"));
        manager.launch(0);
        primaryStage.setTitle("Meine erste JavaFX-App");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    private static Image load(String resourcePath) {
        return new Image(
                Objects.requireNonNull(App.class.getResourceAsStream(resourcePath))
        );
    }
    public static void main(String[] args) {
        launch(args);
    }
}
