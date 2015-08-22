package builders;

import chess.Bishop;

public class BishopBuilder {

    private String cell;
    private boolean white;

    public static BishopBuilder aBishop() {
        return new BishopBuilder();
    }

    public BishopBuilder white() {
        this.white = true;
        return this;
    }

    public BishopBuilder black() {
        this.white = false;
        return this;
    }

    public BishopBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public Bishop build() {
        Bishop piece = new Bishop();
        piece.setPosition( cell );
        piece.setWhite( white );
        return piece;
    }
}
