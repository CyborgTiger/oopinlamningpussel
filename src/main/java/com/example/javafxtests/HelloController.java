package com.example.javafxtests;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    protected void onNewGame() {System.out.println("Hej");}


    @FXML
    protected void onPieceCliked(ActionEvent event) {
        int row = GridPane.getRowIndex((Node) event.getSource());
        int column = GridPane.getColumnIndex((Node) event.getSource());
        System.out.println(row);
        System.out.println(column);
    }
}