package task_4;

import java.io.IOException;

import task_4.Classes.Cat;
import task_4.JSONManager.JSONmanager;

public class Program {

    public static void main(String[] args) throws IOException {
        JSONmanager m = new JSONmanager("OOP_HW/task_4/data/file.json");
        String myString = "Hello Sam!";
        m.write(myString, true);
        int myNumber = 56;
        m.write(myNumber, true);
        Cat myCat = new Cat("Barsik", 23, 3, "black");
        m.write(myCat, true);

        var out = m.read("var");

        System.out.println("--------------------------");

        if (out.getClass().getSimpleName().equals(String.class.getSimpleName())) {
            String outStr = m.read(String.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outStr.getClass().getSimpleName());
            System.out.println(outStr);
        } else if (out.getClass().getSimpleName().equals(Integer.class.getSimpleName())) {
            Integer outInt = m.read(Integer.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outInt.getClass().getSimpleName());
            System.out.println(outInt);
        } else if (out.getClass().getSimpleName().equals(Cat.class.getSimpleName())) {
            Cat outCat = m.read(Cat.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outCat.getClass().getSimpleName());
            System.out.println(outCat);
        }
    }
}