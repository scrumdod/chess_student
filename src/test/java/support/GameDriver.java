package support;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import gui.renderers.PawnRenderer;
import gui.renderers.QueenRenderer;
import gui.renderers.RoockRenderer;

import javax.swing.*;

import static gui.GameFrame.TITLE;
import static org.hamcrest.core.StringContains.containsString;

public class GameDriver extends JFrameDriver {

    @SuppressWarnings("unchecked")
    public GameDriver() {
        super(new GesturePerformer(), new AWTEventQueueProber(), named( TITLE ), showingOnScreen());
        ((AWTEventQueueProber) prober()).setTimeout( 100 );
    }
    public JLabelDriver label(String name) {
        return new JLabelDriver(this, ComponentDriver.named( name ));
    }
    public JButtonWithIconDriver button(String name) {
        return new JButtonWithIconDriver(this, JButton.class, ComponentDriver.named( name ));
    }

    public JButtonDriver cell(String name) {
        return button( name );
    }

    public void hasNothingOn(String cell) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        button(cell).hasNoIcon( );
    }

    public void has(String pieceName, String location) {
        button( location ).hasIcon( containsString( pieceName ) );
    }

    public void hasBlack(String pieceName, String location) {
        has(pieceName, location);
        button( location ).hasIcon( containsString( "black" ) );
    }

    public void hasWhite(String pieceName, String location) {
        has(pieceName, location);
        button( location ).hasIcon( containsString( "white" ) );
    }

    public static String on(String position) {
        return position;
    }

    public static String pawn() {
        return new PawnRenderer( null ).toString();
    }

    public static String queen() {
        return new QueenRenderer( null ).toString();
    }

    public static String rook() {
        return new RoockRenderer( null ).toString();
    }

}

