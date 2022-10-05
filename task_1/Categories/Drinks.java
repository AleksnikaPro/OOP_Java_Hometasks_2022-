package Categories;
import Base.Product;

public class Drinks extends Product {
    protected int volume;

    public Drinks(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int volume) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drinks [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", volume=" + volume + "]";
    } 

}    
    
    
    
    
    
    
    
  

   
    

