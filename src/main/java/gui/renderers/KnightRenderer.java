package gui.renderers;

import chess.Piece;

public class KnightRenderer extends PieceRenderer {

    public KnightRenderer(Piece piece) {
        super(piece);
    }

    @Override
    public String toString() {
        return "knight";
    }
}
