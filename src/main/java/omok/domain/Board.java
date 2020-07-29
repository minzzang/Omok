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

        int count = 1;

        for (int i=x-1; i>=0; i--) {
            if (map[y][i] != omokDol.getValue()) break;
            count++;
        }

        for (int j=x+1; j<SIZE; j++) {
            if (map[y][j] != omokDol.getValue()) break;
            count++;
        }

        return count == 5 ? true : false;
    }


    private boolean checkVertical(int x, int y, OmokDol omokDol) {

        int count = 1;
        
        for (int i=y-1; i>=0; i--) {
            if (map[i][x] != omokDol.getValue()) break;
            count++;
        }

        for (int j=y+1; j<SIZE; j++) {
            if (map[j][y] != omokDol.getValue()) break;
            count++;
        }

        return  count == 5 ? true : false;
    }

    private boolean checkLeftDiagonal(int x, int y, OmokDol omokDol) {

        int count = 1;

        int downX = x, upX = x;
        int downY = x, upY = y;

        while (downX == 0 || downY == 0) {
            downX--;
            downY--;
            if (map[downY][downX] != omokDol.getValue()) break;
            count++;
        }

        while (upX == SIZE || upY == SIZE) {
            upX++;
            upY++;
            if (map[upY][upX] != omokDol.getValue()) break;
            count++;
        }

        return count == 5 ? true : false;
    }

    private boolean checkRightDiagonal(int x, int y, OmokDol omokDol) {

        int count = 1;
        
        int downX = x, upX = x;
        int downY = x, upY = y;

        while (upX == SIZE || downY == 0) {
            upX++;
            downY--;
            if (map[downY][upX] != omokDol.getValue()) break;
            count++;
        }

        while (downX == 0 || upY == SIZE) {
            downX--;
            upX++;
            if (map[upY][downX] != omokDol.getValue()) break;
            count++;
        }

        return count == 5 ? true : false;
    }
}
