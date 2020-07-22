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

    }
}
