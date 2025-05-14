package com.example.pro;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Game {
    public final String name;
    public final Image logo;
    public final String viewPath;
    public Game(String name,Image logo,String viewPath){
        this.name = name;
        this.logo = logo;
        this.viewPath = viewPath;
    }
    public abstract void start(GameManager gameManager, BasicController controller);
}
