package WildAnimals;
import Base.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String habitat,
        String dateOfFinding) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, habitat, dateOfFinding);

    }


    @Override
    public void makeSound() {
        System.out.println("rrrr!"); 
    }

    @Override
    public String toString() {
        return "\nheight Of Animal = " + heightOfAnimal + " sm" +
        ", \nweight Of Animal = " + weightOfAnimal + " kg" +
        ", \ncolor Of Animal Eyes = " + colorOfAnimalEyes +
        ", \nhabitat = " + habitat +
        ", \ndate Of Finding = " + dateOfFinding;

    }
    
}
