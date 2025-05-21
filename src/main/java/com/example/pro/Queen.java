package com.example.pro;

public class Queen extends Piece{
    public Queen(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_QUEEN);
        }
        else{
            setSprite(App.WHITE_QUEEN);
        }
    }
}
