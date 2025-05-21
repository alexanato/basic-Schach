package com.example.pro;

public class Pawn extends Piece {
    public Pawn(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_PAWN);
        }
        else{
            setSprite(App.WHITE_PAWN);
        }
    }

    public boolean isValid(int x, int y,boolean black){
        boolean move = false;
       if(SchachController.board[x][y]!= null){
            Piece Töten = SchachController.board[x][y];
            if(!Töten.getBlack()&&black) {
                move = (x == getX()+1 && y == getY() - 1||x == getX()-1 && y == getY() - 1);
            }
            else if(Töten.getBlack()&&!black){
                move = (x == getX()+1 && y == getY() + 1||x == getX()-1 && y == getY() + 1);
            }
        }
       else if(getBlack()){
                if (getY() == 6) {
                    if(SchachController.board[getX()][getY()-1] == null){
                        if(SchachController.board[getX()][getY()-2] == null) {
                            move = (x == getX() && y == getY() - 2||x == getX() && y == getY() - 1);
                        }
                        else {
                            move = (x == getX() && y == getY() - 1);
                        }
                    }
                    else{
                        return move;
                    }

                } else {
                    if (SchachController.board[getX()][getY()-1] == null) {
                       move = (x == getX() && y == getY() - 1);
                    }
                    else {
                        return move;
                    }
                }
        }
        else{
            if (getY() == 1) {
                if(SchachController.board[getX()][getY()+1] == null){
                    if(SchachController.board[getX()][getY()+2] == null) {
                        move = (x == getX() && y == getY() + 2||x == getX() && y == getY() + 1);
                    }
                    else {
                        move = (x == getX() && y == getY() + 1);
                    }
                }
                else{
                    return move;
                }

            } else {
                if (SchachController.board[getX()][getY()+1] == null) {
                    move = (x == getX() && y == getY() + 1);
                }
                else {
                    return move;
                }
            }

        }
        return move;
    }
}
