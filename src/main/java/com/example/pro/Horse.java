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
        boolean move = false;
        if(SchachController.board[x][y] != null){
            Piece töten = SchachController.board[x][y];
            if(töten.getBlack()&&!getBlack()||!töten.getBlack()&&getBlack()) {
                if(SchachController.board[getX()+2][getY()+1] != null){move = (x == getX()+2 && y == getY()+1);}
                if(SchachController.board[getX()+2][getY()-1] != null){move = (x == getX()+2 && y == getY()-1);}

                if(SchachController.board[getX()+1][getY()+2] != null){move = (x == getX()+1 && y == getY()+2);}
                if(SchachController.board[getX()+1][getY()-2] != null){move = (x == getX()+1 && y == getY()-2);}

                if(SchachController.board[getX()-2][getY()-1] != null){move = (x == getX()-2 && y == getY()-1);}
                if(SchachController.board[getX()-2][getY()+1] != null){move = (x == getX()-2 && y == getY()+1);}

                if(SchachController.board[getX()-1][getY()-2] != null){move = (x == getX()-1 && y == getY()-2);}
                if(SchachController.board[getX()-1][getY()+2] != null){move = (x == getX()-1 && y == getY()+2);}
            }
        }
        if(SchachController.board[getX()+2][getY()+1] == null){move = (x == getX()+2 && y == getY()+1);}
        if(SchachController.board[getX()+2][getY()-1] == null){move = (x == getX()+2 && y == getY()-1);}

        if(SchachController.board[getX()+1][getY()+2] == null){move = (x == getX()+1 && y == getY()+2);}
        if(SchachController.board[getX()+1][getY()-2] == null){move = (x == getX()+1 && y == getY()-2);}

        if(SchachController.board[getX()-2][getY()-1] == null){move = (x == getX()-2 && y == getY()-1);}
        if(SchachController.board[getX()-2][getY()+1] == null){move = (x == getX()-2 && y == getY()+1);}

        if(SchachController.board[getX()-1][getY()-2] == null){move = (x == getX()-1 && y == getY()-2);}
        if(SchachController.board[getX()-1][getY()+2] == null){move = (x == getX()-1 && y == getY()+2);}
        return move;
    }
}
