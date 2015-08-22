package builders;

import chess.Queen;

public class QueenBuilder {

    private String cell;
    private boolean white;

    public static QueenBuilder aQueen() {
        return new QueenBuilder();
    }

    public QueenBuilder white() {
        this.white = true;
        return this;
    }

    public QueenBuilder black() {
        this.white = false;
        return this;
    }

    public QueenBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public Queen build() {
        Queen queen = new Queen();
        queen.setPosition( cell );
        queen.setWhite( white );
        return queen;
    }

}
