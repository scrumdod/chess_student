package chess.rules;

import chess.*;
import imhotep.Imhotep;
import org.junit.Before;
import org.junit.Test;
import support.PieceTester;

import java.util.Collections;

import static chess.rules.InitialPositions.initialPositions;

@Imhotep(level="Domain")
public class InitialPositionsTest {

    private Pieces pieces;

    @Before
    public void
    TheInitialPositions() {
        pieces = new Pieces();
        Collections.addAll(pieces, initialPositions());
    }

    @Test public void
    WhitePiecesAreAtTheRightPositionsOnLines1And2() {
        PieceAt("a1").IsWhite().IsA(Roock.class);
        PieceAt("b1").IsWhite().IsA(Knight.class);
        PieceAt("c1").IsWhite().IsA(Bishop.class);
        PieceAt("d1").IsWhite().IsA(Queen.class);
        PieceAt("e1").IsWhite().IsA(King.class);
        PieceAt("f1").IsWhite().IsA(Bishop.class);
        PieceAt("g1").IsWhite().IsA(Knight.class);
        PieceAt("h1").IsWhite().IsA(Roock.class);

        PieceAt("a2").IsWhite().IsA(Pawn.class);
        PieceAt("b2").IsWhite().IsA(Pawn.class);
        PieceAt("c2").IsWhite().IsA(Pawn.class);
        PieceAt("d2").IsWhite().IsA(Pawn.class);
        PieceAt("e2").IsWhite().IsA(Pawn.class);
        PieceAt("f2").IsWhite().IsA(Pawn.class);
        PieceAt("g2").IsWhite().IsA(Pawn.class);
        PieceAt("h2").IsWhite().IsA(Pawn.class);
    }

    @Test public void
    BlackPiecesAreAtTheRightPositionsOnLines7And8() {
        PieceAt("a8").IsBlack().IsA(Roock.class);
        PieceAt("b8").IsBlack().IsA(Knight.class);
        PieceAt("c8").IsBlack().IsA(Bishop.class);
        PieceAt("d8").IsBlack().IsA(Queen.class);
        PieceAt("e8").IsBlack().IsA(King.class);
        PieceAt("f8").IsBlack().IsA(Bishop.class);
        PieceAt("g8").IsBlack().IsA(Knight.class);
        PieceAt("h8").IsBlack().IsA(Roock.class);

        PieceAt("a7").IsBlack().IsA(Pawn.class);
        PieceAt("b7").IsBlack().IsA(Pawn.class);
        PieceAt("c7").IsBlack().IsA(Pawn.class);
        PieceAt("d7").IsBlack().IsA(Pawn.class);
        PieceAt("e7").IsBlack().IsA(Pawn.class);
        PieceAt("f7").IsBlack().IsA(Pawn.class);
        PieceAt("g7").IsBlack().IsA(Pawn.class);
        PieceAt("h7").IsBlack().IsA(Pawn.class);
    }

    private PieceTester PieceAt(String position)
    {
        Piece piece = pieces.getPieceWithPosition(position);
        return new PieceTester(piece);
    }
}
