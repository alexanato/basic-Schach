package com.example.pro;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    public static Image BLACK_KING = load("black_king.png");
    public static Image BLACK_PAWN = load("black_pawn.png");
    public static Image WHITE_PAWN = load("white_pawn.png");
    public static Image WHITE_KING = load("white_king.png");
    public static Image WHITE_QUEEN = load("white_queen.png");
    public static Image BLACK_QUEEN = load("black_queen.png");
    public static Image BLACK_BISHOP = load("black_bishop.png");
    public static Image WHITE_BISHOP = load("white_bishop.png");
    public static Image BLACK_HORSE = load("black_knight.png");
    public static Image WHITE_HORSE = load("white_knight.png");
    public static Image BLACK_ROOK = load("black_rook.png");
    public static Image WHITE_ROOK = load("white_rook.png");

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
