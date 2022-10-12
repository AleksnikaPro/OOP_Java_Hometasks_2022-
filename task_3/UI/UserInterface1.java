package UI;

import Base.Animal;
import Zoo.AnimalCreator;
import Zoo.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface1 {

    Zoo zoo;

    private static boolean process = true;

    public UserInterface1(Zoo zoo) {
        this.zoo = zoo;
    }

    public void clickButton() {

        Scanner scanner = new Scanner(System.in);

        while (process) {
            if (zoo.zooList.size() > 0) {
                System.out.print("""
                        \nWelcome to the zoo!

                        \nEnter the number of the command:
                        0 - exit;
                        1 - add an animal;
                        2 - delete an animal at a specific index;
                        3 - show information about all animals in the zoo;
                        4 - show information about an animal at a specific index;
                        5 - make all animals make sounds in the zoo;
                        6 - make an animal make a sound at a specific index;
                        7 - make an animal at a specific index fly;
                        8 - make an animal at a specific index show its affection;
                        9 - train an animal at a specific index;
                        """);

                int choice = inputNaturalNumber(scanner);
                switch (choice) {
                    case 1 -> addCreatedAnimal(zoo.zooList);
                    case 2 -> {
                        int i = inputNumber(zoo.zooList, scanner);
                        zoo.removeAnimal(i);
                    }
                    case 3 -> zoo.getAllAnimalsInfo();
                    case 4 -> zoo.getAnimalInfo(inputNumber(zoo.zooList, scanner));
                    case 5 -> zoo.makeAllAnimalsSound();
                    case 6 -> zoo.makeAnimalSound(inputNumber(zoo.zooList, scanner));
                    case 7 -> zoo.makeAnimalFly(inputNumber(zoo.zooList, scanner));
                    case 8 -> zoo.makeAnimalShowAffection(inputNumber(zoo.zooList, scanner));
                    case 9 -> zoo.makeAnimalTrain(inputNumber(zoo.zooList, scanner));
                    case 0 -> process = false;
                    default ->
                        System.out.println("You entered the wrong command. Choose the command from the list above.");
                }
            } else {
                System.out.print(
                        "\nThe zoo is empty! Please add an animal or quit:\n1 - create and add an animal;\n0 - exit.");
                System.out.print("\nEnter the command: ");

                int choice2 = inputNaturalNumber(scanner);
                switch (choice2) {
                    case 1 -> addCreatedAnimal(zoo.zooList);
                    case 0 -> process = false;
                    default ->
                        System.out.println("You entered the wrong command. Choose the command from the list above.");
                }
            }
        }
        scanner.close();
    }

    // получаем индекс животного
    public static int inputNumber(ArrayList<Animal> zooList, Scanner scanner) {
        int numberOfAnimalsInZoo = zooList.size();
        System.out.printf("Enter the index from 0 to %d: ", numberOfAnimalsInZoo - 1);
        int index = 0;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            System.out.println("You entered not a number");
        }
        return index;

    }
    
    // создаем новое животное и добавляем его в список зоопарка
    public void addCreatedAnimal(ArrayList<Animal> zooList) {
        AnimalCreator ac = new AnimalCreator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("""

                Choose an animal to create:

                    1 - cat;
                    2 - dog;
                    3 - tiger;
                    4 - wolf;
                    5 - stork;
                    6 - hen;
                        """);
        System.out.print("\nEnter animal's number to create a new instance: ");

        final int number = inputNaturalNumber(scanner);
        switch (number) {

            case 1 -> zooList.add(ac.animalCreator("cat"));
            case 2 -> zooList.add(ac.animalCreator("dog"));
            case 3 -> zooList.add(ac.animalCreator("tiger"));
            case 4 -> zooList.add(ac.animalCreator("wolf"));
            case 5 -> zooList.add(ac.animalCreator("stork"));
            case 6 -> zooList.add(ac.animalCreator("hen"));
            default -> System.out.println("You entered the wrong number. Try again: ");
        }
        System.out.println("\n A new animal is successfully created and added to the zoo!");
        scanner.close();
    } 

    static int inputNaturalNumber(Scanner scanner) {

        int number = 0;
        boolean checkNegative = false;

        while (!checkNegative) {

            while (!scanner.hasNextInt()) {
                System.out.println("You've entered not a number, please repeat input!");
                // scanner.next();
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("You've entered a negative, please repeat input!");
            } else {
                checkNegative = true;
            }
        }
        return number;
    }
}
