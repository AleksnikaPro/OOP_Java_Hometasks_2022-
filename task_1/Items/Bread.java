package Items;
import Categories.FoodProducts;

public class Bread extends FoodProducts {
    public String typeOfFlour;

    public Bread(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, String expirationDate, String typeOfFlour) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return "Bread [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement 
                + ", expirationDate=" + expirationDate 
                + ", typeOfFlour=" + typeOfFlour + "]";
    } 
 
    
}
