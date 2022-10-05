package Base;
import Interfaces.ISoundable;

public abstract class Animal implements ISoundable{
    
    protected double heightOfAnimal;
    protected double weightOfAnimal;
    protected String colorOfAnimalEyes;

    
    public Animal(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes) {
        this.heightOfAnimal = heightOfAnimal;
        this.weightOfAnimal = weightOfAnimal;
        this.colorOfAnimalEyes = colorOfAnimalEyes;
    }

    
    public double getHeightOfAnimal() {

        return heightOfAnimal;
    }


    public double getWeightOfAnimal() {
        return weightOfAnimal;

    }
    
    public String getColorOfAnimalEyes() {

        return colorOfAnimalEyes;
    }


    
    @Override
    public String toString() {
        return "height Of Animal = " + heightOfAnimal + " sm" +
        ", weight Of Animal = " + weightOfAnimal + " kg" +
        ", color Of Animal Eyes = " + colorOfAnimalEyes;
    }

    
}
