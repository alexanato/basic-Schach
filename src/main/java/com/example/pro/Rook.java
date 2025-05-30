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

    public boolean isValid(int x, int y, boolean black) {
        boolean move = false;
        if (SchachController.board[x][y] != null) {
            Piece Töten = SchachController.board[x][y];
            if (Töten.getBlack()&&!black){
                for (int i = getY(); i < SchachController.board.length; i++) {
                    for (int j = getX(); j < SchachController.board.length; j++) {
                    move = (x == getX()+j && y == getY()+i);
                }}
            }
            if (!Töten.getBlack()&&black){
                for (int i = getY(); i > SchachController.board.length; i--) {
                    for (int j = getX(); j < x; j++) {
                        move = (x == getX()+y&& y == getY()-i);
                    }}
            }
            if (!Töten.getBlack()&&!black){
                return move;
            }
            if (Töten.getBlack()&&black){
                return move;
            }


        } else {
            move = (x == getX() && y == getY() + 1) || (x == getX() && y == getY() + 2) || (x == getX() && y == getY() + 3) || (x == getX() && y == getY() + 4) || (x == getX() && y == getY() + 5) || (x == getX() && y == getY() + 6) || (x == getX() && y == getY() + 7) || (x == getX() && y == getY() - 1) || (x == getX() && y == getY() - 2) || (x == getX() && y == getY() - 3) || (x == getX() && y == getY() - 4) || (x == getX() && y == getY() - 5) || (x == getX() && y == getY() - 6) || (x == getX() && y == getY() - 7) || (x == getX() + 1 && y == getY()) || (x == getX() + 2 && y == getY()) || (x == getX() + 3 && y == getY()) || (x == getX() + 4 && y == getY()) || (x == getX() + 5 && y == getY()) || (x == getX() + 6 && y == getY()) || (x == getX() + 7 && y == getY()) || (x == getX() - 1 && y == getY()) || (x == getX() - 2 && y == getY()) || (x == getX() - 3 && y == getY()) || (x == getX() - 4 && y == getY()) || (x == getX() - 5 && y == getY()) || (x == getX() - 6 && y == getY()) || (x == getX() - 7 && y == getY());
        }
        return move;
    }
}
