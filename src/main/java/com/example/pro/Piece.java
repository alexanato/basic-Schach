package com.example.pro;

import javafx.scene.image.Image;

public class Piece {
    private Image sprite;
    private int x;
    private int y;
    private boolean black;
    public boolean isValid(int x,int y, boolean black) {
            return false;
    }
    public Piece(int x,int y, boolean black) {
        this.x =x;
        this.y =y;
        this.black = black;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getBlack(){return black;}

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

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }
}
