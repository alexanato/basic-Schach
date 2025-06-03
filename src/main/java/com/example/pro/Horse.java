package com.example.pro;

public class Horse extends Piece{
    public Horse(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_HORSE);
        }
        else{
            setSprite(App.WHITE_HORSE);
        }
    }
    public boolean isValid(int x,int y, boolean black){
        boolean move=false;
        if(x<=8&&y<=8){
            if(SchachController.board[x][y]!= null){
                Piece Töten = SchachController.board[x][y];
                if(!Töten.getBlack()&&getBlack()||Töten.getBlack()&&!getBlack()) {
                    move = (x == getX()+1&&y==getY()-2)||(x == getX()+2&&y==getY()-1)||
                            (x == getX()+2&&y==getY()+1)||(x == getX()+1&&y==getY()+2)||
                            (x == getX()-1&y==getY()-2)||(x == getX()-2&&y==getY()-1)||
                            (x == getX()-2&&y==getY()+1)||(x == getX()-1&&y==getY()+2);

                }
            }
            else{
                move = (x == getX()+1&&y==getY()-2)||(x == getX()+2&&y==getY()-1)||
                        (x == getX()+2&&y==getY()+1)||(x == getX()+1&&y==getY()+2)||
                        (x == getX()-1&y==getY()-2)||(x == getX()-2&&y==getY()-1)||
                        (x == getX()-2&&y==getY()+1)||(x == getX()-1&&y==getY()+2);
            }
        }
        return move;
    }}
