/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabianzarncke.autovermietung;

/**
 *
 * @author Fabian
 */
public class VanModel extends VehicleModel{
    
    //Declaration of instance variables
    private int seats;
    private boolean electric;

    //constructor
    public VanModel(int seats, boolean electric, String brand, String licenseplate, boolean inRepair, String name) {
        super(brand, licenseplate, inRepair, name);
        setSeats(seats);
        setElectric(electric);
    }

    //GETTER and SETTER
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    
    
    
}
