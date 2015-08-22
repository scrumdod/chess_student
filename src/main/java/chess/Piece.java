package chess;

public class Piece {

    private String position;
    private boolean white;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public String getPosition() {
        return position;
    }

    public boolean isWhite() {
        return white;
    }

}
