package gui;

import chess.Queen;
import gui.renderers.*;
import imhotep.Imhotep;
import org.junit.Before;
import org.junit.Test;

import static builders.BishopBuilder.aBishop;
import static builders.KingBuilder.aKing;
import static builders.KnightBuilder.aKnight;
import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static builders.RockBuilder.aRoock;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

@Imhotep(level="Unit")
public class RendererFactoryTest {

    RendererFactory factory;
    
    @Before public void
    newFactory() {
        factory = new RendererFactory();
    }

    @Test public void
    queens() {
        Queen queen = aQueen().build();
        PieceRenderer renderer = factory.rendererOf( queen );
        assertThat( renderer, instanceOf( QueenRenderer.class ) );
        assertThat( (Queen) renderer.getPiece(), equalTo( queen ) );
    }

    @Test public void
    pawns() {
        assertThat( factory.rendererOf( aPawn().build()), instanceOf( PawnRenderer.class ) );
    }

    @Test public void
    rocks() {
        assertThat( factory.rendererOf( aRoock().build()), instanceOf( RoockRenderer.class ) );
    }

    @Test public void
    bishops() {
        assertThat( factory.rendererOf( aBishop().build()), instanceOf( BishopRenderer.class ) );
    }

    @Test public void
    knights() {
        assertThat( factory.rendererOf( aKnight().build()), instanceOf( KnightRenderer.class ) );
    }

    @Test public void
    kings() {
        assertThat( factory.rendererOf( aKing().build()), instanceOf( KingRenderer.class ) );
    }
    
    @Test public void
    classIdentification() {
        assertThat( factory.getClassOf( aQueen().build() ), equalTo( "Queen" ) );
    }
    @Test public void
    rendererClassNameConstruction() {
        assertThat( factory.getRendererClass( aQueen().build() ), equalTo( "gui.renderers.QueenRenderer" ) );
    }
    
}
