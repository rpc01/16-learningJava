import java.awt.*;
import java.util.Scanner;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {



//work with functions
       	Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE,
                true, 
                50);

        Car sallyCar = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false,
                100);
        
       	double speed = 0;
 		speed=myCar.speedingUp(speed);
 		System.out.println(speed);
       	
 		System.out.println(myCar.licensePlate);
 		
 	   			
 		
        }
    }


