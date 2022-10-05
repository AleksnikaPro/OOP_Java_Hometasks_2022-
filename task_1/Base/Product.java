package Base;

public class Product {
    protected String productName;
    protected int productPrice;
    protected int numberOfProducts;
    protected String unitOfMeasurement;

    public Product(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement) {
    this.productName = productName;
    this.productPrice = productPrice;
    this.numberOfProducts = numberOfProducts;
    this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Product [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement + "]";
    }

}    
    
    
    
 
   
