package com.example.pro;

public class King extends Piece{
    public King(int x, int y, boolean black) {
        super(x, y,black);
        if (getBlack()){
            setSprite(App.BLACK_KING);
        }
        else {
            setSprite(App.WHITE_KING);
        }

    }

    @Override
    public boolean isValid(int x,int y, boolean black) {
        return (x == getX()+1&&y==getY()+1)||(x == getX()+1&&y==getY()-1)||(x == getX()-1&&y==getY()+1)||(x == getX()-1&&y==getY()-1)||(x == getX()&&y==getY()+1)||(x == getX()&&y==getY()-1)||(x == getX()+1&&y==getY())||(x == getX()-1&&y==getY());
    }
}
