package builders;

import chess.Pawn;

public class PawnBuilder {

    private String cell;
    private boolean white;

    public static PawnBuilder aPawn() {
        return new PawnBuilder();
    }
    
    public PawnBuilder white() {
        this.white = true;
        return this;
    }

    public PawnBuilder black() {
        this.white = false;
        return this;
    }

    public PawnBuilder on(String cell) {
        this.cell = cell;
        return this;
    }

    public Pawn build() {
        Pawn pawn = new Pawn();
        pawn.setPosition( cell );
        pawn.setWhite( white );
        return pawn;
    }

}
