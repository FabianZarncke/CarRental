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
import javafx.scene.control.ListView;   
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class MainController implements Initializable {

    @FXML
    private ListView<String> ListView;
    @FXML
    private MenuButton ListviewMenuButton;
    @FXML
    private TextField searchbar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(App.getCurrentMainListView().equals("rentals")) {
            for(RentalModel rental : App.getRentals()) {
                double hours = rental.getHours();
                double price = App.getPrice();
                double costs = hours*price;

                ListView.getItems().add(rental.getVehicle().getName() + " " + rental.getVehicle().getLicenseplate() + " " + rental.getCustomer().getFirstname() + " " + rental.getCustomer().getLastname() + "/Price: " + costs);
            }
            this.ListviewMenuButton.setText("all Rentals");
        }
        else if(App.getCurrentMainListView().equals("vehicles")) {
            for(VehicleModel vehicle : App.getVehicles()) {
                ListView.getItems().add(vehicle.getBrand() + " " + vehicle.getName() + " " + vehicle.getLicensenumber() + " " + vehicle.isAvailable());
            }
            this.ListviewMenuButton.setText("all Vehicles");
        }
        else if(App.getCurrentMainListView().equals("trucks")) {
            for(TruckModel truck : App.getTrucks()) {
                ListView.getItems().add(truck.getBrand() + " " + truck.getName() + " " + truck.getLicensenumber() + " " + truck.isAvailable());
            }
            this.ListviewMenuButton.setText("all Trucks");
        }
        else if(App.getCurrentMainListView().equals("cars")) {
            for(CarModel car : App.getCars()) {
                ListView.getItems().add(car.getBrand() + " " + car.getName() + " " + car.getLicensenumber() + " " + car.isAvailable());
            }
            this.ListviewMenuButton.setText("all Cars");
        }
        else if(App.getCurrentMainListView().equals("vans")) {
            for(VanModel van : App.getVans()) {
                ListView.getItems().add(van.getBrand() + " " + van.getName() + " " + van.getLicensenumber() + " " + van.isAvailable());
            }
            this.ListviewMenuButton.setText("all Vans");
        }
        else if(App.getCurrentMainListView().equals("trailers")) {
            for(TrailerModel trailer : App.getTrailers()) {
                ListView.getItems().add(trailer.getBrand() + " " + trailer.getName() + " " + trailer.getLicensenumber() + " " + trailer.isAvailable());
            }
            this.ListviewMenuButton.setText("all Trailers");
        }
        else if(App.getCurrentMainListView().equals("customers")) {
            for(CustomerModel customer : App.getCustomers()) {
                ListView.getItems().add(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getCustomernumber() + " " + customer.isMaylend());
            }
            this.ListviewMenuButton.setText("all Customers");
        }
        else if(App.getCurrentMainListView().equals("pcustomers")) {
            for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
                ListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
            }
            this.ListviewMenuButton.setText("all Private Customers");
        }
        else if(App.getCurrentMainListView().equals("bcustomers")) {
            for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
                ListView.getItems().add(bcustomer.getFirstname() + " " + bcustomer.getLastname() + " " + bcustomer.getCustomernumber() + " " + bcustomer.isMaylend());
            }
            this.ListviewMenuButton.setText("all Business Customers");
        }
    }

    @FXML
    private void addTruckBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/truck");
        App.setRoot("VehicleView");
    }

    @FXML
    private void addCarBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/car");
        App.setRoot("VehicleView");
    }

    @FXML
    private void addVanBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/van");
        App.setRoot("VehicleView");
    }

    @FXML
    private void addTrailerBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/trailer");
        App.setRoot("VehicleView");
    }

    @FXML
    private void addPCustomerBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/pcustomer");
        App.setRoot("CustomerView");
    }

    @FXML
    private void addBCustomerBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("create/bcustomer");
        App.setRoot("CustomerView");
    }

    @FXML
    private void startRentalBTN(ActionEvent event) throws IOException {
        App.setCurrentObjective("start/rental");
        App.setRoot("RentalView");
    }

    @FXML
    private void viewAllVehiclesBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(VehicleModel vehicle : App.getVehicles()) {
            ListView.getItems().add(vehicle.getBrand() + " " + vehicle.getName() + " " + vehicle.getLicensenumber() + " " + vehicle.isAvailable());
        }
        App.setCurrentMainListView("vehicles");
        this.ListviewMenuButton.setText("all Vehicles");
    }

    @FXML
    private void viewAllTrucksBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(TruckModel truck : App.getTrucks()) {
            ListView.getItems().add(truck.getBrand() + " " + truck.getName() + " " + truck.getLicensenumber() + " " + truck.isAvailable());
        }
        App.setCurrentMainListView("trucks");
        this.ListviewMenuButton.setText("all Trucks");
    }

    @FXML
    private void viewAllCarsBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(CarModel car : App.getCars()) {
            ListView.getItems().add(car.getBrand() + " " + car.getName() + " " + car.getLicensenumber() + " " + car.isAvailable());
        }
        App.setCurrentMainListView("cars");
        this.ListviewMenuButton.setText("all Cars");
    }

    @FXML
    private void viewAllVansBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(VanModel van : App.getVans()) {
            ListView.getItems().add(van.getBrand() + " " + van.getName() + " " + van.getLicensenumber() + " " + van.isAvailable());
        }
        App.setCurrentMainListView("vans");
        this.ListviewMenuButton.setText("all Vans");
    }

    @FXML
    private void viewAllTrailersBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(TrailerModel trailer : App.getTrailers()) {
            ListView.getItems().add(trailer.getBrand() + " " + trailer.getName() + " " + trailer.getLicensenumber() + " " + trailer.isAvailable());
        }
        App.setCurrentMainListView("trailers");
        this.ListviewMenuButton.setText("all Trailers");
    }

    @FXML
    private void viewAllCustomersBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(CustomerModel customer : App.getCustomers()) {
            ListView.getItems().add(customer.getFirstname() + " " + customer.getLastname() + " " + customer.getCustomernumber() + " " + customer.isMaylend());
        }
        App.setCurrentMainListView("customers");
        this.ListviewMenuButton.setText("all Customers");
    }

    @FXML
    private void viewAllPCustomersBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(PrivateCustomerModel pcustomer : App.getPcustomers()) {
            ListView.getItems().add(pcustomer.getFirstname() + " " + pcustomer.getLastname() + " " + pcustomer.getCustomernumber() + " " + pcustomer.isMaylend());
        }
        App.setCurrentMainListView("pcustomers");
        this.ListviewMenuButton.setText("all Private Customers");
    }

    @FXML
    private void viewAllBCustomersBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(BusinessCustomerModel bcustomer : App.getBcustomers()) {
            ListView.getItems().add(bcustomer.getFirstname() + " " + bcustomer.getLastname() + " " + bcustomer.getCustomernumber() + " " + bcustomer.isMaylend());
        }
        App.setCurrentMainListView("bcustomers");
        this.ListviewMenuButton.setText("all Business Customers");
    }

    @FXML
    private void LSBTNviewObject(MouseEvent event) throws IOException {
        App.setCurrentObejct(ListView.getSelectionModel().getSelectedIndex());
        if(App.getCurrentMainListView().equals("vehicles")) {
            App.setCurrentVehicleListView("vehicles");
            if(App.getVehicles().get(App.getCurrentObejct()).getClass().getSimpleName().equals("TruckModel")){
                App.setCurrentObjective("view/truck");
                App.setRoot("VehicleView");
            }
            else if(App.getVehicles().get(App.getCurrentObejct()).getClass().getSimpleName().equals("CarModel")){
                App.setCurrentObjective("view/car");
                App.setRoot("VehicleView");
            }
            else if(App.getVehicles().get(App.getCurrentObejct()).getClass().getSimpleName().equals("VanModel")){
                App.setCurrentObjective("view/van");
                App.setRoot("VehicleView");
            }
            else if(App.getVehicles().get(App.getCurrentObejct()).getClass().getSimpleName().equals("TrailerModel")){
                App.setCurrentObjective("view/trailer");
                App.setRoot("VehicleView");
            }
            else {
                System.out.println("There is no right value set in App.getVehicles().get(App.getCurrentObejct()).getClass().getName()");
            }
        }
        else if(App.getCurrentMainListView().equals("trucks")) {
            App.setCurrentObjective("view/truck");
            App.setRoot("VehicleView");
            App.setCurrentVehicleListView("trucks");
        }
        else if(App.getCurrentMainListView().equals("cars")) {
            App.setCurrentObjective("view/car");
            App.setRoot("VehicleView");
            App.setCurrentVehicleListView("cars");
        }
        else if(App.getCurrentMainListView().equals("vans")) {
            App.setCurrentObjective("view/van");
            App.setRoot("VehicleView");
            App.setCurrentVehicleListView("vans");
        }
        else if(App.getCurrentMainListView().equals("trailers")) {
            App.setCurrentObjective("view/trailer");
            App.setRoot("VehicleView");
            App.setCurrentVehicleListView("trailers");
        }
        else if(App.getCurrentMainListView().equals("customers")) {
            App.setCurrentCustomerListView("customers");
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
        else if(App.getCurrentMainListView().equals("pcustomers")) {
            App.setCurrentObjective("view/pcustomer");
            App.setRoot("CustomerView");
            App.setCurrentCustomerListView("pcustomers");
        }
        else if(App.getCurrentMainListView().equals("bcustomers")) {
            App.setCurrentObjective("view/bcustomer");
            App.setRoot("CustomerView");
            App.setCurrentCustomerListView("bcustomers");
        }
        else if(App.getCurrentMainListView().equals("rentals")) {
            App.setCurrentObjective("view/rental");
            App.setRoot("RentalView");
        }
        else {
            System.out.println("There is not the right value set in App.getCurrentMainListView()");
        }
    }

    @FXML
    private void viewAllRentalsBTN(ActionEvent event) {
        ListView.getItems().clear();
        for(RentalModel rental : App.getRentals()) {
            ListView.getItems().add(rental.getVehicle().getName() + " " + rental.getVehicle().getLicenseplate() + " " + rental.getCustomer().getFirstname() + " " + rental.getCustomer().getLastname() + "/Price: " + rental.getPrice());
        }
    }

    @FXML
    private void startsearch(KeyEvent event) {
        ListView.getItems().clear();
        String search = searchbar.getText();
        for(VehicleModel vehicle : App.getVehicles()) {
            String allData = vehicle.getAllData();
            if(allData.contains(search)) {
                ListView.getItems().add("Vehicle: " + vehicle.getAllData());
            }
        }
        for(CustomerModel customer : App.getCustomers()) {
            String allData = customer.getAllData();
            if(allData.contains(search)) {
                ListView.getItems().add("Customer: " + customer.getAllData());
            }
        }
        for(RentalModel rental : App.getRentals()) {
            String allData = rental.getAllData();
            if(allData.contains(search)) {
                ListView.getItems().add("Rental: " + rental.getAllData());
            }
        }
    }
    
}
