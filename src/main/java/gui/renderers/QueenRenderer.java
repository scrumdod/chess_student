package gui.renderers;

import chess.Piece;

public class QueenRenderer extends PieceRenderer {

    public QueenRenderer(Piece piece) {
        super( piece );
    }

    public String toString() {
        return "queen";
    }

}
