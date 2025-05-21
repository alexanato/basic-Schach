package com.example.pro;

public class Horse extends Piece{
    public Horse(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_HORSE);
        }
        else{
            setSprite(App.WHITE_HORSE);
        }
    }
}
