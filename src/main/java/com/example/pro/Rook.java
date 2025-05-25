package com.example.pro;

public class Rook extends Piece {
    public Rook(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_ROOK);
        }
        else{
            setSprite(App.WHITE_ROOK);
        }
    }

}
