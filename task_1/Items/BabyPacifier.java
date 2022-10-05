package Items;
import Categories.BabyItems;


public class BabyPacifier extends BabyItems {

    public BabyPacifier(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement,int minimumAge,  boolean hypoallergenicity) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, minimumAge, hypoallergenicity);
        
    }

    @Override
    public String toString() {
        return "Baby Pacifier[productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", hypoallergenicity=" + hypoallergenicity 
                + ", minimumAge=" + minimumAge
                + ", hypoallergenicity=" + hypoallergenicity + "]";
    }

 
    
}
