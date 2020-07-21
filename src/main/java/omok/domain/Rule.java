package omok.domain;

public interface Rule {

    boolean valid(int x, int y, Board board);
}
