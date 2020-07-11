package omok;

import omok.domain.Board;
import omok.domain.OmokDol;
import omok.domain.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static Boolean GAME_PROGRESS = true;

    public Game() {}

    public void start() {
        Board board = new Board();
        List<Player> players = Arrays.asList(new Player("minje", OmokDol.BLACK)
                                              , new Player("suhyun", OmokDol.WHITE));
        playOmok(players);
        board.showBoard();
    }

    private void playOmok(List<Player> players) {

        int count = 0;

        while (count < 10) {
            for (Player player : players) {

                System.out.println(player.getName() + "select");
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();

                player.putOmokDol(x, y);
                count++;
            }
        }
    }

}
