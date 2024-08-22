public class Department extends Store {
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Adding all constructors
    public Department(int storeId, String storeName, String storeLocation, String openingHour, double totalSales,
            double totalDiscount, String productName, double markedPrice, double sellingPrice) {
        super(storeId, storeName, storeLocation, openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0.0;
        this.isInSales = true;
    }

    // Accessor Method
    public String getProductName(String productName) {
        return this.productName = productName;
    }

    public double getMarkedPrice(double markedPrice) {
        return this.markedPrice = markedPrice;
    }

    public double getSellingPrice(double sellingPrice) {
        return this.sellingPrice = sellingPrice;
    }

    // Using the Setter Method to get MarkedPrice
    // public void setMarkedPrice(double markedPrice) {
    // this.markedPrice = markedPrice;
    // }

    // Method for calculating Discount Price
    public void calculatedDiscountPrice(boolean isInsale, double MarkedPrice) {
        double discount = 0.0;
        if (MarkedPrice >= 5000) {
            discount = 0.2;
        } else if (MarkedPrice >= 3000 && MarkedPrice < 5000) {
            discount = 0.05;
        }
        sellingPrice = MarkedPrice - (MarkedPrice * discount);
        setTotalSales(sellingPrice);
        this.isInSales = false;
        this.markedPrice = MarkedPrice;
    }

    public void display() {
        super.display();
        if (isInSales) {
            System.out.println("ProductName: " + productName);
            System.out.println("SellingPrice: " + sellingPrice);
        }
    }
}
