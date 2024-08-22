
public class Store {
    // Declaring the variables
    private int storeId;
    private String storeName;
    private String storeLocation;
    private String openingHour;
    private double TotalSales;
    private double TotalDiscount;

    // Declaring the constructors
    public Store(int storeId, String storeName, String storeLocation, String openingHour) {
        this.TotalSales = 0.0;
        this.TotalDiscount = 0.0;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.openingHour = openingHour;
    }

    // Creating all accessor methods
    public int getStoreId(int storeId) {

        return this.storeId = storeId;

    }

    public String getStoreName(String storeName) {
        return this.storeName = storeName;
    }

    public String getStoreLocation(String storeLocation) {
        return this.storeLocation = storeLocation;
    }

    public String getOpeningHour(String openingHour) {
        return this.openingHour = openingHour;
    }

    // Creating Mutator methods
    public void setTotalSales(double totalSales) {
        this.TotalSales = totalSales;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.TotalDiscount = totalDiscount;
    }

    public void display() {
        if (TotalSales == 0 && TotalDiscount == 0) {
            System.out.println("Sales or Discount has'nt been made.");
        } else {
            System.out.println("StoreId:" + storeId);
            System.out.println("Store Name:" + storeName);
            System.out.println("Store Loaction:" + storeLocation);
            System.out.println("Store Opening Hour:" + openingHour);
            System.out.println("Total Sales:" + TotalSales);
            System.out.println("Total Discount:" + TotalDiscount);
        }
    }

    public void Store_collection() {
        Store[] stores = new Store[20];

    }

}
