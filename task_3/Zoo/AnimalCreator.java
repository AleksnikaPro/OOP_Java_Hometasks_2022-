package Zoo;

import java.util.Scanner;

import Base.Animal;
import Birds.Hen;
import Birds.Stork;
import DomesticAnimals.Cat;
import DomesticAnimals.Dog;
import WildAnimals.Tiger;
import WildAnimals.Wolf;

public class AnimalCreator {

    private Scanner scanner;

    public AnimalCreator() {

        this.scanner = new Scanner(System.in);
    }

    public Animal animalCreator(String typeOfAnimal) {

        System.out.printf("Enter %s's height (sm): ", typeOfAnimal);
        double heightOfAnimal = scanner.nextDouble();
        System.out.printf("Enter %s's weight (kg): ", typeOfAnimal);
        double weightOfAnimal = scanner.nextDouble();
        System.out.printf("Enter %s's color of eyes: ", typeOfAnimal);
        String colorOfAnimalEyes = scanner.next();

        if (typeOfAnimal == "cat" || typeOfAnimal == "dog") {
            System.out.printf("Enter %s's nickname: ", typeOfAnimal);
            String nicknameOfAnimal = scanner.next();
            System.out.printf("Enter %s's breed: ", typeOfAnimal);
            String breedOfAnimal = scanner.next();
            System.out.printf("Enter %s's vaccination (true/false): ", typeOfAnimal);
            boolean availabilityOfVaccinations = scanner.nextBoolean();
            System.out.printf("Enter %s's fur color: ", typeOfAnimal);
            String colorOfFur = scanner.next();
            System.out.printf("Enter %s's date of birth: ", typeOfAnimal);
            String dateOfBirth = scanner.next();
            if (typeOfAnimal == "cat") {
                System.out.printf("Enter %s's presence of fur (true/false): ", typeOfAnimal);
                boolean isFurry = scanner.nextBoolean();
                return new Cat(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, nicknameOfAnimal, breedOfAnimal,
                        availabilityOfVaccinations, colorOfFur, dateOfBirth, isFurry);
            }

            else if (typeOfAnimal == "dog") {
                System.out.printf("Enter %s's trained condition (true/false): ", typeOfAnimal);
                boolean isTrained = scanner.nextBoolean();
                return new Dog(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, nicknameOfAnimal, breedOfAnimal,
                        availabilityOfVaccinations, colorOfFur, dateOfBirth, isTrained);
            }
        } else if (typeOfAnimal == "tiger" || typeOfAnimal == "wolf") {
            System.out.printf("Enter %s's habitat: ", typeOfAnimal);
            String habitat = scanner.next();
            System.out.printf("Enter %s's date of finding: ", typeOfAnimal);
            String dateOfFinding = scanner.next();
            if (typeOfAnimal == "tiger") {
                return new Tiger(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, habitat, dateOfFinding);
            } else if (typeOfAnimal == "wolf") {
                System.out.printf("Enter %s's pack leader condition (true/false): ", typeOfAnimal);
                boolean packLeader = scanner.nextBoolean();
                return new Wolf(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, habitat, dateOfFinding, packLeader);
            }
        } else if (typeOfAnimal == "hen") {
            int flyAltitude = 1;
            return new Hen(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, flyAltitude);
        } else if (typeOfAnimal == "stork") {
            System.out.printf("Enter %s's flying altitude: ", typeOfAnimal);
            int flyAltitude = scanner.nextInt();
            return new Stork(heightOfAnimal, weightOfAnimal, colorOfAnimalEyes, flyAltitude);
        }

        scanner.close();
        return null;
    }

    

    

}
