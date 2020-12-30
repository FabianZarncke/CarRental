/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.autovermietung;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class CustomerController implements Initializable {

    @FXML
    private TextField TFfirstname;
    @FXML
    private TextField TFlastname;
    @FXML
    private TextField TFbirthdate;
    @FXML
    private TextField TFadress;
    @FXML
    private TextField TFphonenumber;
    @FXML
    private CheckBox CBmaylend;
    @FXML
    private TextField TFcustomernumber;
    @FXML
    private TextField TFcontact;
    @FXML
    private TextField TFbusinessadress;
    @FXML
    private TextField TFbusinessphonenumber;
    @FXML
    private Button BTNedit;
    @FXML
    private Button BTNsave;
    @FXML
    private Button BTNcancel;
    @FXML
    private ListView<String> ListView;
    @FXML
    private MenuButton chooseViewMenuButton;
    @FXML
    private Label errorMessage;
    @FXML
    private Button BTNmainAction;
    
    private String currentCustomer; //cutomernumber
    @FXML
    private Text TXTcontact;
    @FXML
    private Text TXTbusinessadress;
    @FXML
    private Text TXTbusinessphonenumber;
    @FXML
    private Text TXTcustomernumber;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListView.getItems().clear();
        this.errorMessage.setText(" ");
        
        if(App.getCurrentObjective().equals("create/pcustomer")) {
            TFfirstname.setVisible(true);
            TFlastname.setVisible(true);
            TFbirthdate.setVisible(true);
            TFadress.setVisible(true);
            TFphonenumber.setVisible(true);
            CBmaylend.setVisible(true);
            TFcustomernumber.setVisible(false);
            TFcontact.setVisible(true);
            TFbusinessadress.setVisible(false);
            TFbusinessphonenumber.setVisible(false);
            TXTcontact.setVisible(true);
            TXTbusinessadress.setVisible(false);
            TXTbusinessphonenumber.setVisible(false);
            TXTcustomernumber.setVisible(false);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(false);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Private Customer");
            TFfirstname.setEditable(true);
            TFlastname.setEditable(true);
            TFbirthdate.setEditable(true);
            TFadress.setEditable(true);
            TFphonenumber.setEditable(true);
            CBmaylend.setDisable(false);
            TFcustomernumber.setEditable(false);
            TFcontact.setEditable(true);
            TFbusinessadress.setEditable(false);
            TFbusinessphonenumber.setEditable(false);
        }
        else if(App.getCurrentObjective().equals("create/bcustomer")) {
            TFfirstname.setVisible(true);
            TFlastname.setVisible(true);
            TFbirthdate.setVisible(true);
            TFadress.setVisible(true);
            TFphonenumber.setVisible(true);
            CBmaylend.setVisible(true);
            TFcustomernumber.setVisible(false);
            TFcontact.setVisible(false);
            TFbusinessadress.setVisible(true);
            TFbusinessphonenumber.setVisible(true);
            TXTcontact.setVisible(false);
            TXTbusinessadress.setVisible(true);
            TXTbusinessphonenumber.setVisible(true);
            TXTcustomernumber.setVisible(false);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(false);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Business Customer");
            TFfirstname.setEditable(true);
            TFlastname.setEditable(true);
            TFbirthdate.setEditable(true);
            TFadress.setEditable(true);
            TFphonenumber.setEditable(true);
            CBmaylend.setDisable(false);
            TFcustomernumber.setEditable(false);
            TFcontact.setEditable(false);
            TFbusinessadress.setEditable(true);
            TFbusinessphonenumber.setEditable(true);
        }
        else if(App.getCurrentObjective().equals("view/pcustomer")) {
            PrivateCustomerModel currentPrivateCustomer = null;
            TFfirstname.setVisible(true);
            TFlastname.setVisible(true);
            TFbirthdate.setVisible(true);
            TFadress.setVisible(true);
            TFphonenumber.setVisible(true);
            CBmaylend.setVisible(true);
            TFcustomernumber.setVisible(true);
            TFcontact.setVisible(true);
            TFbusinessadress.setVisible(false);
            TFbusinessphonenumber.setVisible(false);
            TXTcontact.setVisible(true);
            TXTbusinessadress.setVisible(false);
            TXTbusinessphonenumber.setVisible(false);
            TXTcustomernumber.setVisible(true);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Start Rental");
            TFfirstname.setEditable(false);
            TFlastname.setEditable(false);
            TFbirthdate.setEditable(false);
            TFadress.setEditable(false);
            TFphonenumber.setEditable(false);
            CBmaylend.setDisable(true);
            CBmaylend.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFcustomernumber.setEditable(false);
            TFadress.setEditable(false);
            TFbusinessadress.setEditable(false);
            TFbusinessphonenumber.setEditable(false);
            
            
            
            for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
                ListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
            }
            
            if(App.getCurrentMainListView().equals("customers")) {
                String cnum = App.getCustomers().get(App.getCurrentObejct()).getCustomernumber();
                for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
                    if(pcustomer.getCustomernumber().equals(cnum)) {
                        currentPrivateCustomer = pcustomer;
                        currentCustomer = currentPrivateCustomer.getCustomernumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("pcustomers")) {
                currentPrivateCustomer = App.getPcustomers().get(App.getCurrentObejct());
                currentCustomer = currentPrivateCustomer.getCustomernumber();
            }

            
            TFfirstname.setText(currentPrivateCustomer.getFirstname());
            TFlastname.setText(currentPrivateCustomer.getLastname());
            TFbirthdate.setText(currentPrivateCustomer.getBirthdate());
            TFadress.setText(currentPrivateCustomer.getAdress());
            TFphonenumber.setText(currentPrivateCustomer.getPhonenumber());
            CBmaylend.setSelected(currentPrivateCustomer.isMaylend());
            TFcontact.setText(currentPrivateCustomer.getContact());
            
        }
        else if(App.getCurrentObjective().equals("view/bcustomer")) {
            BusinessCustomerModel currentBusinesscustomer = null;
            TFfirstname.setVisible(true);
            TFlastname.setVisible(true);
            TFbirthdate.setVisible(true);
            TFadress.setVisible(true);
            TFphonenumber.setVisible(true);
            CBmaylend.setVisible(true);
            TFcustomernumber.setVisible(true);
            TFcontact.setVisible(false);
            TFbusinessadress.setVisible(true);
            TFbusinessphonenumber.setVisible(true);
            TXTcontact.setVisible(false);
            TXTbusinessadress.setVisible(true);
            TXTbusinessphonenumber.setVisible(true);
            TXTcustomernumber.setVisible(true);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Start Rental");
            TFfirstname.setEditable(false);
            TFlastname.setEditable(false);
            TFbirthdate.setEditable(false);
            TFadress.setEditable(false);
            TFphonenumber.setEditable(false);
            CBmaylend.setDisable(true);
            CBmaylend.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFcustomernumber.setEditable(false);
            TFadress.setEditable(false);
            TFbusinessadress.setEditable(false);
            TFbusinessphonenumber.setEditable(false);
            
            
            
            for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
                ListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
            }
            
            if(App.getCurrentMainListView().equals("customers")) {
                String cnum = App.getCustomers().get(App.getCurrentObejct()).getCustomernumber();
                for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
                    if(bcustomer.getCustomernumber().equals(cnum)) {
                        currentBusinesscustomer = bcustomer;
                        currentCustomer = currentBusinesscustomer.getCustomernumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("bcustomers")) {
                currentBusinesscustomer = App.getBcustomers().get(App.getCurrentObejct());
                currentCustomer = currentBusinesscustomer.getCustomernumber();
            }

            
            TFfirstname.setText(currentBusinesscustomer.getFirstname());
            TFlastname.setText(currentBusinesscustomer.getLastname());
            TFbirthdate.setText(currentBusinesscustomer.getBirthdate());
            TFadress.setText(currentBusinesscustomer.getAdress());
            TFphonenumber.setText(currentBusinesscustomer.getPhonenumber());
            CBmaylend.setSelected(currentBusinesscustomer.isMaylend());
            TFbusinessadress.setText(currentBusinesscustomer.getBusinessAdress());
            TFbusinessphonenumber.setText(currentBusinesscustomer.getBusinessPhonenumber());
       }
    }    

    @FXML
    private void goHome(MouseEvent event) throws IOException {
        App.setRoot("MainView");
    }

    @FXML
    private void BTNedit(ActionEvent event) {
        TFfirstname.setEditable(true);
        TFlastname.setEditable(true);
        TFbirthdate.setEditable(true);
        TFadress.setEditable(true);
        TFphonenumber.setEditable(true);
        TFcontact.setEditable(true);
        TFbusinessadress.setEditable(true);
        TFbusinessphonenumber.setEditable(true);
        CBmaylend.setDisable(false);
        
        BTNsave.setVisible(true);
        BTNcancel.setVisible(true);
        BTNedit.setVisible(false);
    }

    @FXML
    private void BTNsave(ActionEvent event) throws IOException {
        if(App.getCurrentObjective().equals("view/pcustomer")) {
            for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
                if(pcustomer.getCustomernumber().equals(currentCustomer)) {
                    pcustomer.setFirstname(TFfirstname.getText());
                    pcustomer.setLastname(TFlastname.getText());
                    pcustomer.setBirthdate(TFbirthdate.getText());
                    pcustomer.setAdress(TFadress.getText());
                    pcustomer.setPhonenumber(TFphonenumber.getText());
                    pcustomer.setMaylend(CBmaylend.isSelected());
                    pcustomer.setContact(TFcontact.getText());
                }
            }
        }
        else if(App.getCurrentObjective().equals("view/bcustomer")) {
            for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
                if(bcustomer.getCustomernumber().equals(currentCustomer)) {
                    bcustomer.setFirstname(TFfirstname.getText());
                    bcustomer.setLastname(TFlastname.getText());
                    bcustomer.setBirthdate(TFbirthdate.getText());
                    bcustomer.setAdress(TFadress.getText());
                    bcustomer.setPhonenumber(TFphonenumber.getText());
                    bcustomer.setMaylend(CBmaylend.isSelected());
                    bcustomer.setBusinessAdress(TFbusinessadress.getText());
                    bcustomer.setBusinessPhonenumber(TFbusinessphonenumber.getText());
                }
            }
        }
        else {
            System.out.println("There was an error. App.getCurrentObjective either not set or has wrong value");
        }
        App.setRoot("CustomerView");
    }

    @FXML
    private void BTNcancel(ActionEvent event) throws IOException {
        App.setRoot("CustomerView");
    }

    @FXML
    private void BTNmainaction(ActionEvent event) throws IOException {
        if(this.TFfirstname.getText().trim().isEmpty() || this.TFlastname.getText().trim().isEmpty() || this.TFbirthdate.getText().trim().isEmpty() || this.TFadress.getText().trim().isEmpty() || this.TFphonenumber.getText().trim().isEmpty()) {
            this.errorMessage.setText("please fill out every field!");
            System.out.println("please fill out every field!");
        }
        else {
            if(App.getCurrentObjective().equals("view/pcustomer") || App.getCurrentObjective().equals("view/bcustomer")) {
                App.setRoot("RentalView");
            }
            else if(App.getCurrentObjective().equals("create/pcustomer") || App.getCurrentObjective().equals("create/bcustomer")) {
                String sfirstname = this.TFfirstname.getText();
                String slastname = this.TFlastname.getText();
                String sbirthdate = this.TFbirthdate.getText();
                String sadress = this.TFadress.getText();
                String sphonenumber = this.TFphonenumber.getText();
                boolean sismaylend = this.CBmaylend.isSelected();
                
                if(App.getCurrentObjective().equals("create/pcustomer")) {
                    String scontact = this.TFcontact.getText();
                    PrivateCustomerModel pcustomer = new PrivateCustomerModel(scontact, sfirstname, slastname, sbirthdate, sadress, sphonenumber);
                    App.addCustomer(pcustomer);
                    App.addPrivateCustomer(pcustomer);
                }
                else if(App.getCurrentObjective().equals("create/bcustomer")) {
                    String sbusinessadress = this.TFbusinessadress.getText();
                    String sbusinessphonenumber = this.TFbusinessphonenumber.getText();
                    BusinessCustomerModel bcustomer = new BusinessCustomerModel(sbusinessadress, sbusinessphonenumber, sfirstname, slastname, sbirthdate, sadress, sphonenumber);
                    App.addCustomer(bcustomer);
                    App.addBusinessCustomer(bcustomer);
                }
                else {
                    System.out.println("There was an error! App.CurrentObejctive not set.");
                }
                App.setRoot("MainView");
            }
        }
    }
    
    @FXML
    private void BTNListView(MouseEvent event) throws IOException {
        App.setCurrentObejct(ListView.getSelectionModel().getSelectedIndex());
        if(App.getCurrentMainListView().equals("customers")) {
            if(App.getCustomers().get(App.getCurrentObejct()).getClass().getSimpleName().equals("PrivateCustomerModel")){
                App.setCurrentObjective("view/pcustomer");
                App.setRoot("CustomerView");
            }
            else if(App.getCustomers().get(App.getCurrentObejct()).getClass().getSimpleName().equals("BusinessCustomerModel")){
                App.setCurrentObjective("view/bcustomer");
                App.setRoot("CustomerView");
            }
            else {
                System.out.println("There is no right value set in App.getVehicles().get(App.getCurrentObejct()).getClass().getName()");
            }
        }
        else if(App.getCurrentCustomerListView().equals("pcustomers")) {
            App.setCurrentObjective("view/pcustomer");
            App.setRoot("CustomerView");
        }
        else if(App.getCurrentCustomerListView().equals("bcustomers")) {
            App.setCurrentObjective("view/bcustomer");
            App.setRoot("CustomerView");
        }
        else {
            System.out.println("There is not the right value set in App.getCurrentMainListView()");
        }
    }

    @FXML
    private void BTNallCustomers(ActionEvent event) {
        ListView.getItems().clear();
        for(CustomerModel customer : App.getCustomers()) {
            ListView.getItems().add(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getCustomernumber() + " " + customer.isMaylend());
        }
        App.setCurrentCustomerListView("customers");
        this.chooseViewMenuButton.setText("all Customers");
    }

    @FXML
    private void BTNallPCustomers(ActionEvent event) {
        ListView.getItems().clear();
        for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
            ListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
        }
        App.setCurrentCustomerListView("pcustomers");
        this.chooseViewMenuButton.setText("all Private Customers");
    }

    @FXML
    private void BTNallBCustomer(ActionEvent event) {
        ListView.getItems().clear();
        for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
            ListView.getItems().add(bcustomer.getFirstname() + " " + bcustomer.getLastname() + " " + bcustomer.getCustomernumber() + " " + bcustomer.isMaylend());
        }
        App.setCurrentCustomerListView("bcustomers");
        this.chooseViewMenuButton.setText("all Business Customers");
    }
}
