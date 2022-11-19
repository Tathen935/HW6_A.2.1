public class Shuffle {
    public int getRandomNumber(){
        int i = (int)(Math.random() * 101);
        if(i == 0){
            i = 1;
        }
        return i;
    }
}
