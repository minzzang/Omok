package omok.domain;

public class Player {

    private String name;

    private Rule rule;

    private OmokDol omokDol;

    public Player(String name, OmokDol omokDol) {
        this.name = name;
        this.omokDol = omokDol;

        if (omokDol.equals(omokDol.BLACK)) {
            this.rule = new RuleForBlackDol();
        }
        else {
            this.rule = new RuleForWhiteDol();
        }
    }

    public String getName() {
        return this.name;
    }

    public void putOmokDol(int x, int y, Board board) {

        if (rule.valid(x, y, board)) {
            board.addOmokDol(x, y, this.omokDol);
        }
    }
}
