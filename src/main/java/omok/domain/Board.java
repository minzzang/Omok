package omok.domain;

public class Board {

    private int[][] map = new int[9][9];
    public static Board board;

    private Board() {}

    public static Board getInstance() {
        if (board == null) {
            board = new Board();
        }
        return board;
    }

    public void addOmokDol(int x, int y, OmokDol omokDol) {
        map[x][y] = omokDol.getValue();
    }

    public void showBoard() {

        for (int[] i : map) {
            for (int j : i) {
                if (j == 0) {
                    System.out.print(". ");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }

}
