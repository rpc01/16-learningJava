import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Kathryn");

        Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE, true);

        Car sallyCar = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
        
/*work with strings*/        
        
       	String userInput ="entertainment";
       	String upperCased =userInput.toUpperCase();
       	System.out.println("Userinput: "+userInput);
       	System.out.println("Uppercased: "+upperCased);
       	
       	char firstChar = userInput.charAt(2);
       	System.out.println(firstChar);
       	
       	System.out.println(userInput.contains("EN"));
       	System.out.println("Contains enter?: "+ userInput.contains("EN".toLowerCase()));
        }
    }
