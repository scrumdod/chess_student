package chess;

import java.util.ArrayList;

public class Pieces extends ArrayList<Piece> {

    public Piece getPieceWithPosition(String position) {
        for(Piece piece:this) {
            if (piece.getPosition().equalsIgnoreCase(position)) {
                return piece;
            }
        }
        return null;
    }
}
