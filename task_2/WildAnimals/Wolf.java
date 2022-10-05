package  WildAnimals;
import Base.WildAnimal;


public class Wolf extends WildAnimal {
    
    private boolean packLeader;

    
    public Wolf(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String habitat,
            String dateOfFinding, boolean packLeader) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, habitat, dateOfFinding);
        this.packLeader = packLeader;
    }


    public boolean getIsPackLeader() {
        return this.packLeader;
    }
    
    
    @Override
    public void makeSound() {
        System.out.println("Wooo-oo-oooo-ooooo");
        
    }
 
    @Override
    public String toString() {
        return "\nheight Of Animal = " + heightOfAnimal + " sm" +
        ", \nweight Of Animal = " + weightOfAnimal + " kg" +
        ", \ncolor Of Animal Eyes = " + colorOfAnimalEyes +
        ", \nhabitat = " + habitat +
        ", \ndate Of Finding = " + dateOfFinding +
        ", \npackLeader = " + getIsPackLeader();

    }
    
}
