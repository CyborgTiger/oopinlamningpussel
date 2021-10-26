package com.example.javafxtests;

import java.util.ArrayList;
import java.util.Collections;

public class BackendGameBoard {
    ArrayList<Piece> pieces = new ArrayList<>();
    int boardWidth = 4;
    public BackendGameBoard() {
        for (int i = 0; i < boardWidth*2; i++) {
            pieces.add(new Piece(i, 0));
        }
        Collections.shuffle(pieces);
        for (int i = 0; i < pieces.size(); i++) {
            pieces.get(i).setPosition(i);
        }
        System.out.println(pieces);
    }

    public void MovePiece(int positionFrom, int positionTo){
        for (Piece piece : pieces) {
            if (piece.getPosition() == positionFrom) {
                piece.setPosition(positionTo);
            }
        }
    }

    public boolean LegalMove(int positionFrom){
        //find empty space
        int emptyPiecePosition = -1;
        for (Piece piece : pieces) {
            if (piece.getValue() == 0) {
                emptyPiecePosition = piece.getPosition();
            }
        }
        //check legal move (+-boardWidth / +-1 position)
        if (positionFrom == emptyPiecePosition - 1 || positionFrom == emptyPiecePosition + 1 || positionFrom == emptyPiecePosition + boardWidth || positionFrom == emptyPiecePosition - boardWidth){
            return true;
        }
        return false;
    }

    public boolean GameWon(){
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getPosition() != i || pieces.get(i).getValue() != i){
                return false;
            }
        }
        return true;
    }
}
