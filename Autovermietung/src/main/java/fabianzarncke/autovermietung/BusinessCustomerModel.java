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
public class BusinessCustomerModel extends CustomerModel{
    
    //Declaration of instance variables
    private String businessAdress; //e.g. Germany, 22415 Hamburg, Fehnweg 4
    private String businessPhonenumber; //e.g. 015203450511

    //constructor
    public BusinessCustomerModel(String businessAdress, String businessPhonenumber, String firstname, String lastname, String birthdate, String adress, String phonenumber) {
        super(firstname, lastname, birthdate, adress, phonenumber);
        this.businessAdress = businessAdress;
        this.businessPhonenumber = businessPhonenumber;
    }
    
    //GETTER and SETTER
    public String getBusinessAdress() {
        return businessAdress;
    }

    public void setBusinessAdress(String businessAdress) {
        this.businessAdress = businessAdress;
    }

    public String getBusinessPhonenumber() {
        return businessPhonenumber;
    }

    public void setBusinessPhonenumber(String businessPhonenumber) {
        this.businessPhonenumber = businessPhonenumber;
    }
    
    
    
}
