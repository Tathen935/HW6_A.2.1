public class BetMore_Game {
    private Shuffle dealer = new Shuffle();

    public int pickCard(){
        return dealer.getRandomNumber();
    }
}
