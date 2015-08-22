package chess;

import com.sun.org.apache.xpath.internal.operations.Bool;
import gui.GameFrame;
import imhotep.Imhotep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import support.GameDriver;
import org.junit.runner.RunWith;
import org.concordion.integration.junit4.ConcordionRunner;

import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static support.GameDriver.*;


/**
 * Created by Rob on 6/26/2014.
 */
@RunWith(ConcordionRunner.class)
public class TestPawnMoveFixture {
    GameFrame game;
    GameDriver board;



    public void setupGameWithOnePawnOn(String square) {
        game = new GameFrame();
        game.setVisible( true );
        board = new GameDriver();
        game.display(aPawn().white().on(square).build());
    }

    public void selectPieceToMove(String square){
        board.cell(square).click();
    }

    public void selectLocationToMovePieceTo(String square){
        board.cell(square).click();
    }

    public Boolean shouldBePawn(String square){
        board.has(pawn(), on(square));
        return true;

    }
    public Boolean shouldBeEmpty(String square){
        board.hasNothingOn("e2");
        return true;
    }

}
