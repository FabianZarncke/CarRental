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
public abstract class CustomerModel implements DataProvider {
    
    //Declaration of instance variables
    private String firstname; //e.g. John
    private String lastname; //e.g. Wick
    private String birthdate; //e.g. 02.09.1964
    private String customernumber; //e.g. 00074138
    private String adress; //e.g. Germany, 22415 Hamburg, Fehnweg 4
    private String phonenumber; //e.g. 015203450511
    private boolean maylend;

    //constructor
    public CustomerModel(String firstname, String lastname, String birthdate, String adress, String phonenumber) {
        setFirstname(firstname);
        setLastname(lastname);
        setBirthdate(birthdate);
        generateCustomernumber();
        setAdress(adress);
        setPhonenumber(phonenumber);
        setMaylend(true);
        
    }
    
    public void generateCustomernumber() {
        int customernumber = App.getCurrentCustomernumberCounter() + 1;
        App.setCurrentCustomernumberCounter(customernumber);
        setCustomernumber(Integer.toString(customernumber));
    }
    
    //GETTER and SETTER
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public boolean isMaylend() {
        return maylend;
    }

    public void setMaylend(boolean maylend) {
        this.maylend = maylend;
    }
    
    public String getAllData() {
        return this.getFirstname() + " " + this.getLastname() + " " + this.getBirthdate() + " " + this.getCustomernumber();
    }
    
}
