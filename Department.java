public class Department extends Store {
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Adding all constructors
    public Department(int storeId, String storeName, String storeLocation, String openingHour, double totalSales,
            double totalDiscount, String productName, double markedPrice, double sellingPrice) {
        super(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount);
        super.setTotalSales(totalSales);
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0.0;
        this.isInSales = true;
    }

    // Accessor Method
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setMarkedPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }

    public double getMarkedPrice() {
        return this.markedPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.TotalDiscount = totalDiscount;
    }

    public double getTotalDiscount() {
        return this.TotalDiscount;
    }

    // Method for calculating Discount Price
    public void calculatedDiscountPrice(double markedPrice, double totalDiscount) {
        double discount = 0;
        if (markedPrice >= 5000) {
            discount = 20;
        } else if (markedPrice >= 3000 && markedPrice < 5000) {
            discount = 5;
        }

        totalDiscount = (discount / 100) * markedPrice;
        System.out.println(totalDiscount);
        double sellingPrice = markedPrice - totalDiscount;
        setSellingPrice(sellingPrice);
   
        setTotalDiscount(totalDiscount);
    }

    public void display() {
        super.display();
        if (isInSales) {
            System.out.println("ProductName: " + productName);
            System.out.println("SellingPrice: " + sellingPrice);
        }
    }
}
