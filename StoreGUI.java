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
        String years[] = { "2001", "2002", "2003", "2004", "2005", "2006", "2007" };
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
        totalDiscountLabel = new JLabel("Discount ");
        totalDiscountLabel.setBounds(450, 300, 100, 30);
        totalDiscountTextField = new JTextField();
        totalDiscountTextField.setBounds(550, 300, 150, 30);
        // totalDiscountTextField.setEditable(false);
        jFrame.add(totalDiscountTextField);
        jFrame.add(totalDiscountLabel);

        // label for Selling Price,
        sellingPriceLabel = new JLabel("Selling Price ");
        sellingPriceLabel.setBounds(450, 400, 100, 30);
        sellingPriceTextField = new JTextField();
        sellingPriceTextField.setBounds(550, 400, 150, 30);
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
                d.getProductName(productName);
                d.getSellingPrice(sellingPrice);
                d.getMarkedPrice(markedPrice);

                Store s = new Store(storeId, storeName, storeLocation, openingHour);
                s.Store_collection();
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
                Retailer r = new Retailer(storeId, storeName, storeLocation, openingHour, totalSales, totalDiscount,
                        vatInclusivePrice, isPaymentOnline, purchasedYear);

                r.display();
            }

        });
        jFrame.add(addRetailerButton);

        // remove the product button
        removeProductButton = new JButton("Remove the Product");
        removeProductButton.setBounds(450, 500, 250, 30);
        removeProductButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        jFrame.add(removeProductButton);

        // Display button
        displayButton = new JButton("Display");
        displayButton.setBounds(450, 550, 250, 30);
        displayButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

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
