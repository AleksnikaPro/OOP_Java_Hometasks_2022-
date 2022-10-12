package DomesticAnimals;
import Base.DomesticAnimal;


public class Cat extends DomesticAnimal {

    private boolean isFurry;


    public Cat(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String nicknameOfAnimal,
        String breedOfAnimal, boolean availabilityOfVaccinations, String colorOfFur, String dateOfBirth,
        boolean isFurry) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, nicknameOfAnimal, breedOfAnimal,
                availabilityOfVaccinations, colorOfFur, dateOfBirth);
        this.isFurry = isFurry;
    }


    public boolean getIsFurry() {

        return this.isFurry;
    }
    

    @Override
    public void makeSound() {
        System.out.println("meow, meow, meow!"); 

    }

    
    @Override
    public void showAffection() {
        System.out.println("I'm petting and purring!"); 
        
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
        ", \nhas fur = " + getIsFurry();

    }
    
}
