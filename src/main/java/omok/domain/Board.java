package omok.domain;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private int[][] map = new int[9][9];

    public void addOmokDol(int x, int y, OmokDol omokDol) {
        this.map[x][y] = omokDol.getValue();
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

    public void checkOmok(int x, int y) {

        checkHorizontal(x, y);
        checkVertical(x, y);
        checkLeftDiagonal(x, y);
        checkRightDiagonal(x, y);

    }

    private void checkHorizontal(int x, int y) {
    }

    private void checkVertical(int x, int y) {

    }

    private void checkLeftDiagonal(int x, int y) {
    }

    private void checkRightDiagonal(int x, int y) {
    }
}
