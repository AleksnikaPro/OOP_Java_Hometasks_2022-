package Base;


public abstract class WildAnimal extends Animal {
    
    protected String habitat;
    protected String dateOfFinding;

    public WildAnimal(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String habitat,
                     String dateOfFinding) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes);
        this.habitat = habitat;
        this.dateOfFinding = dateOfFinding;

    }


    @Override
    public String toString() {
        return "height Of Animal = " + heightOfAnimal + " sm" +
        ", weight Of Animal = " + weightOfAnimal + " kg" +
        ", color Of Animal Eyes = " + colorOfAnimalEyes +
        ", habitat = " + habitat +
        ", date Of Finding = " + dateOfFinding;

    }
    
}
