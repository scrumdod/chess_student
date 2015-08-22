package chess;

import gui.GameFrame;
import imhotep.Imhotep;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static gui.GameFrame.CELL_BLACK;
import static gui.GameFrame.CELL_WHITE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Imhotep(level="Domain")
public class LayoutTest {

    GameFrame frame;

    @Before
    public void
    newFrame() {
        frame = new GameFrame();
    }

    @Test public void
    firstLine() {
        assertThat( colorOf( "a8" ), is( CELL_WHITE ) );
        assertThat( colorOf( "b8" ), is( CELL_BLACK ) );
        assertThat( colorOf( "c8" ), is( CELL_WHITE ) );
        assertThat( colorOf( "d8" ), is( CELL_BLACK ) );
        assertThat( colorOf( "e8" ), is( CELL_WHITE ) );
        assertThat( colorOf( "f8" ), is( CELL_BLACK ) );
        assertThat( colorOf( "g8" ), is( CELL_WHITE ) );
        assertThat( colorOf( "h8" ), is( CELL_BLACK ) );
    }

    @Test public void
    secondLine() {
        assertThat( colorOf( "a7" ), is( CELL_BLACK ) );
        assertThat( colorOf( "b7" ), is( CELL_WHITE ) );
        assertThat( colorOf( "c7" ), is( CELL_BLACK ) );
        assertThat( colorOf( "d7" ), is( CELL_WHITE ) );
        assertThat( colorOf( "e7" ), is( CELL_BLACK ) );
        assertThat( colorOf( "f7" ), is( CELL_WHITE ) );
        assertThat( colorOf( "g7" ), is( CELL_BLACK ) );
        assertThat( colorOf( "h7" ), is( CELL_WHITE ) );
    }

    private Color colorOf(String name) {
        return frame.getButtonNamed( name ).getBackground();
    }

}
