package Items;
import Categories.BabyItems;

public class Diapers extends BabyItems{
    String size;
    int minimumWeight;
    int maximumWeight;
    String type;

    public Diapers(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int minimumAge, 
                  boolean hypoallergenicity, String size, int minimumWeight, int maximumWeight, String type) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, minimumAge, hypoallergenicity);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }
   
    @Override
    public String toString() {
        return "Diapers [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", hypoallergenicity=" + hypoallergenicity 
                + ", size=" + size
                + ", minimumWeight=" + minimumWeight
                + ", maximumWeight=" + maximumWeight
                + ", type=" + type + "]";
    }

    
}





