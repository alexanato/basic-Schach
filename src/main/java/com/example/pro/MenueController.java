package com.example.pro;

import javafx.event.ActionEvent;

public class MenueController {
    public void schachClick(ActionEvent e){
        System.out.println("Schach Click in MenueController");
        App.showSchach();
    }
}
