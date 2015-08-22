import gui.GameFrame;
import imhotep.Imhotep;
import org.junit.Ignore;
import org.junit.Test;
import support.GameDriver;

import static chess.rules.InitialPositions.initialPositions;

@Imhotep(level="UI")
public class ImmortalGame {

    GameFrame game;
    GameDriver board;

    //@Ignore
    @Test public void
    playImmortalGame() throws InterruptedException {
        game = new GameFrame();
        game.setVisible( true );
        board = new GameDriver();
        game.display( initialPositions() );

        play( "e2", "e4" ); play( "e7", "e5" );     //1
        play( "f2", "f4" ); play( "e5", "f4" );
        play( "f1", "c4" ); play( "d8", "h4" );
        play( "e1", "f1" ); play( "b7", "b5" );
        play( "c4", "b5" ); play( "g8", "f6" );
        play( "g1", "f3" ); play( "h4", "h6" );     //6
        play( "d2", "d3" ); play( "f6", "h5" );
        play( "f3", "h4" ); play( "h6", "g5" );
        play( "h4", "f5" ); play( "c7", "c6" );
        play( "g2", "g4" ); play( "h5", "f6" );     //10
        play( "h1", "g1" ); play( "c6", "b5" );
        play( "h2", "h4" ); play( "g5", "g6" );
        play( "h4", "h5" ); play( "g6", "g5" );
        play( "d1", "f3" ); play( "f6", "g8" );
        play( "c1", "f4" ); play( "g5", "f6" );     //15
        play( "b1", "c3" ); play( "f8", "c5" );
        play( "c3", "d5" ); play( "f6", "b2" );
        play( "f4", "d6" ); play( "b2", "a1" );
        play( "f1", "e2" ); play( "c5", "g1" );
        play( "e4", "e5" ); play( "b8", "a6" );
        play( "f5", "g7" ); play( "e8", "d8" );
        play( "f3", "f6" ); play( "g8", "f6" );
        play( "d6", "e7");

        Thread.sleep( 3000 );
        game.setVisible( false );
    }

    private void play(String origin, String destination) {
        board.cell( origin ).click();
        board.cell( destination ).click();
    }

}
