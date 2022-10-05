
// import java.util.ArrayList;

// import Base.Animal;

// import Birds.Hen;
// import Birds.Stork;

// import DomesticAnimals.Cat;
// import DomesticAnimals.Dog;

// import WildAnimals.Tiger;
// import WildAnimals.Wolf;

// import Interfaces.IAffectionable;
// import Interfaces.IFlyable;
// import Interfaces.ISoundable;
// import Interfaces.ITrainable;

// public class Program1 {

//     static void fullInfoAboutAnimal(Animal animal) {

//         System.out.println("   " + animal.getClass().getSimpleName() + ": " + animal.toString());
        
//         if (animal instanceof ISoundable) {
//             ISoundable sound = (ISoundable) animal;
//             sound.makeSound();
//         }
//         if (animal instanceof IFlyable) {
//             IFlyable flight = (IFlyable) animal;
//             flight.fly();
//         }
//         if (animal instanceof IAffectionable) {
//             IAffectionable affection = (IAffectionable) animal;
//             affection.showAffection();
//         }
//         if (animal instanceof ITrainable) {
//             ITrainable training = (ITrainable) animal;
//             training.train();
//         }


//     }

//     public static void main(String[] args) {
//         Animal cat = new Cat(20.0, 2.0, "blue", "Pushok", "persian", true, "grey", "23.07.2019", true);
//         Animal dog = new Dog(30.0, 25.0, "brown", "Deo", "shepherd", true, "dark brown", "07.09.2013", true);
//         Animal hen = new Hen(20.0, 1.5, "yellow", 0);
//         Animal stork = new Stork(110.0, 4.0, "black", 3000);
//         Animal tiger = new Tiger(115.0, 180.0, "yellow", "Far East", "05.08.2017");
//         Animal wolf = new Wolf(60.0, 90.0, "light brown", "Siberia", "08.09.2015", true);

//         ArrayList<Animal> animalList = new ArrayList<Animal>();

//         animalList.add(cat);
//         animalList.add(dog);
//         animalList.add(hen);
//         animalList.add(stork);
//         animalList.add(tiger);
//         animalList.add(wolf);

//         for (Animal item : animalList) {
//             fullInfoAboutAnimal(item);
//         }
//     }
// }
