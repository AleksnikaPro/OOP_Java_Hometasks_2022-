package Items;
import Categories.Drinks;

public class Milk extends Drinks {
    int percentageOfFatContent;
    String expirationDate;

    public Milk(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int volume, int percentageOfFatContent, String expirationDate) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, volume);
        this.percentageOfFatContent  = percentageOfFatContent;
        this.expirationDate = expirationDate;
    }
   
    @Override
    public String toString() {
    
        return "Milk [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement 
                + ", volume=" + volume 
                + ", percentageOfFatContent=" + percentageOfFatContent
                + ", expirationDate=" + expirationDate + "]";
    } 

}

