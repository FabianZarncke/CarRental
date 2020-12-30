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
public class TrailerModel extends VehicleModel{
    
    //Declaration of instance variables
    private int payload; //in kg
    private int volume; //in liter

    //constructor
    public TrailerModel(int payload, int volume, String brand, String licenseplate, boolean inRepair, String name) {
        super(brand, licenseplate, inRepair, name);
        setPayload(payload);
        setVolume(volume);
    }
    
    //GETTER and SETTER
    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    
}
