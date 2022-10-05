package Items;
import Categories.Drinks;

public class Lemonade extends Drinks{

    public Lemonade(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int volume) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, volume);
    }


    @Override
    public String toString() {
        return "Lemonade [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", volume=" + volume + "]";
    } 

}
    

