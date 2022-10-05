package Birds;
import Base.Bird;

public class Hen extends Bird {
    
    public Hen(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, int flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, 1);
        flightAltitude = 1;
    }


    @Override
    public void fly() {
        System.out.println("I fly at " + flightAltitude +  " m.");
        
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck-cluck-cluck!");
        
    }

    @Override
   public String toString() {
       return "\nheight Of Animal = " + heightOfAnimal + " sm" +
       ", \nweight Of Animal = " + weightOfAnimal + " kg" +
       ", \ncolor Of Animal Eyes = " + colorOfAnimalEyes +
       ", \nflight Altitude= " + flightAltitude + "m";
   }

}
