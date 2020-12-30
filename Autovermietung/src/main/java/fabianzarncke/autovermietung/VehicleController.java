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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class VehicleController implements Initializable {

    @FXML
    private TextField TFbrand;
    @FXML
    private TextField TFname;
    @FXML
    private TextField TFlicensplate;
    @FXML
    private CheckBox CBinRepair;
    @FXML
    private CheckBox CBinUse;
    @FXML
    private CheckBox CBisAvailable;
    @FXML
    private TextField TFlicensnumber;
    @FXML
    private TextField TFpayload;
    @FXML
    private TextField TFvolume;
    @FXML
    private TextField TFseats;
    @FXML
    private CheckBox CBisElectric;
    @FXML
    private ListView<String> ListView;
    @FXML
    private Button BTNedit;
    @FXML
    private Button BTNsave;
    @FXML
    private Button BTNcancel;
    @FXML
    private Button BTNmainAction;
    @FXML
    private Text TXTbrand;
    @FXML
    private Text TXTname;
    @FXML
    private Text TXTlicensplate;
    @FXML
    private Text TXTlicensnumber;
    @FXML
    private Text TXTseats;
    @FXML
    private Text TXTpayload;
    @FXML
    private Text TXTvolume;
    
    private String currentVehicle; //licensnumber
    @FXML
    private MenuButton chooseViewMenuButton;
    @FXML
    private Label errorMessage;
    
    private String alt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListView.getItems().clear();
        this.errorMessage.setText(" ");
        
        
        if(App.getCurrentObjective().equals("create/truck")) {
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(false);
            CBisAvailable.setVisible(false);
            TFlicensnumber.setVisible(false);
            TFpayload.setVisible(true);
            TFvolume.setVisible(true);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(false);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Truck");
            TFbrand.setEditable(true);
            TFname.setEditable(true);
            TFlicensplate.setEditable(true);
            CBinRepair.setDisable(false);
            CBinUse.setDisable(true);
            CBisAvailable.setDisable(true);
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(true);
            TFvolume.setEditable(true);
            TFseats.setEditable(true);
            CBisElectric.setDisable(false);
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(false);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(true);
            TXTvolume.setVisible(true);
        }
        else if(App.getCurrentObjective().equals("create/car")) {
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(false);
            CBisAvailable.setVisible(false);
            TFlicensnumber.setVisible(false);
            TFpayload.setVisible(false);
            TFvolume.setVisible(false);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(false);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Car");
            TFbrand.setEditable(true);
            TFname.setEditable(true);
            TFlicensplate.setEditable(true);
            CBinRepair.setDisable(false);
            CBinUse.setDisable(true);
            CBisAvailable.setDisable(true);
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(true);
            CBisElectric.setDisable(false);
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(false);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(false);
            TXTvolume.setVisible(false);
        }
        else if(App.getCurrentObjective().equals("create/van")) {
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(false);
            CBisAvailable.setVisible(false);
            TFlicensnumber.setVisible(false);
            TFpayload.setVisible(false);
            TFvolume.setVisible(false);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(false);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Van");
            TFbrand.setEditable(true);
            TFname.setEditable(true);
            TFlicensplate.setEditable(true);
            CBinRepair.setDisable(false);
            CBinUse.setDisable(true);
            CBisAvailable.setDisable(true);
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(true);
            CBisElectric.setDisable(false);
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(false);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(false);
            TXTvolume.setVisible(false);
        }
        else if(App.getCurrentObjective().equals("create/trailer")) {
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(false);
            CBisAvailable.setVisible(false);
            TFlicensnumber.setVisible(false);
            TFpayload.setVisible(true);
            TFvolume.setVisible(true);
            TFseats.setVisible(false);
            CBisElectric.setVisible(false);
            BTNedit.setVisible(false);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(false);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("create Trailer");
            TFbrand.setEditable(true);
            TFname.setEditable(true);
            TFlicensplate.setEditable(true);
            CBinRepair.setDisable(false);
            CBinUse.setDisable(true);
            CBisAvailable.setDisable(true);
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(true);
            TFvolume.setEditable(true);
            TFseats.setEditable(false);
            CBisElectric.setDisable(true);
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(false);
            TXTseats.setVisible(false);
            TXTpayload.setVisible(true);
            TXTvolume.setVisible(true);
        }
        else if(App.getCurrentObjective().equals("view/truck")) {
            TruckModel currentTruck = null;
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(true);
            CBisAvailable.setVisible(true);
            TFlicensnumber.setVisible(true);
            TFpayload.setVisible(true);
            TFvolume.setVisible(true);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Rent this Truck");
            TFbrand.setEditable(false);
            TFname.setEditable(false);
            TFlicensplate.setEditable(false);
            CBinRepair.setDisable(true);
            CBinRepair.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBinUse.setDisable(true);
            CBinUse.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBisAvailable.setDisable(true);
            CBisAvailable.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(false);
            CBisElectric.setDisable(true);
            CBisElectric.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(true);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(true);
            TXTvolume.setVisible(true);
            
            
            
            for(TruckModel truck : App.getTrucks()) {
                ListView.getItems().add(truck.getBrand() + " "+ truck.getName() + " " + truck.getLicenseplate());
            }
            
            if(App.getCurrentMainListView().equals("vehicles")) {
                String lnum = App.getVehicles().get(App.getCurrentObejct()).getLicensenumber();
                for(TruckModel truck : App.getTrucks()) {
                    if(truck.getLicensenumber().equals(lnum)) {
                        currentTruck = truck;
                        currentVehicle = currentTruck.getLicensenumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("trucks")) {
                currentTruck = App.getTrucks().get(App.getCurrentObejct());
                currentVehicle = currentTruck.getLicensenumber();
            }
            
            TFbrand.setText(currentTruck.getBrand());
            TFname.setText(currentTruck.getName());
            TFlicensplate.setText(currentTruck.getLicenseplate());
            CBinRepair.setSelected(currentTruck.isInRepair());
            CBinUse.setSelected(currentTruck.isInUse());
            CBisAvailable.setSelected(currentTruck.isAvailable());
            TFlicensnumber.setText(currentTruck.getLicensenumber());
            TFpayload.setText(Integer.toString(currentTruck.getPayload()));
            TFvolume.setText(Integer.toString(currentTruck.getVolume()));
            TFseats.setText(Integer.toString(currentTruck.getSeats()));
            CBisElectric.setSelected(currentTruck.isElectric());
        }
        else if(App.getCurrentObjective().equals("view/car")) {
            CarModel currentCar = null;
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(true);
            CBisAvailable.setVisible(true);
            TFlicensnumber.setVisible(true);
            TFpayload.setVisible(false);
            TFvolume.setVisible(false);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Rent this Car");
            TFbrand.setEditable(false);
            TFname.setEditable(false);
            TFlicensplate.setEditable(false);
            CBinRepair.setDisable(true);
            CBinRepair.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBinUse.setDisable(true);
            CBinUse.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBisAvailable.setDisable(true);
            CBisAvailable.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(false);
            CBisElectric.setDisable(true);
            CBisElectric.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(true);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(false);
            TXTvolume.setVisible(false);
            
            
            
            for(CarModel car : App.getCars()) {
                ListView.getItems().add(car.getBrand() + " "+ car.getName() + " " + car.getLicenseplate());
            }
            
            if(App.getCurrentMainListView().equals("vehicles")) {
                String lnum = App.getVehicles().get(App.getCurrentObejct()).getLicensenumber();
                for(CarModel car : App.getCars()) {
                    if(car.getLicensenumber().equals(lnum)) {
                        currentCar = car;
                        currentVehicle = currentCar.getLicensenumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("cars")) {
                currentCar = App.getCars().get(App.getCurrentObejct());
                currentVehicle = currentCar.getLicensenumber();
            }
            
            TFbrand.setText(currentCar.getBrand());
            TFname.setText(currentCar.getName());
            TFlicensplate.setText(currentCar.getLicenseplate());
            CBinRepair.setSelected(currentCar.isInRepair());
            CBinUse.setSelected(currentCar.isInUse());
            CBisAvailable.setSelected(currentCar.isAvailable());
            TFlicensnumber.setText(currentCar.getLicensenumber());
            TFseats.setText(Integer.toString(currentCar.getSeats()));
            CBisElectric.setSelected(currentCar.isElectric());
        }
        else if(App.getCurrentObjective().equals("view/van")) {
            VanModel currentVan = null;
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(true);
            CBisAvailable.setVisible(true);
            TFlicensnumber.setVisible(true);
            TFpayload.setVisible(false);
            TFvolume.setVisible(false);
            TFseats.setVisible(true);
            CBisElectric.setVisible(true);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Rent this Van");
            TFbrand.setEditable(false);
            TFname.setEditable(false);
            TFlicensplate.setEditable(false);
            CBinRepair.setDisable(true);
            CBinRepair.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBinUse.setDisable(true);
            CBinUse.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBisAvailable.setDisable(true);
            CBisAvailable.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(false);
            CBisElectric.setDisable(true);
            CBisElectric.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(true);
            TXTseats.setVisible(true);
            TXTpayload.setVisible(false);
            TXTvolume.setVisible(false);
            
            
            
            for(VanModel van : App.getVans()) {
                ListView.getItems().add(van.getBrand() + " "+ van.getName() + " " + van.getLicenseplate());
            }
            
            if(App.getCurrentMainListView().equals("vehicles")) {
                String lnum = App.getVehicles().get(App.getCurrentObejct()).getLicensenumber();
                for(VanModel van : App.getVans()) {
                    if(van.getLicensenumber().equals(lnum)) {
                        currentVan = van;
                        currentVehicle = currentVan.getLicensenumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("vans")) {
                currentVan = App.getVans().get(App.getCurrentObejct());
                currentVehicle = currentVan.getLicensenumber();
            }
            
            TFbrand.setText(currentVan.getBrand());
            TFname.setText(currentVan.getName());
            TFlicensplate.setText(currentVan.getLicenseplate());
            CBinRepair.setSelected(currentVan.isInRepair());
            CBinUse.setSelected(currentVan.isInUse());
            CBisAvailable.setSelected(currentVan.isAvailable());
            TFlicensnumber.setText(currentVan.getLicensenumber());
            TFseats.setText(Integer.toString(currentVan.getSeats()));
            CBisElectric.setSelected(currentVan.isElectric());
        }
        else if(App.getCurrentObjective().equals("view/trailer")) {
            TrailerModel currentTrailer = null;
            TFbrand.setVisible(true);
            TFname.setVisible(true);
            TFlicensplate.setVisible(true);
            CBinRepair.setVisible(true);
            CBinUse.setVisible(true);
            CBisAvailable.setVisible(true);
            TFlicensnumber.setVisible(true);
            TFpayload.setVisible(true);
            TFvolume.setVisible(true);
            TFseats.setVisible(false);
            CBisElectric.setVisible(false);
            BTNedit.setVisible(true);
            BTNsave.setVisible(false);
            BTNcancel.setVisible(false);
            ListView.setVisible(true);
            chooseViewMenuButton.setVisible(true);
            BTNmainAction.setVisible(true);
            BTNmainAction.setText("Rent this Trailer");
            TFbrand.setEditable(false);
            TFname.setEditable(false);
            TFlicensplate.setEditable(false);
            CBinRepair.setDisable(true);
            CBinRepair.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBinUse.setDisable(true);
            CBinUse.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            CBisAvailable.setDisable(true);
            CBisAvailable.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TFlicensnumber.setEditable(false);
            TFpayload.setEditable(false);
            TFvolume.setEditable(false);
            TFseats.setEditable(false);
            CBisElectric.setDisable(true);
            CBisElectric.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
            TXTbrand.setVisible(true);
            TXTname.setVisible(true);
            TXTlicensplate.setVisible(true);
            TXTlicensnumber.setVisible(true);
            TXTseats.setVisible(false);
            TXTpayload.setVisible(true);
            TXTvolume.setVisible(true);
            
            
            
            for(TrailerModel trailer : App.getTrailers()) {
                ListView.getItems().add(trailer.getBrand() + " "+ trailer.getName() + " " + trailer.getLicenseplate());
            }
            
            if(App.getCurrentMainListView().equals("vehicles")) {
                String lnum = App.getVehicles().get(App.getCurrentObejct()).getLicensenumber();
                for(TrailerModel trailer : App.getTrailers()) {
                    if(trailer.getLicensenumber().equals(lnum)) {
                        currentTrailer = trailer;
                        currentVehicle = currentTrailer.getLicensenumber();
                    }
                }
            }
            else if(App.getCurrentMainListView().equals("trailers")) {
                currentTrailer = App.getTrailers().get(App.getCurrentObejct());
                currentVehicle = currentTrailer.getLicensenumber();
            }
            
            TFbrand.setText(currentTrailer.getBrand());
            TFname.setText(currentTrailer.getName());
            TFlicensplate.setText(currentTrailer.getLicenseplate());
            CBinRepair.setSelected(currentTrailer.isInRepair());
            CBinUse.setSelected(currentTrailer.isInUse());
            CBisAvailable.setSelected(currentTrailer.isAvailable());
            TFlicensnumber.setText(currentTrailer.getLicensenumber());
            TFpayload.setText(Integer.toString(currentTrailer.getPayload()));
            TFvolume.setText(Integer.toString(currentTrailer.getVolume()));
        }
    }    

    private void goHome(ActionEvent event) throws IOException {
        App.setRoot("MainView");
    }

    @FXML
    private void BTNallVehicles(ActionEvent event) {
        ListView.getItems().clear();
        for(VehicleModel vehicle : App.getVehicles()) {
            ListView.getItems().add(vehicle.getBrand() + " " + vehicle.getName() + " " + vehicle.getLicensenumber() + " " + vehicle.isAvailable());
        }
        App.setCurrentVehicleListView("vehicles");
    }

    @FXML
    private void BTNallTrucks(ActionEvent event) {
        ListView.getItems().clear();
        for(TruckModel truck : App.getTrucks()) {
            ListView.getItems().add(truck.getBrand() + " " + truck.getName() + " " + truck.getLicensenumber() + " " + truck.isAvailable());
        }
        App.setCurrentVehicleListView("trucks");
    }

    @FXML
    private void BTNallCars(ActionEvent event) {
        ListView.getItems().clear();
        for(CarModel car : App.getCars()) {
            ListView.getItems().add(car.getBrand() + " " + car.getName() + " " + car.getLicensenumber() + " " + car.isAvailable());
        }
        App.setCurrentVehicleListView("cars");
    }

    @FXML
    private void BTNallVans(ActionEvent event) {
        ListView.getItems().clear();
        for(VanModel van : App.getVans()) {
            ListView.getItems().add(van.getBrand() + " " + van.getName() + " " + van.getLicensenumber() + " " + van.isAvailable());
        }
        App.setCurrentVehicleListView("vans");
    }

    @FXML
    private void BTNallTrailers(ActionEvent event) {
        ListView.getItems().clear();
        for(TrailerModel trailer : App.getTrailers()) {
            ListView.getItems().add(trailer.getBrand() + " " + trailer.getName() + " " + trailer.getLicensenumber() + " " + trailer.isAvailable());
        }
        App.setCurrentVehicleListView("trailers");
    }

    @FXML
    private void BTNsave(ActionEvent event) throws IOException {
        if(App.getCurrentObjective().equals("view/truck")) {
            for(TruckModel truck : App.getTrucks()) {
                if(truck.getLicensenumber().equals(currentVehicle)) {
                    truck.setBrand(TFbrand.getText());
                    truck.setName(TFname.getText());
                    truck.setLicenseplate(TFlicensplate.getText());
                    truck.setInRepair(CBinRepair.isSelected());
                    truck.checkAvailability();
                    truck.setPayload(Integer.parseInt(TFpayload.getText()));
                    truck.setVolume(Integer.parseInt(TFvolume.getText()));
                    truck.setSeats(Integer.parseInt(TFseats.getText()));
                }
            }
        }
        else if(App.getCurrentObjective().equals("view/car")) {
            for(CarModel car : App.getCars()) {
                if(car.getLicensenumber().equals(currentVehicle)) {
                    car.setBrand(TFbrand.getText());
                    car.setName(TFname.getText());
                    car.setLicenseplate(TFlicensplate.getText());
                    car.setInRepair(CBinRepair.isSelected());
                    car.checkAvailability();
                    car.setSeats(Integer.parseInt(TFseats.getText()));
                }
            }
        }
        else if(App.getCurrentObjective().equals("view/van")) {
            for(VanModel van : App.getVans()) {
                if(van.getLicensenumber().equals(currentVehicle)) {
                    van.setBrand(TFbrand.getText());
                    van.setName(TFname.getText());
                    van.setLicenseplate(TFlicensplate.getText());
                    van.setInRepair(CBinRepair.isSelected());
                    van.checkAvailability();
                    van.setSeats(Integer.parseInt(TFseats.getText()));
                }
            }
        }
        else if(App.getCurrentObjective().equals("view/trailer")) {
            for(TrailerModel trailer : App.getTrailers()) {
                if(trailer.getLicensenumber().equals(currentVehicle)) {
                    trailer.setBrand(TFbrand.getText());
                    trailer.setName(TFname.getText());
                    trailer.setLicenseplate(TFlicensplate.getText());
                    trailer.setInRepair(CBinRepair.isSelected());
                    trailer.checkAvailability();
                    trailer.setPayload(Integer.parseInt(TFpayload.getText()));
                    trailer.setVolume(Integer.parseInt(TFvolume.getText()));
                }
            }
        }
        else {
            System.out.println("There was an error. App.getCurrentObjective either not set or has wrong value");
        }
        App.setRoot("VehicleView");
    }

    @FXML
    private void BTNcancel(ActionEvent event) throws IOException {
        App.setRoot("VehicleView");
    }

    @FXML
    private void BTNmainAction(ActionEvent event) throws IOException {
        if(this.TFbrand.getText().trim().isEmpty() || this.TFname.getText().trim().isEmpty() || this.TFlicensplate.getText().trim().isEmpty()) {
            this.errorMessage.setText("please fill out every field!");
            System.out.println("please fill out every field!");
        }
        else {
            if(App.getCurrentObjective().equals("view/truck") || App.getCurrentObjective().equals("view/car") || App.getCurrentObjective().equals("view/van") || App.getCurrentObjective().equals("view/trailer")) {
                App.setRoot("RentalView");
            }
            else if(App.getCurrentObjective().equals("create/truck") || App.getCurrentObjective().equals("create/car") || App.getCurrentObjective().equals("create/van") || App.getCurrentObjective().equals("create/trailer")) {
                String slicensnumber = Integer.toString(generateLicensnumber());
                String sbrand = this.TFbrand.getText();
                String sname = this.TFname.getText();
                String slicensplate = this.TFlicensplate.getText();
                boolean sinRepair = this.CBinRepair.isSelected();
                
                if(App.getCurrentObjective().equals("create/truck")) {
                    int spayload = Integer.parseInt(this.TFpayload.getText());
                    int svolume = Integer.parseInt(this.TFvolume.getText());
                    int sseats = Integer.parseInt(this.TFseats.getText());
                    boolean siselcetric = this.CBisElectric.isSelected();
                    TruckModel newtruck = new TruckModel(spayload, svolume, sseats, siselcetric, sbrand, slicensplate, sinRepair, sname);
                    App.addVehicle(newtruck);
                    App.addTruck(newtruck);
                }
                else if(App.getCurrentObjective().equals("create/car")) {
                    int sseats = Integer.parseInt(this.TFseats.getText());
                    boolean siselcetric = this.CBisElectric.isSelected();
                    CarModel newcar = new CarModel(sseats, siselcetric, sbrand, slicensplate, sinRepair, sname);
                    App.addVehicle(newcar);
                    App.addCar(newcar);
                }
                else if(App.getCurrentObjective().equals("create/van")) {
                    int sseats = Integer.parseInt(this.TFseats.getText());
                    boolean siselcetric = this.CBisElectric.isSelected();
                    VanModel newvan = new VanModel(sseats, siselcetric, sbrand, slicensplate, sinRepair, sname);
                    App.addVehicle(newvan);
                    App.addVan(newvan);
                }
                else if(App.getCurrentObjective().equals("create/trailer")) {
                    int spayload = Integer.parseInt(this.TFpayload.getText());
                    int svolume = Integer.parseInt(this.TFvolume.getText());
                    TrailerModel newtrailer = new TrailerModel(spayload, svolume, sbrand, slicensplate, sinRepair, sname);
                    App.addVehicle(newtrailer);
                    App.addTrailer(newtrailer);
                }
                else {
                    System.out.println("There was an error! App.CurrentObejctive not set.");
                }
                App.setRoot("MainView");
            }
        }
    }
    
    public int generateLicensnumber() {
        int licensnumber = App.getCurrentLicensnumberCounter() + 1;
        App.setCurrentCustomernumberCounter(licensnumber);
        return licensnumber;
    }
    
    public boolean isInteger(String input) {
       try {
          Integer.parseInt(input);
          return true;
       }
       catch(NumberFormatException e) {
          return false;
       }
    }

    @FXML
    private void BTNedit(ActionEvent event) {
        TFbrand.setEditable(true);
        TFname.setEditable(true);
        TFlicensplate.setEditable(true);
        TFseats.setEditable(true);
        TFpayload.setEditable(true);
        TFvolume.setEditable(true);
        CBisElectric.setDisable(false);
        CBisAvailable.setVisible(false);
        CBinUse.setVisible(false);
        
        for(VehicleModel vehicle : App.getVehicles()) {
            if(vehicle.getLicensenumber().equals(currentVehicle)) {
                if(vehicle.isInUse() == false) {
                    CBinRepair.setDisable(false);
                }
                else {
                    CBinRepair.setDisable(true);
                    CBinRepair.setStyle("-fx-opacity: 1; -fx-font-size: 20;");
                }
            }
        }
        
        BTNsave.setVisible(true);
        BTNcancel.setVisible(true);
        BTNedit.setVisible(false);
    }

    @FXML
    private void BTNListView(MouseEvent event) throws IOException {
        App.setCurrentObejct(ListView.getSelectionModel().getSelectedIndex());
        if(App.getCurrentVehicleListView().equals("vehicles")) {
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
        else if(App.getCurrentVehicleListView().equals("trucks")) {
            App.setCurrentObjective("view/truck");
            App.setRoot("VehicleView");
        }
        else if(App.getCurrentVehicleListView().equals("cars")) {
            App.setCurrentObjective("view/car");
            App.setRoot("VehicleView");
        }
        else if(App.getCurrentVehicleListView().equals("vans")) {
            App.setCurrentObjective("view/van");
            App.setRoot("VehicleView");
        }
        else if(App.getCurrentVehicleListView().equals("trailers")) {
            App.setCurrentObjective("view/trailer");
            App.setRoot("VehicleView");
        }
        else {
            System.out.println("There is not the right value set in App.getCurrentMainListView()");
        }
    }

    @FXML
    private void goHome(MouseEvent event) throws IOException {
        App.setRoot("MainView");
    }

    @FXML
    private void TFseatsSafeAlt(MouseEvent event) {
        this.alt = this.TFseats.getText();
    }

    @FXML
    private void TFpayloadSafeAlt(MouseEvent event) {
        this.alt = this.TFpayload.getText();
    }

    @FXML
    private void TFvolumeSafeAlt(MouseEvent event) {
        this.alt = this.TFvolume.getText();
    }

    @FXML
    private void TFseatsCheckNumeric(KeyEvent event) {
        if(this.TFseats.getText().matches("[0-9]*")) {
            this.alt = TFseats.getText();
        }
        else if(!this.TFseats.getText().matches("[0-9]*")) {
            TFseats.setText(alt);
            TFseats.requestFocus();
            TFseats.end();
        }
        else {
            System.out.println("There was an error! TFseats doesnt match certain aspects!");
        }
    }

    @FXML
    private void TFpayloadCheckNumeric(KeyEvent event) {
        if(this.TFpayload.getText().matches("[0-9]*")) {
            this.alt = TFpayload.getText();
        }
        else if(!this.TFpayload.getText().matches("[0-9]*")) {
            TFpayload.setText(alt);
            TFpayload.requestFocus();
            TFpayload.end();
        }
        else {
            System.out.println("There was an error! TFpayload doesnt match certain aspects!");
        }
    }

    @FXML
    private void TFvolumeCheckNumeric(KeyEvent event) {
        if(this.TFvolume.getText().matches("[0-9]*")) {
            this.alt = TFvolume.getText();
        }
        else if(!this.TFvolume.getText().matches("[0-9]*")) {
            TFvolume.setText(alt);
            TFvolume.requestFocus();
            TFvolume.end();
        }
        else {
            System.out.println("There was an error! TFvolume doesnt match certain aspects!");
        }
    }
}
