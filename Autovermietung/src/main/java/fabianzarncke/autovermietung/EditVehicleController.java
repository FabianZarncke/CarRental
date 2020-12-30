/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.autovermietung;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fabian
 */
public class EditVehicleController implements Initializable {

    @FXML
    private TextField brand;
    @FXML
    private TextField name;
    @FXML
    private TextField licensnumber;
    @FXML
    private TextField licensplate;
    @FXML
    private CheckBox inRepair;
    @FXML
    private TextField payload;
    @FXML
    private TextField volume;
    @FXML
    private TextField seats;
    @FXML
    private CheckBox isElectric;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goHome(ActionEvent event) {
    }

    @FXML
    private void editBTN(ActionEvent event) {
    }

    @FXML
    private void cancleBTN(ActionEvent event) {
    }

    @FXML
    private void saveBTN(ActionEvent event) {
    }
    
}
