package com.example.pro;

public class Queen extends Piece {
    public Queen(int x, int y, boolean black) {
        super(x, y, black);
        if (getBlack()) {
            setSprite(App.BLACK_QUEEN);
        } else {
            setSprite(App.WHITE_QUEEN);
        }
    }

    public boolean isValid(int x, int y, boolean black) {
        boolean move = false;
        if (SchachController.board[x][y] != null) {
            Piece Töten = SchachController.board[x][y];
            if (Töten.getBlack() && !getBlack() || !Töten.getBlack() && getBlack()) {
                for (int i = 0; i < SchachController.board.length; i++) {
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
                    if (x == getX() + i && y == getY() + i) {
                        move = (x == getX() + i && y == getY() + i);
                    }
                    if (x == getX() + i && y == getY() - i) {
                        move = (x == getX() + i && y == getY() - i);
                    }
                    if (x == getX() - i && y == getY() + i) {
                        move = (x == getX() - i && y == getY() + i);
                    }
                    if (x == getX() - i && y == getY() - i) {
                        move = (x == getX() - i && y == getY() - i);
                    }
                }
            }
        } else {
            for (int i = 0; i < SchachController.board.length; i++) {
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
                if (x == getX() + i && y == getY() + i) {
                    move = (x == getX() + i && y == getY() + i);
                }
                if (x == getX() + i && y == getY() - i) {
                    move = (x == getX() + i && y == getY() - i);
                }
                if (x == getX() - i && y == getY() + i) {
                    move = (x == getX() - i && y == getY() + i);
                }
                if (x == getX() - i && y == getY() - i) {
                    move = (x == getX() - i && y == getY() - i);
                }
            }
        }
        return move;
    }
}
