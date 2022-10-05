package Base;
import Interfaces.IFlyable;


public abstract class Bird extends Animal implements IFlyable {
    
    protected int flightAltitude;

    public Bird(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, int flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes);
        this.flightAltitude = flightAltitude;
        
    }

    @Override
    public void fly() {

        System.out.printf("I fly at %d m...\n", this.flightAltitude);
    }


    @Override
    public String toString() {
       return "height Of Animal = " + heightOfAnimal + " sm" +
       ", weight Of Animal = " + weightOfAnimal + " kg" +
       ", color Of Animal Eyes = " + colorOfAnimalEyes +
       ", flight Altitude= " + flightAltitude + "m";
    }

}
