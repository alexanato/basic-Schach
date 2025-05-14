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
    private Piece[][] board = new Piece[8][8];
    @Override
    public void init(GameManager gameManager) {
        super.init(gameManager);
        context = canvas.getGraphicsContext2D();
        context.setImageSmoothing(false);
        context.drawImage(App.BLACK_KING,100,100,48,48);
        board[4][4] = new King(4,4);
        draw();
    }
    @FXML
    private void click(MouseEvent mouseEvent){
        int x = (int)mouseEvent.getX() / 50;
        int y = (int)mouseEvent.getY() / 50;
        if(selected == null&&board[x][y]!=null)selected = new int[]{x,y};
        else move(x,y);
    }
    private void move(int x , int y){
        Piece selectedPiece = board[selected[0]][selected[1]];
        System.out.println(x + " " +y);
        if(selectedPiece.isValid(x,y)){
            selectedPiece.setX(x);
            selectedPiece.setY(y);
            board[x][y] =  board[selected[0]][selected[1]];
            board[selected[0]][selected[1]] = null;
            selected = null;
            draw();
        }
    }
    private void draw(){
        for (int i = 0; i<8;i++){
            for (int j = 0; j<8;j++){
                if((i+j)%2 == 0){
                    context.setFill(Color.BLACK);
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
