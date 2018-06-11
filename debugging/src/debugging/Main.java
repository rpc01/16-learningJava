package debugging;

import java.awt.*;
import java.lang.Math;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Coin c = new Coin();
        System.out.println("Initial: " + c.getFaceUp());
        Scanner scan=new Scanner(System.in);
        System.out.println("How many trials?: ");
        int scaner = scan.nextInt();
        for(int i = 0; i < scaner; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }
                      
    }
}
