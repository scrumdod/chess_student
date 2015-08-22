package gui.renderers;

import chess.Piece;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.white;

public abstract class PieceRenderer {

    public static final Color PIECE_WHITE = white;
    public static final Color PIECE_BLACK = black;
    private Piece piece;
    protected ImageIcon whiteIcon;
    protected ImageIcon blackIcon;

    public PieceRenderer(Piece piece) {
        this.piece = piece;
    }

    public Color getColor() {
        return piece.isWhite() ? PIECE_WHITE : PIECE_BLACK;
    }

    public void visit(JButton button) {
        button.setForeground( getColor() );
        button.setIcon( icon() );
    }

    public Piece getPiece() {
        return piece;
    }

    public Icon icon() {
        return getColor() == PIECE_WHITE ? whiteIcon() : blackIcon();
    }

    private Icon whiteIcon() {
        if (whiteIcon == null) {
            try {
                whiteIcon = new ImageIcon( getClass().getResource( "white_" + toString() + ".png" ) );
            } catch (Exception e) {}
        }
        return whiteIcon;
    }

    private Icon blackIcon() {
        if (blackIcon == null) {
            try {
                blackIcon = new ImageIcon( getClass().getResource( "black_" + toString() + ".png" ) );
            } catch (Exception e) {}
        }
        return blackIcon;
    }

}
