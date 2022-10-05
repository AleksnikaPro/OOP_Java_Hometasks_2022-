package Items;
import Categories.HygieneItems;

public class Masks extends HygieneItems {

    public Masks(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int numberOfPiecesPerPack){
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, numberOfPiecesPerPack);
    }

    @Override
    public String toString() {
        return "Masks [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", numberOfPiecesPerPack=" + numberOfPiecesPerPack + "]";
    }

}    
    


