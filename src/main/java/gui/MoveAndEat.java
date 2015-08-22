package gui;

import chess.Piece;
import chess.Pieces;

public class MoveAndEat implements MoveCommand {

    private GameFrame frame;
    private Pieces pieces;

    public MoveAndEat(GameFrame frame, Pieces pieces) {
        this.frame = frame;
        this.pieces = pieces;
    }

    @Override
    public void move(String initialPosition, String targetPosition) {
        Piece piece = pieces.getPieceWithPosition( initialPosition );
        Piece eaten = pieces.getPieceWithPosition( targetPosition );
        pieces.remove( eaten );
        piece.setPosition( targetPosition );

        frame.clearPosition( initialPosition );
        frame.display( piece );
    }
}
