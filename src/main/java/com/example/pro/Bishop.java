package com.example.pro;

public class Bishop extends Piece{
    public Bishop(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_BISHOP);
        }
        else{
            setSprite(App.WHITE_BISHOP);
        }
    }
}
