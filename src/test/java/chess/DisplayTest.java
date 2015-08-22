package chess;

import gui.GameFrame;
import imhotep.Imhotep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import support.GameDriver;

import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static gui.GameFrame.TITLE;
import static support.GameDriver.*;

@Imhotep(level="UI")
public class DisplayTest {

    GameFrame game;
    GameDriver board;

    @Before
    public void
    showGame() {
        game = new GameFrame();
        game.setVisible( true );
        board = new GameDriver();
    }
    @After
    public void
    hideFrame() {
        game.setVisible( false );
    }

    @Test
    public void
    frameTitle() {
        board.hasTitle( TITLE );
    }

    @Test public void
    canDisplayAWhitePawn() throws InterruptedException {
        game.display( aPawn().white().on( "e2" ).build() );
        board.hasWhite( pawn(), on( "e2" ) );
    }

    @Test public void
    canDisplayABlackPawn() throws InterruptedException {
        game.display( aPawn().black().on( "e2" ).build() );
        board.hasBlack( pawn(), on( "e2" ) );
    }

    @Test public void
    canDisplayABlackQueen() throws InterruptedException {
        game.display( aQueen().black().on( "d5" ).build() );
        board.hasBlack( queen(), on( "d5" ) );
    }

    @Test public void
    canDisplayAWhiteQueen() throws InterruptedException {
        game.display( aQueen().white().on( "d5" ).build() );
        board.hasWhite( queen(), on( "d5" ) );
    }

}
