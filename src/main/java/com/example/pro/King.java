package com.example.pro;

public class King extends Piece{
    public King(int x, int y) {
        super(x, y);
        setSprite(App.BLACK_KING);
    }

    @Override
    public boolean isValid(int x,int y) {
        return (x == getX()+1&&y==getY()+1)||(x == getX()+1&&y==getY()-1)||(x == getX()-1&&y==getY()+1)||(x == getX()-1&&y==getY()-1);
    }
}
