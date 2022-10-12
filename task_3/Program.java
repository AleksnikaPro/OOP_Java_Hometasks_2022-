import UI.UserInterface1;
import Zoo.Zoo;
import Base.Animal;
import Birds.Hen;
import Birds.Stork;
import DomesticAnimals.Cat;
import DomesticAnimals.Dog;
import WildAnimals.Tiger;
import WildAnimals.Wolf;



public class Program {

    public static void main(String[] args) {

       Animal cat = new Cat(20.0, 2.0, "blue", "Pushok", "persian", true, "grey", "23.07.2019", true);
       Animal dog = new Dog(30.0, 25.0, "brown", "Deo", "shepherd", true, "dark brown", "07.09.2013", true);
       Animal hen = new Hen(20.0, 1.5, "yellow", 0);
       Animal stork = new Stork(110.0, 4.0, "black", 3000);
       Animal tiger = new Tiger(115.0, 180.0, "yellow", "Far East", "05.08.2017");
       Animal wolf = new Wolf(60.0, 90.0, "light brown", "Siberia", "08.09.2015", true);


        Zoo zoo = new Zoo();
        zoo.zooList.add(cat);
        zoo.zooList.add(dog);
        zoo.zooList.add(hen);
        zoo.zooList.add(stork);
        zoo.zooList.add(tiger);
        zoo.zooList.add(wolf);

        final UserInterface1 userInterface = new UserInterface1(zoo);
        userInterface.clickButton();
    }
}
