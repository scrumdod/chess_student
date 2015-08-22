package gui.renderers;

import chess.Piece;
import imhotep.Imhotep;
import org.hamcrest.core.Is;
import org.junit.Test;

import javax.swing.*;

import static builders.BishopBuilder.aBishop;
import static gui.renderers.PieceRenderer.PIECE_BLACK;
import static gui.renderers.PieceRenderer.PIECE_WHITE;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

@Imhotep(level="Unit")
public class PieceRendererTest {

    @Test
    public void
    whiteColorForAWhitePiece() {
        Piece piece = new Piece(){
            public boolean isWhite() { return true; }
        };
        PieceRenderer renderer = new PieceRenderer(piece) {
            public String toString() {
                return null;
            }
            public void visit(JButton button) {
            }
        };
        assertThat( renderer.getColor(), Is.is( PIECE_WHITE ) );
    }

    @Test public void
    buttonVisitSetsIconToWhiteForAWhiteBishop() {
        JButton button = new JButton();
        Piece bishop = aBishop().white().build();
        PieceRenderer renderer = new BishopRenderer(bishop) { };
        renderer.visit( button );

        assertThat( button.getIcon().toString(), containsString( "white" ) );
    }

    @Test
    public void
    blackColorForABlackPiece() {
        Piece piece = new Piece(){
            public boolean isWhite() { return false; }
        };
        PieceRenderer renderer = new PieceRenderer(piece) {
            public String toString() {
                return null;
            }
            public void visit(JButton button) {
            }
        };
        assertThat( renderer.getColor(), Is.is( PIECE_BLACK ) );
    }

    @Test public void
    buttonVisitSetsIconToBlackForABlackBishop() {
        JButton button = new JButton();
        Piece bishop = aBishop().black().build();
        PieceRenderer renderer = new BishopRenderer(bishop) { };
        renderer.visit( button );

        assertThat( button.getIcon().toString(), containsString( "black" ) );
    }
}
