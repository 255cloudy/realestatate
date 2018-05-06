import javax.swing.JOptionPane;
public class realeststeListings {
    private double price , itemSize;
    private String propertyType;
    private int numBeds,numBaths;
   //    private class is for encapsulation to make it accesible use a public method

    public realeststeListings(double price, double itemSize, String propertyType) {
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        this.numBeds = 0;
        this.numBaths = 0;
    }
    // constructor enables instant objects to store values

    public realeststeListings(double price, double itemSize, String propertyType, int numBeds, int numBaths) {
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
    }
//create user defined function to call main method
public  String toString(){
        return  "price "+price+"\n Property "+propertyType+" \n Size "+itemSize+"\n beds"+numBeds+"\n baths"+numBaths;
}

}
