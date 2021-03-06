package omok.domain;

public class RuleForBlackDol implements Rule{

    @Override
    public boolean valid(int x, int y, Board board) {
        return !board.isPlaced(x, y);
    }

    public boolean isForbidden(int x, int y, Board board) {
        return true;
    }
}
