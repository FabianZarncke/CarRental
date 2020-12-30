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
public class RentalModel implements DataProvider{
    
    private VehicleModel vehicle;
    private CustomerModel customer;
    
    private String startdate;
    private String starttime;
    private String enddate;
    private String endtime;
    private double hours;
    private double price;
    
    private String rentalnumber;

    public RentalModel(VehicleModel vehicle, CustomerModel customer, String startdate, String starttime, String enddate, String endtime, double hours, String rentalnumber) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.startdate = startdate;
        this.starttime = starttime;
        this.enddate = enddate;
        this.endtime = endtime;
        this.hours = hours;
        calculatePrice();
        this.rentalnumber = rentalnumber;
    }

    public void calculatePrice() {
        double sprice = this.getHours() * App.getPrice();
        setPrice(sprice);
    }
    
    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    } 

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public VehicleModel getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleModel vehicle) {
        this.vehicle = vehicle;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public String getRentalnumber() {
        return rentalnumber;
    }

    public void setRentalnumber(String rentalnumber) {
        this.rentalnumber = rentalnumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getAllData() {
        return this.getVehicle().getName() + " " + this.getVehicle().getLicenseplate() + " " + this.getCustomer().getFirstname() + " " + this.getCustomer().getLastname() + " " + this.getRentalnumber();
    }
    
    
}
