package Birds;
import Base.Bird;

public class Stork extends Bird {
    
    public Stork(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, int flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, flightAltitude);
        
    }


    @Override
    public void fly() {

        System.out.println("I fly at " + flightAltitude +  " m."); 
        
    }

    @Override
    public void makeSound() {

        System.out.println("Curr-Curr-Curr!") ;
        
    }

    @Override
    public String toString() {
       return "\nheight Of Animal = " + heightOfAnimal + " sm" +
       ", \nweight Of Animal = " + weightOfAnimal + " kg" +
       ", \ncolor Of Animal Eyes = " + colorOfAnimalEyes +
       ", \nflight Altitude= " + flightAltitude + "m";
   }
}
