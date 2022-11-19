import java.util.Scanner;

public class Player {
    private boolean isComputer;
    private int card = 0;

    private BetMore_Game game = new BetMore_Game();

    public Player(boolean pIsComputer){
        isComputer = pIsComputer;
    }

    public void play(){
        if(isComputer){
            card = game.pickCard();
        } else {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            String userInput = "";
            while(!userInput.equals("yes") && i != 5){
                card = game.pickCard();
                System.out.println("Do you want to keep this card:" + card);
                userInput = scanner.nextLine();
                i = i + 1;
            }
        }
    }

    public int getCard(){
        return card;
    }

    public boolean getIsComputer(){
        return isComputer;
    }
}
