package Items;
import Categories.FoodProducts;

public class Eggs extends FoodProducts {
    int numberInApackage;

    public Eggs(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, String expirationDate, int numberInApackage) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, expirationDate);
        this.numberInApackage = numberInApackage;
    }

    @Override
    public String toString() {
        return "Eggs [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement 
                + ", expirationDate=" + expirationDate 
                + ", numberInApackage=" + numberInApackage + "]";
    } 

    
}
