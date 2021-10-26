package com.example.javafxtests;

import java.util.ArrayList;
import java.util.Collections;

public class BackendGameBoard {
    ArrayList<Piece> pieces = new ArrayList<>();
    public BackendGameBoard() {
        for (int i = 0; i < 16; i++) {
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
        //check legal move (+-4 / +-1 position) only works for 4x4 grid MIGHT NEED CHANGE !!! posi
        if (positionFrom == emptyPiecePosition - 1 || positionFrom == emptyPiecePosition + 1 || positionFrom == emptyPiecePosition + 4 || positionFrom == emptyPiecePosition - 4){
            return true;
        }
        return false;
    }
}
