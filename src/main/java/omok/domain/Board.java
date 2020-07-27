package omok.domain;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private int[][] map = new int[SIZE][SIZE];

    private static int SIZE = 9;

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

    public boolean checkOmok(int x, int y, OmokDol omokDol) {

        if (checkHorizontal(x, y, omokDol) || checkVertical(x, y, omokDol) || checkLeftDiagonal(x, y, omokDol) || checkRightDiagonal(x, y, omokDol)) {
            return true;
        }
        return false;
    }

    private boolean checkHorizontal(int x, int y, OmokDol omokDol) {

        int count = 0;

        for (int i=0; i<SIZE; i++) {
            if (map[y][i] == omokDol.getValue()) {
                count++;
            }
        }
        return count == 5 ? true : false;
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
