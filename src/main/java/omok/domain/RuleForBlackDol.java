package omok.domain;

public class RuleForBlackDol implements Rule{

    private Board board;

    @Override
    public boolean valid(int x, int y) {
        return false;
    }
}
