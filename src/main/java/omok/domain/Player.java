package omok.domain;

public class Player {

    private String name;

    private Rule rule;

    private OmokDol omokDol;

    public Player(String name, OmokDol omokDol) {
        this.name = name;
        this.omokDol = omokDol;

        if (this.omokDol.equals(omokDol.BLACK)) {
            this.rule = new RuleForBlackDol();
        }
        else {
            this.rule = new RuleForWhiteDol();
        }
    }

    public String getName() {
        return this.name;
    }

    public Rule getRule() {
        return this.rule;
    }

    public OmokDol getOmokDol() {
        return this.omokDol;
    }

    public boolean putOmokDol(int x, int y, Board board) {

        if (rule.valid(x, y, board)) {
            board.addOmokDol(x, y, this.omokDol);
            return true;
        }
        return false;
    }
}
