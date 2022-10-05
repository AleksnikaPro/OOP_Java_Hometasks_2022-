package Categories;
import Base.Product;

public class FoodProducts extends Product{
    protected String expirationDate;

    public FoodProducts(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, String expirationDate){
        super(productName, productPrice, numberOfProducts, unitOfMeasurement);
        this.expirationDate = expirationDate;

    }

    @Override
    public String toString() {
        return "FoodProducts [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", expirationDate=" + expirationDate + "]";
    } 

    
}
   
