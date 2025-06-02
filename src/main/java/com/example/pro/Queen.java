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
    public boolean isValid(int x, int y, boolean black){
        boolean move = false;
        Bishop b = new Bishop(x,y,black);
        Rook r = new Rook(x,y,black);
        if(r.isValid(x,y,black) || b.isValid(x,y,black)){
            move = true;
        }
        return move;
    }
}
