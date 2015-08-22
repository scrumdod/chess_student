import gui.GameFrame;

import static chess.rules.InitialPositions.initialPositions;

public class Launcher {

    public static void main(String... arg) {
        GameFrame game = new GameFrame();
        game.setVisible( true );

        game.display( initialPositions() );
    }
}
