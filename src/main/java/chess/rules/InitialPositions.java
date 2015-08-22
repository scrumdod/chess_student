package chess.rules;

import chess.Piece;

import static builders.BishopBuilder.aBishop;
import static builders.KingBuilder.aKing;
import static builders.KnightBuilder.aKnight;
import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static builders.RockBuilder.aRoock;

public class InitialPositions {

    public static Piece[] initialPositions() {
        return new Piece[]{
                aPawn().white().on( "a2" ).build(),
                aPawn().white().on( "b2" ).build(),
                aPawn().white().on( "c2" ).build(),
                aPawn().white().on( "d2" ).build(),
                aPawn().white().on( "e2" ).build(),
                aPawn().white().on( "F2" ).build(),
                aPawn().white().on( "g2" ).build(),
                aPawn().white().on( "h2" ).build(),

                aPawn().black().on( "a7" ).build(),
                aPawn().black().on( "b7" ).build(),
                aPawn().black().on( "c7" ).build(),
                aPawn().black().on( "d7" ).build(),
                aPawn().black().on( "e7" ).build(),
                aPawn().black().on( "F7" ).build(),
                aPawn().black().on( "g7" ).build(),
                aPawn().black().on( "h7" ).build(),

                aQueen().white().on( "d1" ).build(),
                aQueen().black().on( "d8" ).build(),

                aRoock().white().on( "a1" ).build(),
                aRoock().white().on( "h1" ).build(),
                aRoock().black().on( "a8" ).build(),
                aRoock().black().on( "h8" ).build(),

                aBishop().white().on( "c1" ).build(),
                aBishop().white().on( "f1" ).build(),
                aBishop().black().on( "c8" ).build(),
                aBishop().black().on( "f8" ).build(),

                aKnight().white().on( "b1" ).build(),
                aKnight().white().on( "g1" ).build(),
                aKnight().black().on( "b8" ).build(),
                aKnight().black().on( "g8" ).build(),

                aKing().white().on( "e1" ).build(),
                aKing().black().on( "e8" ).build()
        };
    }
}
