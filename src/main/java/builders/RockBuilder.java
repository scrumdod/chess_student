package builders;

import chess.Roock;

public class RockBuilder {

    private String cell;
    private boolean white;

    public static RockBuilder aRoock() {
        return new RockBuilder();
    }

    public RockBuilder white() {
        this.white = true;
        return this;
    }

    public RockBuilder black() {
        this.white = false;
        return this;
    }

    public RockBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public Roock build() {
        Roock piece = new Roock();
        piece.setPosition( cell );
        piece.setWhite( white );
        return piece;
    }

}
