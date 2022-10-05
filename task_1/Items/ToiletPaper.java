package Items;
import Categories.HygieneItems;

public class ToiletPaper extends HygieneItems {
    int numberOfLayers;

    public ToiletPaper(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int numberOfPiecesPerPack, int numberOfLayers){
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, numberOfPiecesPerPack);
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return "Toilet Paper [productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", numberOfPiecesPerPack=" + numberOfPiecesPerPack
                + ", numberOfLayers=" + numberOfLayers + "]";
    }

}    

    


