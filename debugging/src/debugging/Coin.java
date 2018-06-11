package debugging;

import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;
    public int counterHeads = -1;
    public int counterTails = -1;
    public int counter = -1;
    
    private int faceUp;
             
    public Coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);
        counter++;
    }
  
   public String getFaceUp() {
        if (faceUp == HEADS) {
        	counterHeads++;     
            return "HEADS";
        } else if (faceUp == TAILS) {
        	counterTails++;
        	return "TAILS";
        } else {
            return "INVALID";
        }
    }

}