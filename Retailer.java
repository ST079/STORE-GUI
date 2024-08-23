public class Retailer extends Store {
    private double vatInclusivePrice;
    private double LoyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;

    // Adding Constructors
    public Retailer(int storeID, String storeName, String storeLocation, String openingHour, double totalSales,
            double totalDiscount, double vatInclusivePrice, boolean isPaymentOnline, String purchasedYear) {
        super(storeID, storeName, storeLocation, openingHour, totalSales, totalDiscount);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.LoyaltyPoint = 0;
    }

    // Creating Accessor Methods
    public double getVatInclusivePrice() {
        return this.vatInclusivePrice;
    }

    public boolean isPaymentOnline() {
        return this.isPaymentOnline;
    }

    public String getPurchasedYear() {
        return this.purchasedYear;
    }

    // Creating the Mutator Methods
    public void setisPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    // Creating a method to set Loyalty Point from VAT Inclusive Price
    public void setLoyaltyPoint(double vatInclusivePrice, boolean isPaymentOnline) {
        if (isPaymentOnline) {
            this.LoyaltyPoint = (int) (vatInclusivePrice * 0.01);

        }
    }

    public Double getLoyaltyPoint() {
        return this.LoyaltyPoint;
    }

    // Creating method for Removing Products
    public void removeProduct() {
        if (LoyaltyPoint == 0
                && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            vatInclusivePrice = 0;
            LoyaltyPoint = 0;
            isPaymentOnline = false;
            System.out.println("The product has been removed");
        }
    }

    // Display Method
    public void display() {
        if (LoyaltyPoint != 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") ||
                purchasedYear.equals("2022"))) {
            super.display();
            System.out.println("VAT Inclusive Price is: " + LoyaltyPoint + "rs");
            System.out.println("Purchased year is: " + purchasedYear);
        } else {
            // super.display();
            System.out.println("Product details is not available");
        }
    }
}
