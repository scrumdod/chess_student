package gui.renderers;

import chess.Piece;

public class BishopRenderer extends PieceRenderer {

    public BishopRenderer(Piece piece) {
        super(piece);
    }

    public String toString() {
        return "bishop";
    }
}
