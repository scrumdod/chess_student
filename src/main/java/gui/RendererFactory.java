package gui;

import chess.Piece;
import gui.renderers.PieceRenderer;

import java.lang.reflect.Constructor;

public class RendererFactory {

    public PieceRenderer rendererOf(Piece piece) {
        return rendererInstanceOf( piece);
    }

    public String getClassOf(Piece piece) {
        return piece.getClass().getSimpleName();
    }

    public String getRendererClass(Piece piece) {
        return "gui.renderers." + getClassOf( piece ) + "Renderer";
    }

    public PieceRenderer rendererInstanceOf(Piece piece) {
        try {
            Class rendererClass = Class.forName( getRendererClass(piece) );
            Class partypes[] = new Class[1];
            partypes[0] = Piece.class;
            Constructor constructor = rendererClass.getConstructor(partypes);
            return (PieceRenderer) constructor.newInstance( new Object[] { piece });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
