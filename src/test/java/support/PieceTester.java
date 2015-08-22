package support;

import chess.Piece;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PieceTester
{
    private Piece piece;

    public PieceTester(Piece piece)
    {
        this.piece = piece;
    }

    public PieceTester IsWhite()
    {
        assertThat(piece.isWhite(), is(true));
        return this;
    }

    public PieceTester IsBlack()
    {
        assertThat(piece.isWhite(), is(false));
        return this;
    }

    public void IsA(Class aClass)
    {
        assertThat(piece, is(instanceOf(aClass)));
    }
}
