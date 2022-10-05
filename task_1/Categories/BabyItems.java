package Categories;
import Base.Product;


public class BabyItems extends Product{
    protected int minimumAge;
    protected boolean hypoallergenicity;

    public BabyItems(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int minimumAge, boolean hypoallergenicity) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement);
        this.minimumAge = minimumAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    @Override
    public String toString() {
        return "BabyItems [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", minimumAge=" + minimumAge 
                + ", hypoallergenicity=" + hypoallergenicity + "]";
    } 
    

}    

    

