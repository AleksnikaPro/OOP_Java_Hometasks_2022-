package task_4.Classes;

public class CatCreator {

    public Cat createAnObjectCat (String str) {
        str = str.substring(1, str.length() - 1);
        String [] string = str.split(" ");
        String name = string[1].substring(1, string[1].length() - 2);
        Integer height = Integer.parseInt(string[3].substring(0, string[3].length() - 1));
        Integer weight = Integer.parseInt(string[5].substring(0, string[5].length() - 1));
        String color = string[7].substring(1, string[7].length() - 1);
        return new Cat(name, height, weight, color);
    }
}