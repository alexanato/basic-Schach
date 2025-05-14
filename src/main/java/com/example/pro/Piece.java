package com.example.pro;

import javafx.scene.image.Image;

public class Piece {
    private Image sprite;
    private int x;
    private int y;
    public boolean isValid(int x,int y) {
        return false;
    }
    public Piece(int x,int y){
        this.x =x;
        this.y =y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }
}
