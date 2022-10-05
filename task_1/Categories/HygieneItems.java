package Categories;
import Base.Product;

public class HygieneItems extends Product{
    protected int numberOfPiecesPerPack;

    public HygieneItems(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int numberOfPiecesPerPack) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement);
        this.numberOfPiecesPerPack = numberOfPiecesPerPack;
        
    }

    @Override
    public String toString() {
        return "HygieneItems [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", numberOfPiecesPerPack=" + numberOfPiecesPerPack + "]";
    }


}   
    

