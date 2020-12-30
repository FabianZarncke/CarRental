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
public class TruckModel extends VehicleModel {
    
    //Declaration of instance variables
    private int payload; //in kg
    private int volume; //in liter
    private int seats;
    private boolean electric;
    
    //constructor
    public TruckModel(int payload, int volume, int seats,boolean electric, String brand, String licenseplate, boolean inRepair, String name) {
        super(brand, licenseplate, inRepair, name);
        setPayload(payload);
        setVolume(volume);
        setSeats(seats);
        setElectric(electric);
    }
    
    //GETTER and SETTER
    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    
    
    
}
