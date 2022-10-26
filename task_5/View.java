package task_5;

import java.util.Scanner;

import task_5.Interfaces.IView;

public class View implements IView{
    Scanner sc = new Scanner(System.in);

    public double getValue (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.nextDouble();
    }

    public String getSign (String stringName) {
        System.out.printf("%s: ", stringName);
        return sc.next();
    }

    
    public void showResult(String stringName ) {
        System.out.printf("%s\n", stringName); 
    }

}