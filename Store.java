import java.util.ArrayList;

public class Store {
    // Declaring the variables
    private int storeId;
    private String storeName;
    private String storeLocation;
    private String openingHour;
    private double TotalSales;
    public double TotalDiscount;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Retailer> retailers = new ArrayList<>();

    // Declaring the constructors
    public Store(int storeId, String storeName, String storeLocation, String openingHour, double totalSales,
            double totalDiscount) {
        this.TotalSales = totalSales;
        this.TotalDiscount = totalDiscount;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.openingHour = openingHour;
        this.departments = new ArrayList<>();
        this.retailers = new ArrayList<>();
    }

    // Creating all accessor methods
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public int getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreLocation() {
        return this.storeLocation;
    }

    public String getOpeningHour() {
        return this.openingHour;
    }

    // Creating Mutator methods
    public void setTotalSales(double totalSales) {
        this.TotalSales = totalSales;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.TotalDiscount = totalDiscount;
    }

    public double getTotalSales() {
        return this.TotalSales;
    }

    public double getTotalDiscount() {
        return this.TotalDiscount;
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

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void addRetailer(Retailer retailer) {
        this.retailers.add(retailer);
    }

    public ArrayList<Department> getDepartments() {
        return this.departments;
    }

    public ArrayList<Retailer> getRetailers() {
        return this.retailers;
    }
}
