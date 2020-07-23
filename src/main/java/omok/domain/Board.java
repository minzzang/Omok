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

        if (checkHorizontal(x, y) || checkVertical(x, y) || checkLeftDiagonal(x, y) || checkRightDiagonal(x, y)) {

        }
    }

    private boolean checkHorizontal(int x, int y) {
        return false;
    }

    private boolean checkVertical(int x, int y) {
        return false;
    }

    private boolean checkLeftDiagonal(int x, int y) {
        return false;
    }

    private boolean checkRightDiagonal(int x, int y) {
        return false;
    }
}
