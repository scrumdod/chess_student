package gui;

import chess.Pieces;
import chess.Queen;
import imhotep.Imhotep;
import org.junit.Before;
import org.junit.Test;

import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

@Imhotep(level="Domain")
public class MoveAndEatTest {

    GameFrame frame;
    MoveAndEat moveCommand;
    Pieces pieces;

    @Before public void
    movingAQueenOnAPawn() {
        frame = new GameFrame();
        frame.display( aQueen().black().on( "d5" ).build() );
        frame.display( aPawn().white().on( "e5" ).build() );
        frame.display( aPawn().white().on( "f5" ).build() );
        pieces = frame.getPieces();

        moveCommand = new MoveAndEat( frame, pieces );
        frame.setMoveCommand( moveCommand );

        moveCommand.move( "d5", "e5" );
    }

    @Test public void
    movesTheQueen() {
        assertThat( pieces.getPieceWithPosition( "e5" ), instanceOf( Queen.class ) );
    }

    @Test public void
    eatsThePawn() {
        assertThat( frame.getPieces().size(), equalTo( 2 ) );
    }

    @Test public void
    unlessThereIsNobodyOnTheTargetPosition() {
        moveCommand.move( "e5", "e3" );

        assertThat( pieces.getPieceWithPosition( "e3" ), instanceOf( Queen.class ) );
        assertThat( pieces.size(), equalTo( 2 ) );
    }

    @Test public void
    updateInitialPositionDrawing() {
        assertThat( frame.getButtonNamed( "d5" ).getIcon(), equalTo( null ) );
    }

    @Test public void
    updateTargetPositionDrawing() {
        assertThat( frame.getButtonNamed( "e5" ).getIcon().toString(), containsString( "queen" ) );
    }
}
