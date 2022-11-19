import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game_Chair gc = new Game_Chair();
        Player computer = new Player(true);
        Player player = new Player(false);

        gc.start(computer);

        gc.start(player);

        System.out.println(gc.findWinner(computer, player));

        System.out.println("Computer:" + computer.getCard());
        System.out.println("Player:" + player.getCard());
    }
}