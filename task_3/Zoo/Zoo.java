package Zoo;

import Base.Animal;
import Interfaces.IAffectionable;
import Interfaces.IFlyable;
import Interfaces.ISoundable;
import Interfaces.ITrainable;

import java.util.ArrayList;


public class Zoo {

    public ArrayList<Animal> zooList;

    public Zoo() {

        this.zooList = new ArrayList<Animal>();

    }

    String noInfo = "There is no animal at a specified index! ";


    // 1.Добавить животное в зоопарк
    public void addAnimal(Animal animal) { 
        
        this.zooList.add(animal);
        
    }

    // 2.Убирает животное с номером i из зоопарка
    public void removeAnimal(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index);
        } else {
            System.out.printf("Animal %s at index %d was removed from the zoo!\n", this.zooList.get(index).getClass().getSimpleName(), index);
            this.zooList.remove(index);
        }
    }

    // 3.Посмотреть информацию о животном с номером i
    public void getAnimalInfo(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index);  
        } else {
            System.out.printf(" \nInformation about %s:\n", this.zooList.get(index).getClass().getSimpleName() + " " + this.zooList.get(index).toString());
            if (this.zooList.get(index) instanceof ISoundable) {
                ISoundable sound = (ISoundable) this.zooList.get(index);
                sound.makeSound();
            }
            if (this.zooList.get(index) instanceof IFlyable) {
                IFlyable flight = (IFlyable) (this.zooList.get(index));
                flight.fly();
            }
            if (this.zooList.get(index) instanceof IAffectionable) {
                IAffectionable affection = (IAffectionable) (this.zooList.get(index));
                affection.showAffection();
            }
            if (this.zooList.get(index) instanceof ITrainable) {
                ITrainable training = (ITrainable) (this.zooList.get(index));
                training.train();
            }
        }
    }

    // 4.Заставить животное с номером i издать звук
    public void makeAnimalSound(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index); 
        } else {
            System.out.printf(" %s ", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof ISoundable) {
                System.out.printf(" can make sounds:\n");
                ((ISoundable) this.zooList.get(index)).makeSound();
            } else {
                System.out.printf(" can't make sounds!\n");
            }
        }
    }

     // Сделать возможность у животных летать, если это животное птица
    public void makeAnimalFly(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index); 
        } else {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof IFlyable) {
                System.out.printf(" can fly:\n");
                ((IFlyable) this.zooList.get(index)).fly();
            } else {
                System.out.printf(" can't fly!\n");
            }
        }
    }

    // дрессировать, если это животное собака.
    public void makeAnimalTrain(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index);
        } else {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof ITrainable) {
                System.out.printf(" can be trained:\n");
                ((ITrainable) this.zooList.get(index)).train();
            } else {
                System.out.printf(" can't be trained!\n");
            }
        }
    }

    // проявлять ласку, если это домашнее животное
    public void makeAnimalShowAffection(int index) {
        if (index < 0 || index >= this.zooList.size()) {
            System.out.printf(noInfo + "%d\n", index);
        } else {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof IAffectionable) {
                System.out.printf(" can show its affection:\n");
                ((IAffectionable) this.zooList.get(index)).showAffection();
            } else {
                System.out.printf(" can't show its affection!\n");
            }
        }
    }

    // 5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
    public void getAllAnimalsInfo() {
        System.out.println("  \nFull information about animals in this zoo:\n");
        for (int i = 0; i < this.zooList.size(); i++) {
            getAnimalInfo(i);
        }
    }

    // 6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
    public void makeAllAnimalsSound() {
        System.out.println("   \nAll animals' sounds in this zoo:");
        for (Animal item : this.zooList) {
            item.makeSound();
        }
    }


}