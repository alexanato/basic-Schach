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
            for(int i = 0; i < SchachController.board.length; i++) {
                if (Töten.getBlack() && !black || !Töten.getBlack() && black) {
                    if (x == getX() + i && y == getY()) {
                        move = (x == getX() + i && y == getY());
                    }
                    if (x == getX() - i && y == getY()) {
                        move = (x == getX() - i && y == getY());
                    }
                    if (x == getX() && y == getY() + i) {
                        move = (x == getX() && y == getY() + i);
                    }
                    if (x == getX() && y == getY() - i) {
                        move = (x == getX() && y == getY() - i);
                    }
                } else {
                    return move;
                }
            }


        } else {
            for(int i = 0; i < SchachController.board.length; i++) {
                if (x == getX() + i && y == getY()) {
                    move = (x == getX() + i && y == getY());
                }
                if (x == getX() - i && y == getY()) {
                    move = (x == getX() - i && y == getY());
                }
                if (x == getX() && y == getY() + i) {
                    move = (x == getX() && y == getY() + i);
                }
                if (x == getX() && y == getY() - i) {
                    move = (x == getX() && y == getY() - i);
                }
            }

            //move = (x == getX() && y == getY() + 1) || (x == getX() && y == getY() + 2) || (x == getX() && y == getY() + 3) || (x == getX() && y == getY() + 4) || (x == getX() && y == getY() + 5) || (x == getX() && y == getY() + 6) || (x == getX() && y == getY() + 7) || (x == getX() && y == getY() - 1) || (x == getX() && y == getY() - 2) || (x == getX() && y == getY() - 3) || (x == getX() && y == getY() - 4) || (x == getX() && y == getY() - 5) || (x == getX() && y == getY() - 6) || (x == getX() && y == getY() - 7) || (x == getX() + 1 && y == getY()) || (x == getX() + 2 && y == getY()) || (x == getX() + 3 && y == getY()) || (x == getX() + 4 && y == getY()) || (x == getX() + 5 && y == getY()) || (x == getX() + 6 && y == getY()) || (x == getX() + 7 && y == getY()) || (x == getX() - 1 && y == getY()) || (x == getX() - 2 && y == getY()) || (x == getX() - 3 && y == getY()) || (x == getX() - 4 && y == getY()) || (x == getX() - 5 && y == getY()) || (x == getX() - 6 && y == getY()) || (x == getX() - 7 && y == getY());
        }
        return move;
    }
}
