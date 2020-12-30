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
public class PrivateCustomerModel extends CustomerModel{
    
    //Declaration of instance variables
    private String contact; //e.g. Tony, Stark

    //constructor
    public PrivateCustomerModel(String contact, String firstname, String lastname, String birthdate, String adress, String phonenumber) {
        super(firstname, lastname, birthdate, adress, phonenumber);
        setContact(contact);
    }

    //GETTER and SETTER
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}
