public class Game_Chair {

    private int cardComputer;
    private int cardPlayer;

    public void start(Player pPlayer){
        pPlayer.play();
    }

    public String findWinner(Player pPlayer1, Player pPlayer2){
        if(pPlayer1.getCard() > pPlayer2.getCard()){
            if(pPlayer1.getIsComputer()){
                return "The Computer wins with " + pPlayer1.getCard() + " to " + pPlayer2.getCard();
            } else {
                return "The Player wins with " + pPlayer2.getCard() + " to " + pPlayer1.getCard();
            }
        }
        if(pPlayer1.getCard() < pPlayer2.getCard()){
            if(pPlayer1.getIsComputer()){
                return "The Player wins with " + pPlayer2.getCard() + " to " + pPlayer1.getCard();
            } else {
                return "The Computer wins with " + pPlayer1.getCard() + " to " + pPlayer2.getCard();
            }
        }
        return "Draw. Both Players have " + pPlayer1.getCard();
    }
}
