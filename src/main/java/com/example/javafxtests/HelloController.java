package com.example.javafxtests;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void onNewGame() {System.out.println("Hej");}


    @FXML
    protected void onPieceCliked() {System.out.println("banana");}
}