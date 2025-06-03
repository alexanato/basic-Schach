package com.example.pro;
import javafx.scene.image.Image;

public class Schach extends Game{

    private SchachController controller;
    public Schach(String name, String viewPath) {
        super(name, viewPath);
    }

    @Override
    public void start(GameManager gameManager, BasicController controller) {
        this.controller = (SchachController) controller;
        this.controller.setModel(new SchachModel());
        this.controller.start();
    }
}
