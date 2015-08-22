package builders;

import chess.Knight;

public class KnightBuilder {

    private String cell;
    private boolean white;

    public static KnightBuilder aKnight() {
        return new KnightBuilder();
    }

    public KnightBuilder white() {
        this.white = true;
        return this;
    }

    public KnightBuilder black() {
        this.white = false;
        return this;
    }

    public KnightBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public Knight build() {
        Knight piece = new Knight();
        piece.setPosition( cell );
        piece.setWhite( white );
        return piece;
    }
}
