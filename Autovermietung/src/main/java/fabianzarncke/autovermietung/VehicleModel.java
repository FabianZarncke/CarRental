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
public abstract class VehicleModel implements DataProvider {
    
    //Declaration of instance variables
    private String brand; //e.g. VW, Audi, BMW, TESLA
    private String licenseplate; //e.g. HH-FZ-1234
    private String licensenumber; //e.g. 00074138
    private boolean inRepair;
    private boolean inUse;
    private boolean available;
    private String name;
    
    //Constructor
    public VehicleModel(String brand, String licenseplate, boolean inRepair, String name) {
        setBrand(brand);
        setLicenseplate(licenseplate);
        generateLicensnumber();
        setInRepair(inRepair);
        setInUse(false);
        setName(name);

        checkAvailability();
    }
    
    public void generateLicensnumber() {
        int licensnumber = App.getCurrentLicensnumberCounter() + 1;
        App.setCurrentLicensnumberCounter(licensnumber);
        setLicensenumber(Integer.toString(licensnumber));
    }
    
    //check if the car is available
    public void checkAvailability() {
        //if either "inRepair" or "inUse" is true then set "Available" false
        if(this.isInRepair() == true || this.isInUse() == true) {
            setAvailable(false);
        }
        else {
            setAvailable(true);
        }
    }
    
    //GETTER and SETTER
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public boolean isInRepair() {
        return inRepair;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllData() {
        return this.getBrand() + " " + this.getName() + " " + this.getLicenseplate() + " " + this.getLicensenumber();
    }
    
    
    
}
