package omok.domain;

public class Player {

    private String name;
    private Rule rule;
    private OmokDol omokDol;

    public Player(String name, OmokDol omokDol) {
        this.name = name;
        this.omokDol = omokDol;
    }

    public String getName() {
        return this.name;
    }

    public boolean putOmokDol(int x, int y) {
      //  board.addOmokDol(x, y, this.omokDol);
        return true;
    }
}
