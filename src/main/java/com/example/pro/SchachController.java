package com.example.pro;

import com.example.pro.BasicController;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class SchachController extends BasicController {
    private SchachModel model;
    @FXML
    private Canvas canvas;
    private GraphicsContext context;
    public void setModel(SchachModel model){
        this.model = model;
    }
    private int[] selected;
    public static Piece[][] board = new Piece[8][8];
    @Override
    public void init(GameManager gameManager) {
        super.init(gameManager);
        context = canvas.getGraphicsContext2D();
        context.setImageSmoothing(false);
        context.drawImage(App.BLACK_KING,100,100,48,48);
        context.drawImage(App.BLACK_PAWN,100,100,48,48);
        context.drawImage(App.WHITE_PAWN,100,100,48,48);
        for (int i = 0; i < 8; i++) {
            board [i][6] = new Pawn(i, 6, true);
        }
        for (int i = 0; i < 8 ; i++){
            board [i][1] = new Pawn(i, 1, false);
        }
        board[4][7] = new King(4,7, true);
        board[4][0] = new King(4,0, false);
        board[3][7] = new Queen(3,7, true);
        board[3][0] = new Queen(3,0, false);
        board[2][7] = new Bishop(2,7, true);
        board[2][0] = new Bishop(2,0, false);
        board[5][7] = new Bishop(5,7, true);
        board[5][0] = new Bishop(5,0, false);
        board[1][7] = new Horse(1,7, true);
        board[1][0] = new Horse(1,0, false);
        board[6][7] = new Horse(6,7, true);
        board[6][0] = new Horse(6,0, false);
        board[7][7] = new Rook(7,7, true);
        board[7][0] = new Rook(7,0, false);
        board[0][7] = new Rook(0,7, true);
        board[0][0] = new Rook(0,0, false);
        draw();
    }
    @FXML
    private void click(MouseEvent mouseEvent){
        int x = (int)mouseEvent.getX() / 50;
        int y = (int)mouseEvent.getY() / 50;
        if(selected == null&&board[x][y]!=null)selected = new int[]{x,y};
        else move(x,y, true);
    }
    private void move(int x , int y, boolean black){
        if(selected == null){
            return;
        }
        Piece selectedPiece = board[selected[0]][selected[1]];
        System.out.println(x + " " +y);
        if(selectedPiece.isValid(x,y, black)){
            selectedPiece.setX(x);
            selectedPiece.setY(y);
            board[x][y] =  board[selected[0]][selected[1]];
            board[selected[0]][selected[1]] = null;
            selected = null;
            draw();
        }
        else {
            selected = null;
        }
    }
    private void draw(){
        for (int i = 0; i<8;i++){
            for (int j = 0; j<8;j++){
                if((i+j)%2 == 0){
                    context.setFill(Color.DARKGRAY);
                    context.fillRect(i*50,j*50,50,50);
                }
                else {
                    context.setFill(Color.WHITE);
                    context.fillRect(i*50,j*50,50,50);
                }
                if(board[i][j] != null){
                    context.drawImage(board[i][j].getSprite(),i*50,j*50,50,50);
                }
            }
        }
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {

    }
}
