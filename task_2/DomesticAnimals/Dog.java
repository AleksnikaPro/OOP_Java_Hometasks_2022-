package DomesticAnimals;
import Base.DomesticAnimal;
import Interfaces.ITrainable;

public class Dog extends DomesticAnimal implements ITrainable {
    
    private boolean isTrained;


    public Dog(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String nicknameOfAnimal,
            String breedOfAnimal, boolean availabilityOfVaccinations, String colorOfFur, String dateOfBirth,
            boolean isTrained) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, nicknameOfAnimal, breedOfAnimal,
                availabilityOfVaccinations, colorOfFur, dateOfBirth);
        this.isTrained = isTrained;
    }


    public boolean getIsTrained() {
        return this.isTrained;
    }


    public void train() {
        System.out.println("I am trained by the owner all the time.");     
    }
    
    @Override
    public void makeSound() {
        System.out.println("bow-wow!"); 
    }

    
    @Override
    public void showAffection() {
        System.out.println("I'm wagging my tail!");
        
    }

    @Override
    public String toString() {
        return "\nheight Of Animal = " + heightOfAnimal + " sm" +
        ", \nweight Of Animal = " + weightOfAnimal + " kg" +
        ", \ncolor Of Animal Eyes = " + colorOfAnimalEyes +
        ", \nnickname Of Animal = " + nicknameOfAnimal + 
        ", \nbreed Of Animal = " + breedOfAnimal +
        ", \navailability Of Vaccinations = " + availabilityOfVaccinations +
        ", \ncolor Of Fur = " + colorOfFur +
        ", \ndate Of Birth = " + dateOfBirth + 
        ", \nis Trained = " + getIsTrained();

    }
}
