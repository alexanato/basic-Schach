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
        boolean move = false;
        if(SchachController.board[x][y]!= null){
            Piece Töten = SchachController.board[x][y];
            if(!Töten.getBlack()&&black) {
                move = (x == getX() + 1 && y == getY() + 1) || (x == getX() + 1 && y == getY() - 1) || (x == getX() - 1 && y == getY() + 1) || (x == getX() - 1 && y == getY() - 1) || (x == getX() && y == getY() + 1) || (x == getX() && y == getY() - 1) || (x == getX() + 1 && y == getY()) || (x == getX() - 1 && y == getY());
            }
            else if(Töten.getBlack()&&!black){
                move = (x == getX() + 1 && y == getY() + 1) || (x == getX() + 1 && y == getY() - 1) || (x == getX() - 1 && y == getY() + 1) || (x == getX() - 1 && y == getY() - 1) || (x == getX() && y == getY() + 1) || (x == getX() && y == getY() - 1) || (x == getX() + 1 && y == getY()) || (x == getX() - 1 && y == getY());
            }
            else if(Töten.getBlack()&& black){
                return move;
            }
            else if (!Töten.getBlack() && !black){
                return move;
            }
        }
        else
        {
            move = (x == getX() + 1 && y == getY() + 1) || (x == getX() + 1 && y == getY() - 1) || (x == getX() - 1 && y == getY() + 1) || (x == getX() - 1 && y == getY() - 1) || (x == getX() && y == getY() + 1) || (x == getX() && y == getY() - 1) || (x == getX() + 1 && y == getY()) || (x == getX() - 1 && y == getY());
        }
            return move;
    }
}
