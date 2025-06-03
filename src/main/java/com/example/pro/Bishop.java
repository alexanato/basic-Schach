package com.example.pro;

public class Bishop extends Piece{
    public Bishop(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_BISHOP);
        }
        else{
            setSprite(App.WHITE_BISHOP);
        }
    }
    public boolean isValid(int x, int y, boolean black){
        boolean move = false;
        Piece töten = SchachController.board[x][y];
        if (SchachController.board[x][y] != null) {
            for (int i = 0; i < SchachController.board.length; i++) {
                if(töten.getBlack()&&!getBlack()||!töten.getBlack()&&getBlack()) {
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
                else{
                    return move;
                }
            }
        }
        else{
            for (int i = 0; i < SchachController.board.length; i++) {
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
