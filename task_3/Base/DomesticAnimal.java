package Base;
import Interfaces.IAffectionable;


public abstract class DomesticAnimal extends Animal implements IAffectionable {
    
    protected String nicknameOfAnimal;
    protected String breedOfAnimal;
    protected boolean availabilityOfVaccinations;
    protected String colorOfFur;
    protected String dateOfBirth;

    public DomesticAnimal(double heightOfAnimal, double weightOfAnimal, String colorOfAnimalEyes, String nicknameOfAnimal, 
                          String breedOfAnimal, boolean availabilityOfVaccinations, String colorOfFur, String dateOfBirth2) {
        super(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes);
        this.nicknameOfAnimal = nicknameOfAnimal;
        this.breedOfAnimal = breedOfAnimal;
        this.availabilityOfVaccinations = availabilityOfVaccinations;
        this.colorOfFur = colorOfFur;
        this.dateOfBirth = dateOfBirth2;
    }

    @Override
    public void showAffection(){
        
        System.out.println("I love my owner.");
    } 

       
    @Override
    public String toString() {
        return "height Of Animal = " + heightOfAnimal + " sm" +
        ", weight Of Animal = " + weightOfAnimal + " kg" +
        ", color Of Animal Eyes = " + colorOfAnimalEyes +
        ", nickname Of Animal = " + nicknameOfAnimal +
        ", breed Of Animal = " + breedOfAnimal +
        ", availability Of Vaccinations = " + availabilityOfVaccinations +
        ", color Of Fur = " + colorOfFur +
        ", date Of Birth = " + dateOfBirth;

    }

}
