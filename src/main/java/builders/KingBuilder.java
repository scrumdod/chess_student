package builders;

import chess.King;

public class KingBuilder {

    private String cell;
    private boolean white;

    public static KingBuilder aKing() {
        return new KingBuilder();
    }

    public KingBuilder white() {
        this.white = true;
        return this;
    }

    public KingBuilder black() {
        this.white = false;
        return this;
    }

    public KingBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public King build() {
        King piece = new King();
        piece.setPosition( cell );
        piece.setWhite( white );
        return piece;
    }
}
