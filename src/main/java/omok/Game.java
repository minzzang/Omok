package omok;

import omok.domain.Board;
import omok.domain.OmokDol;
import omok.domain.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static Boolean GAME_PROGRESS = true;

    private Board board;

    public Game() {
        this.board = new Board();
    }

    public void start() {
        List<Player> players = Arrays.asList(new Player("minje", OmokDol.BLACK)
                                              , new Player("suhyun", OmokDol.WHITE));
        playOmok(players);
        board.showBoard();
    }

    private void playOmok(List<Player> players) {

        while (GAME_PROGRESS) {
            switchPlayer(players);
        }
        System.out.println("게임이 종료 되었습니다.");
    }

    private void switchPlayer(List<Player> players) {

        for (Player player : players) {

            board.showBoard();
            System.out.println(player.getName() + "select");

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (!player.putOmokDol(x, y, this.board)) {

                board.showBoard();
                System.out.println("replay.");
                x = sc.nextInt();
                y = sc.nextInt();
            }

            if (board.checkOmok(x, y, player.getOmokDol())) {
                GAME_PROGRESS = false;
                return;
            }
        }
    }


}
