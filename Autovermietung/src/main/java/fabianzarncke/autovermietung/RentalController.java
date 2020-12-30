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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class RentalController implements Initializable {

    @FXML
    private TextField TFstartdate;
    @FXML
    private TextField TFstarttime;
    @FXML
    private TextField TFenddate;
    @FXML
    private TextField TFendtime;
    @FXML
    private TextField TFhours;
    @FXML
    private Button BTNmainAction;
    @FXML
    private Button BTNedit;
    @FXML
    private Button BTNcancel;
    @FXML
    private Button BTNsave;
    @FXML
    private ListView<String> VehicleListView;
    @FXML
    private MenuButton VehicleChooseViewMenuButton;
    @FXML
    private ListView<String> CustomerListView;
    @FXML
    private MenuButton CustomerChooseViewMenuButton;
    @FXML
    private TextField TFlicensnumber;
    @FXML
    private TextField TFcustomernumber;
    @FXML
    private Label errorMessage;
    
    private String currentRental;
    @FXML
    private TextField TFprice;
    @FXML
    private Text TXTprice;
    
    private String alt;
    
    private String currentVehicle; //licensnumber
    private String currentCustomer; //customernumber

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        VehicleListView.getItems().clear();
        CustomerListView.getItems().clear();
        this.errorMessage.setText(" ");
        
        if(App.getCurrentObjective().equals("start/rental")) {
            TFstartdate.setEditable(true);
            TFstarttime.setEditable(true);
            TFenddate.setEditable(true);
            TFendtime.setEditable(true);
            TFhours.setEditable(true);
            TFprice.setVisible(false);
            BTNedit.setVisible(false);
            BTNcancel.setVisible(false);
            BTNsave.setVisible(false);
            BTNmainAction.setVisible(true);
        }
        else if(App.getCurrentObjective().equals("view/rental")) {
            RentalModel currentRentalModel = null;
            TFstartdate.setEditable(false);
            TFstarttime.setEditable(false);
            TFenddate.setEditable(false);
            TFendtime.setEditable(false);
            TFhours.setEditable(false);
            TFprice.setEditable(false);
            BTNedit.setVisible(true);
            BTNcancel.setVisible(false);
            BTNsave.setVisible(false);
            BTNmainAction.setVisible(false);
            
            String rnum = App.getRentals().get(App.getCurrentObejct()).getRentalnumber();
            for(RentalModel rental : App.getRentals()) {
                if(rental.getRentalnumber().equals(rnum)) {
                    currentRentalModel = rental;
                    currentRental = rental.getRentalnumber();
                }
            }
            
            TFstartdate.setText(currentRentalModel.getStartdate());
            TFstarttime.setText(currentRentalModel.getStarttime());
            TFenddate.setText(currentRentalModel.getEnddate());
            TFendtime.setText(currentRentalModel.getEndtime());
            TFhours.setText(String.valueOf(currentRentalModel.getHours()));
            TFprice.setText(String.valueOf(currentRentalModel.getPrice()) + "€");
        }
    }    

    @FXML
    private void goHome(MouseEvent event) throws IOException {
        App.setRoot("MainView");
    }


    @FXML
    private void BTNmainAction(ActionEvent event) {
    }

    @FXML
    private void BTNedit(ActionEvent event) {
        TFstartdate.setEditable(true);
        TFstarttime.setEditable(true);
        TFenddate.setEditable(true);
        TFendtime.setEditable(true);
        TFhours.setEditable(true);
        
        BTNsave.setVisible(true);
        BTNcancel.setVisible(true);
        BTNedit.setVisible(false);
    }

    @FXML
    private void BTNcancel(ActionEvent event) throws IOException {
        App.setRoot("RentalView");
    }

    @FXML
    private void BTNsave(ActionEvent event) throws IOException {
        for(RentalModel rental : App.getRentals()) {
            if(rental.getRentalnumber().equals(currentRental)) {
                rental.setStartdate(TFstartdate.getText());
                rental.setStarttime(TFstarttime.getText());
                rental.setEnddate(TFenddate.getText());
                rental.setEndtime(TFendtime.getText());
                rental.setHours(Double.parseDouble(TFhours.getText()));
                rental.calculatePrice();
            }
        }
        App.setRoot("RentalView");
    }


    @FXML
    private void BTNallVehicles(ActionEvent event) {
        VehicleListView.getItems().clear();
        for(VehicleModel vehicle : App.getVehicles()) {
            VehicleListView.getItems().add(vehicle.getBrand() + " " + vehicle.getName() + " " + vehicle.getLicensenumber() + " " + vehicle.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
        this.VehicleChooseViewMenuButton.setText("all Vehicles");
    }

    @FXML
    private void BTNallTrucks(ActionEvent event) {
        VehicleListView.getItems().clear();
        for(TruckModel truck : App.getTrucks()) {
            VehicleListView.getItems().add(truck.getBrand() + " " + truck.getName() + " " + truck.getLicensenumber() + " " + truck.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
        this.VehicleChooseViewMenuButton.setText("all Truck");
    }

    @FXML
    private void BTNallCars(ActionEvent event) {
        VehicleListView.getItems().clear();
        for(CarModel car : App.getCars()) {
            VehicleListView.getItems().add(car.getBrand() + " " + car.getName() + " " + car.getLicensenumber() + " " + car.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
        this.VehicleChooseViewMenuButton.setText("all Cars");
    }

    @FXML
    private void BTNallVans(ActionEvent event) {
        VehicleListView.getItems().clear();
        for(VanModel van : App.getVans()) {
            VehicleListView.getItems().add(van.getBrand() + " " + van.getName() + " " + van.getLicensenumber() + " " + van.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
        this.VehicleChooseViewMenuButton.setText("all Vans");
    }

    @FXML
    private void BTNallTrailers(ActionEvent event) {
        VehicleListView.getItems().clear();
        for(TrailerModel trailer : App.getTrailers()) {
            VehicleListView.getItems().add(trailer.getBrand() + " " + trailer.getName() + " " + trailer.getLicensenumber() + " " + trailer.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
        this.VehicleChooseViewMenuButton.setText("all Trailers");
    }

    @FXML
    private void BTNallCustomers(ActionEvent event) {
        CustomerListView.getItems().clear();
        for(CustomerModel customer : App.getCustomers()) {
            CustomerListView.getItems().add(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getCustomernumber() + " " + customer.isMaylend());
        }
        App.setCurrentCustomerListView("pcustomers");
        this.CustomerChooseViewMenuButton.setText("all Private Customers");
    }

    @FXML
    private void BTNallPcustomers(ActionEvent event) {
        CustomerListView.getItems().clear();
        for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
            CustomerListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
        }
        App.setCurrentCustomerListView("pcustomers");
        this.CustomerChooseViewMenuButton.setText("all Private Customers");
    }

    @FXML
    private void BTNallBcustomers(ActionEvent event) {
        CustomerListView.getItems().clear();
        for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
            CustomerListView.getItems().add(bcustomer.getFirstname() + " " + bcustomer.getLastname() + " " + bcustomer.getCustomernumber() + " " + bcustomer.isMaylend());
        }
        App.setCurrentCustomerListView("pcustomers");
        this.CustomerChooseViewMenuButton.setText("all Business Customers");
    }

    @FXML
    private void TFhoursSafeAlt(MouseEvent event) {
        this.alt = this.TFhours.getText();
        if(App.getCurrentObjective().equals("view/rental")) {
            TFhours.selectAll();
        }
    }

    @FXML
    private void TFhoursCheckNumeric(KeyEvent event) {
        if(this.TFhours.getText().matches("[0-9]*")) {
            this.alt = TFhours.getText();
        }
        else if(!this.TFhours.getText().matches("[0-9]*")) {
            TFhours.setText(alt);
            TFhours.requestFocus();
            TFhours.end();
        }
        else {
            System.out.println("There was an error! TFseats doesnt match certain aspects!");
        }
    }

    @FXML
    private void BTNVehicleListView(MouseEvent event) {
        App.setCurrentObejct(VehicleListView.getSelectionModel().getSelectedIndex());
        if(App.getCurrentVehicleListView().equals("vehicles")) {
            currentVehicle = App.getVehicles().get(App.getCurrentObejct()).getLicensenumber();
            TFlicensnumber.setText(currentVehicle);
        }
        else if(App.getCurrentVehicleListView().equals("trucks")) {
            currentVehicle = App.getTrucks().get(App.getCurrentObejct()).getLicensenumber();
            TFlicensnumber.setText(currentVehicle);
        }
        else if(App.getCurrentVehicleListView().equals("cars")) {
            currentVehicle = App.getCars().get(App.getCurrentObejct()).getLicensenumber();
            TFlicensnumber.setText(currentVehicle);
        }
        else if(App.getCurrentVehicleListView().equals("vans")) {
            currentVehicle = App.getVans().get(App.getCurrentObejct()).getLicensenumber();
            TFlicensnumber.setText(currentVehicle);
        }
        else if(App.getCurrentVehicleListView().equals("trailers")) {
            currentVehicle = App.getTrailers().get(App.getCurrentObejct()).getLicensenumber();
            TFlicensnumber.setText(currentVehicle);
        }
        else {
            System.out.println("There is not the right value set in App.getCurrentMainListView()");
        }
    }

    @FXML
    private void BTNCustomerListView(MouseEvent event) {
        App.setCurrentObejct(CustomerListView.getSelectionModel().getSelectedIndex());
        if(App.getCurrentCustomerListView().equals("customers")) {
            currentCustomer = App.getCustomers().get(App.getCurrentObejct()).getCustomernumber();
            TFcustomernumber.setText(currentCustomer);
        }
        else if(App.getCurrentCustomerListView().equals("pcustomers")) {
            currentCustomer = App.getCustomers().get(App.getCurrentObejct()).getCustomernumber();
            TFcustomernumber.setText(currentCustomer);
        }
        else if(App.getCurrentCustomerListView().equals("bcustomers")) {
            currentCustomer = App.getCustomers().get(App.getCurrentObejct()).getCustomernumber();
            TFcustomernumber.setText(currentCustomer);
        }
        else {
            System.out.println("There is not the right value set in App.getCurrentMainListView()");
        }
    }

    @FXML
    private void BTNtriggerCalculate(MouseEvent event) {
        for(RentalModel rental : App.getRentals()) {
            if(currentRental.equals(rental.getRentalnumber())) {
                rental.calculatePrice();
            }
        }
    }
    
}
