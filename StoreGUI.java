import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreGUI {

    JFrame jFrame;

    // checkbox
    JCheckBox online;
    JCheckBox cash;

    // dropdowns
    @SuppressWarnings("rawtypes")
    JComboBox purchasedYearComboBox;

    // labels
    JLabel headingLabel;
    JLabel storeIdLabel;
    JLabel storeNameLabel;
    JLabel locationLabel;
    JLabel openingHourLabel;
    JLabel totalSalesLabel;
    JLabel totalDiscountLabel;
    JLabel productNameLabel;
    JLabel markedPriceLabel;
    JLabel sellingPriceLabel;
    JLabel vatLabel;
    JLabel loyaltyPointLabel;
    JLabel paymentMethodLabel;
    JLabel purchasedYearLabel;

    // textFields
    JTextField storeNameTextField;
    JTextField storeIdTextField;
    JTextField locationTextField;
    JTextField openingHourTextField;
    JTextField productNameTextField;
    JTextField markedPriceTextField;
    JTextField sellingPriceTextField;
    JTextField totalDiscountTextField;
    JTextField totalSalesTextField;
    JTextField vatTextField;
    JTextField loyaltyPointTextField;

    // Button
    JButton calDiscountButton;
    JButton addDepartmentButton;
    JButton addRetailerButton;
    JButton setLoyaltyPointButton;
    JButton removeProductButton;
    JButton displayButton;
    JButton clearButton;

    public StoreGUI() {

        // creating the object
        jFrame = new JFrame("My Store");
        // heading
        headingLabel = new JLabel("Mero Store");
        headingLabel.setBounds(325, 50, 300, 30);
        headingLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
        // headingLabel.setFont();
        jFrame.add(headingLabel);

        // label for store id,
        storeIdLabel = new JLabel("Store Id ");
        storeIdLabel.setBounds(100, 150, 100, 30);
        storeIdTextField = new JTextField("");
        storeIdTextField.setBounds(200, 150, 150, 30);
        jFrame.add(storeIdTextField);
        jFrame.add(storeIdLabel);

        // label for store name,
        storeNameLabel = new JLabel("Store Name ");
        storeNameLabel.setBounds(100, 200, 100, 30);
        storeNameTextField = new JTextField("");
        storeNameTextField.setBounds(200, 200, 150, 30);
        jFrame.add(storeNameTextField);
        jFrame.add(storeNameLabel);

        // label for location,
        locationLabel = new JLabel("Location ");
        locationLabel.setBounds(100, 250, 100, 30);
        locationTextField = new JTextField();
        locationTextField.setBounds(200, 250, 150, 30);
        jFrame.add(locationTextField);
        jFrame.add(locationLabel);

        // label for opening hour,
        openingHourLabel = new JLabel("Opening Hour ");
        openingHourLabel.setBounds(100, 300, 100, 30);
        openingHourTextField = new JTextField();
        openingHourTextField.setBounds(200, 300, 150, 30);
        jFrame.add(openingHourTextField);
        jFrame.add(openingHourLabel);

        // label for purchased Year,
        String years[] = { "2020", "2021", "2022", "2023", "2024", "2025", "2007" };
        purchasedYearLabel = new JLabel("Purchased Year ");
        purchasedYearLabel.setBounds(100, 350, 100, 30);
        purchasedYearComboBox = new JComboBox<>(years);
        purchasedYearComboBox.setBounds(200, 350, 150, 30);
        jFrame.add(purchasedYearLabel);
        jFrame.add(purchasedYearComboBox);

        // label for loyalty point,
        loyaltyPointLabel = new JLabel("Loyalty Point ");
        loyaltyPointLabel.setBounds(100, 400, 100, 30);
        loyaltyPointTextField = new JTextField();
        loyaltyPointTextField.setBounds(200, 400, 150, 30);
        loyaltyPointTextField.setEditable(false);
        jFrame.add(loyaltyPointTextField);
        jFrame.add(loyaltyPointLabel);

        // label for Check Box : Payment Method
        paymentMethodLabel = new JLabel("Payment");
        paymentMethodLabel.setBounds(100, 450, 100, 30);
        online = new JCheckBox("Online");
        online.setBounds(200, 450, 80, 30);
        cash = new JCheckBox("Cash");
        cash.setBounds(280, 450, 100, 30);

        jFrame.add(paymentMethodLabel);
        jFrame.add(online);
        jFrame.add(cash);

        // label for Product name,
        productNameLabel = new JLabel("Product Name ");
        productNameLabel.setBounds(450, 150, 100, 30);
        productNameTextField = new JTextField();
        productNameTextField.setBounds(550, 150, 150, 30);
        jFrame.add(productNameTextField);
        jFrame.add(productNameLabel);

        // label for Market Price,
        markedPriceLabel = new JLabel("Marked Price ");
        markedPriceLabel.setBounds(450, 200, 100, 30);
        markedPriceTextField = new JTextField();
        markedPriceTextField.setBounds(550, 200, 150, 30);
        jFrame.add(markedPriceTextField);
        jFrame.add(markedPriceLabel);

        // label for Total Sales,
        totalSalesLabel = new JLabel("Total Sales ");
        totalSalesLabel.setBounds(450, 250, 100, 30);
        totalSalesTextField = new JTextField();
        totalSalesTextField.setBounds(550, 250, 150, 30);
        jFrame.add(totalSalesTextField);
        jFrame.add(totalSalesLabel);

        // label for Discount,
        totalDiscountLabel = new JLabel("Total Discount ");
        totalDiscountLabel.setBounds(450, 300, 100, 30);
        totalDiscountTextField = new JTextField();
        totalDiscountTextField.setBounds(550, 300, 150, 30);
        totalDiscountTextField.setEditable(false);
        jFrame.add(totalDiscountTextField);
        jFrame.add(totalDiscountLabel);

        // label for Selling Price,
        sellingPriceLabel = new JLabel("Selling Price ");
        sellingPriceLabel.setBounds(450, 400, 100, 30);
        sellingPriceTextField = new JTextField();
        sellingPriceTextField.setBounds(550, 400, 150, 30);
        sellingPriceTextField.setEditable(false);
        jFrame.add(sellingPriceTextField);
        jFrame.add(sellingPriceLabel);

        // label for VAT,
        vatLabel = new JLabel("VAT inclusive");
        vatLabel.setBounds(450, 450, 100, 30);
        vatTextField = new JTextField();
        vatTextField.setBounds(550, 450, 150, 30);
        jFrame.add(vatTextField);
        jFrame.add(vatLabel);

        // BUTTONS
        // discount button
        calDiscountButton = new JButton("Calculate Discount");
        calDiscountButton.setBounds(450, 350, 250, 30);
        calDiscountButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double markedPrice = Double.parseDouble(markedPriceTextField.getText());
                double totalDiscount = 0;
                Department department = new Department(0, null, null, null, 0, totalDiscount,
                        null, markedPrice, 0);
                department.calculatedDiscountPrice(markedPrice, totalDiscount);
                sellingPriceTextField.setText(Double.toString(department.getSellingPrice()));
                totalDiscountTextField.setText(Double.toString(department.getTotalDiscount()));

            }

        });
        jFrame.add(calDiscountButton);

        // loyalty point button
        setLoyaltyPointButton = new JButton("Set the loyalty point");
        setLoyaltyPointButton.setBounds(100, 500, 250, 30);
        setLoyaltyPointButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPaymentOnline = online.isSelected();
                double vatInclusivePrice = Double.parseDouble(vatTextField.getText());

                Retailer r = new Retailer(0, null, null, null, 0.0, 0.0,
                        vatInclusivePrice, isPaymentOnline, null);

                r.setLoyaltyPoint(vatInclusivePrice, isPaymentOnline);
                loyaltyPointTextField.setText(Double.toString(r.getLoyaltyPoint()));

            }

        });
        jFrame.add(setLoyaltyPointButton);

        // add a department button
        addDepartmentButton = new JButton("Add a Department");
        addDepartmentButton.setBounds(100, 550, 250, 30);
        addDepartmentButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int storeId = Integer.parseInt(storeIdTextField.getText());
                String storeName = storeNameTextField.getText();
                String storeLocation = locationTextField.getText();
                String openingHour = openingHourTextField.getText();
                String productName = productNameTextField.getText();
                double totalSales = Double.parseDouble(totalSalesTextField.getText());
                double totalDiscount = Double.parseDouble(totalDiscountTextField.getText());
                double markedPrice = Double.parseDouble(markedPriceTextField.getText());
                double sellingPrice = Double.parseDouble(sellingPriceTextField.getText());
                Department d = new Department(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount,
                        productName, markedPrice, sellingPrice);
                d.setProductName(productName);
                d.setSellingPrice(sellingPrice);
                d.setMarkedPrice(markedPrice);

                Store s = new Store(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount);
                s.addDepartment(d);
                JOptionPane.showMessageDialog(jFrame, "Department added successfully!");
                d.display();

            }

        });
        jFrame.add(addDepartmentButton);

        // add a retailer button
        addRetailerButton = new JButton("Add a Retailer");
        addRetailerButton.setBounds(100, 600, 250, 30);
        addRetailerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int storeId = Integer.parseInt(storeIdTextField.getText());
                String storeName = storeNameTextField.getText();
                String storeLocation = locationTextField.getText();
                String openingHour = openingHourTextField.getText();
                String purchasedYear = (String) purchasedYearComboBox
                        .getItemAt(purchasedYearComboBox.getSelectedIndex());
                boolean isPaymentOnline = online.isSelected();
                double totalSales = Double.parseDouble(totalSalesTextField.getText());
                double totalDiscount = Double.parseDouble(totalDiscountTextField.getText());
                double vatInclusivePrice = Double.parseDouble(vatTextField.getText());
                Retailer retailer = new Retailer(storeId, storeName, storeLocation, openingHour, totalSales,
                        totalDiscount,
                        vatInclusivePrice, isPaymentOnline, purchasedYear);
                Store store = new Store(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount);
                store.addRetailer(retailer);
                JOptionPane.showMessageDialog(jFrame, "Retailer added successfully!");
                retailer.display();
            }

        });
        jFrame.add(addRetailerButton);

        // remove the product button
        removeProductButton = new JButton("Remove the Product");
        removeProductButton.setBounds(450, 500, 250, 30);
        removeProductButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String purchasedYear = (String) purchasedYearComboBox
                .getItemAt(purchasedYearComboBox.getSelectedIndex());
                Retailer r = new Retailer(0, null, null, null, 0, 0, 0, false, purchasedYear);
                r.removeProduct();
                JOptionPane.showMessageDialog(jFrame, "Product removed successfully!");

            }

        });
        jFrame.add(removeProductButton);

        // Display button
        displayButton = new JButton("Display");
        displayButton.setBounds(450, 550, 250, 30);
        displayButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int storeId = Integer.parseInt(storeIdTextField.getText());
                String storeName = storeNameTextField.getText();
                String storeLocation = locationTextField.getText();
                String openingHour = openingHourTextField.getText();
                double totalSales = Double.parseDouble(totalSalesTextField.getText());
                double totalDiscount = Double.parseDouble(totalDiscountTextField.getText());
                String purchasedYear = (String) purchasedYearComboBox
                        .getItemAt(purchasedYearComboBox.getSelectedIndex());
                boolean isPaymentOnline = online.isSelected();
                double vatInclusivePrice = Double.parseDouble(vatTextField.getText());
                String productName = productNameTextField.getText();
                double markedPrice = Double.parseDouble(markedPriceTextField.getText());
                double sellingPrice = Double.parseDouble(sellingPriceTextField.getText());

                StringBuilder displayText = new StringBuilder();
                Store store = new Store(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount);

                displayText.append("Store ID: ").append(store.getStoreId()).append("\n")
                        .append("Store Name: ").append(store.getStoreName()).append("\n")
                        .append("Location: ").append(store.getStoreLocation()).append("\n")
                        .append("Opening Hour: ").append(store.getOpeningHour()).append("\n")
                        .append("Total Sales: ").append(store.getTotalSales()).append("\n")
                        .append("Total Discount: ").append(store.getTotalDiscount()).append("\n");

                // Display departments
                displayText.append("Departments:\n");
                Department department = new Department(storeId, storeName, storeLocation, openingHour, totalSales,
                        totalDiscount,
                        productName, markedPrice, sellingPrice);

                displayText.append("  Product Name: ").append(department.getProductName()).append("\n");

                // Display retailers
                displayText.append("Retailers:\n");
                Retailer retailer = new Retailer(storeId, storeName, storeLocation, openingHour, totalSales,
                        totalDiscount,
                        vatInclusivePrice, isPaymentOnline, purchasedYear);
                displayText.append("  VAT Inclusive Price: ").append(retailer.getVatInclusivePrice())
                        .append("\n")
                        .append("  Payment Online: ").append(retailer.isPaymentOnline()).append("\n")
                        .append("  Purchased Year: ").append(retailer.getPurchasedYear()).append("\n");

                displayText.append("\n");

                // Display all the information in a message dialog
                JTextArea textArea = new JTextArea(displayText.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                scrollPane.setPreferredSize(new java.awt.Dimension(400, 400));

                JOptionPane.showMessageDialog(jFrame, scrollPane, "Store Information", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        jFrame.add(displayButton);

        // clear button
        clearButton = new JButton("Clear");
        clearButton.setBounds(450, 600, 250, 30);
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                storeNameTextField.setText("");
                ;
                storeIdTextField.setText("");
                ;
                locationTextField.setText("");
                ;
                openingHourTextField.setText("");
                ;
                productNameTextField.setText("");
                ;
                markedPriceTextField.setText("");
                ;
                sellingPriceTextField.setText("");
                ;
                totalDiscountTextField.setText("");
                ;
                totalSalesTextField.setText("");
                ;
                vatTextField.setText("");
                loyaltyPointTextField.setText("");
                ;
                online.setSelected(false);
                cash.setSelected(false);

            }

        });
        jFrame.add(clearButton);

        jFrame.setLayout(null);
        // setting the height and width
        jFrame.setSize(850, 800);

        // enables us to see our GUI panel
        jFrame.setVisible(true);

        /* terminate the program whenever GUI close buttion is clicked */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        StoreGUI ns = new StoreGUI();

    }
}
