
// import Base.Product;
// import Items.*;

// import java.util.ArrayList;



// public class Program {

//     static void fullInfoAboutProductItem(ArrayList<Product> productItems) { // метод, выводящий все данные о товаре
//         int count = 1;
//         // извлекаем записи продуктов с помощью  цикла forEach
//         for(Product pr : productItems) {
//             System.out.printf("%d. %s\n", count, pr);
//             // System.out.println(pr);
//             count+=1;
//         }
//         //System.out.println(productItems.toString()); //второй способ вывода инфо о товарах
//     }
    
//     public static void main(String[] args) {



//         Bread bread = new Bread("Дарницкий", 37, 1, "grams", "3 days", "rye flour Type 1150"); 
//         Eggs eggs = new Eggs("Агрокомплекс Выселковский", 70, 1, "pieces", "30 days", 10);       
//         Milk milk = new Milk("Коровка из Кореновки", 90, 1, "milliliters", 900, 6, "14 days");
//         Lemonade lemonade = new Lemonade("Буратино", 90, 1, "liters", 1);    
//         Masks masks = new Masks("Маска гигиеническая", 317, 1, "pieces", 10);
//         ToiletPaper toiletPaper = new ToiletPaper("Zewa Just1 Flowers", 710, 1, "pieces", 4, 4);
//         Diapers diapers = new Diapers("Merries", 1357, 1, "pieces", 0, true, "NB", 0, 5, "disposable");
//         BabyPacifier babyPacifier = new BabyPacifier("Mepsi", 224, 1, "pieces", 6, true);
 

//         // создаем объект ArrayList для хранения записей продуктов
//         ArrayList<Product> productItems = new ArrayList<Product>();

//         // добавляем записи продуктов 
//         productItems.add(bread);
//         productItems.add(eggs);
//         productItems.add(milk);
//         productItems.add(lemonade);
//         productItems.add(masks);
//         productItems.add(toiletPaper);
//         productItems.add(diapers);
//         productItems.add(babyPacifier);
      

//         fullInfoAboutProductItem(productItems); 
        
//     }
     
// }
