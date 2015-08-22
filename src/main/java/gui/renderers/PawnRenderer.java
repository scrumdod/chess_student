package gui.renderers;

import chess.Piece;

public class PawnRenderer extends PieceRenderer {

    public PawnRenderer(Piece piece) {
        super( piece );
    }

    public String toString() {
        return "pawn";
    }

}
