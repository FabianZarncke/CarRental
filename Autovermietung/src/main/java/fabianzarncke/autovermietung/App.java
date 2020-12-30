package fabianzarncke.autovermietung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    /**
    enum CurMLView{
        vehicles, trucks, cars, vans, trailers, customers, pcustomers, bcustomers
    }
    */
    
    private static Scene scene;

    private static String currentVehicleListView; //trucks, cars
    private static String currentCustomerListView; //customers, pcustomers, bcustomers
    private static String currentMainListView; //trucks, cars, pcus, bcus
    private static int currentObejct; // currenobjectindex
    private static String currentObjective; // e.g. create/truck, view/truck
    private static double price; //cost per hour
    private static int currentLicensnumberCounter;
    private static int currentCustomernumberCounter;
    private static int currentRentalnumberCounter;
    
    public static ArrayList<VehicleModel> vehicles;
    public static ArrayList<TruckModel> trucks;
    public static ArrayList<CarModel> cars;
    public static ArrayList<VanModel> vans;
    public static ArrayList<TrailerModel> trailers;
    public static ArrayList<CustomerModel> customers;
    public static ArrayList<PrivateCustomerModel> pcustomers;
    public static ArrayList<BusinessCustomerModel> bcustomers;
    
    public static ArrayList<RentalModel> rentals;

    @Override
    public void start(Stage stage) throws IOException {
        
        setCurrentMainListView("rentals");
        
        setPrice(4.99);
        
        vehicles = new ArrayList<VehicleModel>();
        trucks = new ArrayList<TruckModel>();
        cars = new ArrayList<CarModel>();
        vans = new ArrayList<VanModel>();
        trailers = new ArrayList<TrailerModel>();
        customers = new ArrayList<CustomerModel>();
        pcustomers = new ArrayList<PrivateCustomerModel>();
        bcustomers = new ArrayList<BusinessCustomerModel>();
        
        rentals = new ArrayList<RentalModel>();
        
        TruckModel truck1 = new TruckModel(100000, 10000, 1, true, "Tesla", "HH-FZ-2003", false, "SemiTruck");
        TruckModel truck2 = new TruckModel(100000, 10000, 1, false, "VW", "HH-GM-1978", false, "Model F");
        CarModel car1 = new CarModel(5, true, "Tesla", "HH-BR-2764", false, "Model S");
        CarModel car2 = new CarModel(5, true, "Tesla", "HH-BR-2765", false, "Model 3");
        CarModel car3 = new CarModel(7, true, "Tesla", "HH-BR-2766", false, "Model X");
        CarModel car4 = new CarModel(5, true, "Tesla", "HH-BR-2767", false, "Model Y");
        CarModel car5 = new CarModel(2, false, "Audi", "HH-BR-7384", false, "Pogo 7");
        VanModel van1 = new VanModel(8, false, "VW", "HH-KH-8284", false, "BigBoy X7");
        VanModel van2 = new VanModel(6, false, "VW", "HH-KH-8384", false, "SmallBoy X");
        TrailerModel trailer1 = new TrailerModel(100000, 10000, "Citroen", "HH-VH-8594", false, "Pimp 2");
        TrailerModel trailer2 = new TrailerModel(100000, 10000, "VW", "HH-VH-8694", false, "Pimp 4");
        PrivateCustomerModel pcustomer1 = new PrivateCustomerModel("Tony Stark", "John", "Wick", "02.09.1964", "82–92 Beaver Street", "0152384958345");
        PrivateCustomerModel pcustomer2 = new PrivateCustomerModel("John Wick", "Tony", "Stark", "29.05.1970", "Malibu Point", "0152765645");
        BusinessCustomerModel bcustomer1 = new BusinessCustomerModel("Microsoftvaley 34", "547635734538", "Bill", "Gates", "28.10.1955", "Washington", "5476865543");
        BusinessCustomerModel bcustomer2 = new BusinessCustomerModel("Google Way 69", "5453486454538", "Larry", "Page", "16.03.1973", "Michigan", "547544657365");
        RentalModel rental1 = new RentalModel(car1, pcustomer1, "12.12.2012", "14:00", "12.12.2012", "13:00", 6, "000001");
        
        addVehicle(truck1);
        addVehicle(truck2);
        addVehicle(car1);
        addVehicle(car2);
        addVehicle(car3);
        addVehicle(car4);
        addVehicle(car5);
        addVehicle(van1);
        addVehicle(van2);
        addVehicle(trailer1);
        addVehicle(trailer2);
        addCustomer(pcustomer1);
        addCustomer(pcustomer2);
        addCustomer(bcustomer1);
        addCustomer(bcustomer2);
        addTruck(truck1);
        addTruck(truck2);
        addCar(car1);
        addCar(car2);
        addCar(car3);
        addCar(car4);
        addCar(car5);
        addVan(van1);
        addVan(van2);
        addTrailer(trailer1);
        addTrailer(trailer2);
        addPrivateCustomer(pcustomer1);
        addPrivateCustomer(pcustomer2);
        addBusinessCustomer(bcustomer1);
        addBusinessCustomer(bcustomer2);
        addRental(rental1);
        
        setCurrentLicensnumberCounter(11);
        setCurrentCustomernumberCounter(4);
        setCurrentRentalnumberCounter(1);
        
        /**
        int quantity = 12;
        String padded = String.format("%08d", quantity);
        System.out.println(padded);
        **/
        
        scene = new Scene(loadFXML("MainView"), 1200, 690);
        stage.setScene(scene);
        stage.setMaxHeight(690);
        stage.setMaxWidth(1200);
        stage.setMinHeight(690);
        stage.setMinWidth(1200);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static String getCurrentObjective() {
        return currentObjective;
    }

    public static void setCurrentObjective(String currentObject) {
        App.currentObjective = currentObject;
    }

    public static void addVehicle(VehicleModel vehicle) {
        vehicles.add(vehicle);
    }
    public static void removeVehicle(VehicleModel vehicle) {
        vehicles.add(vehicle);
    }
    
    public static void addTruck(TruckModel truck) {
        trucks.add(truck);
    }
    public static void removeTruck(TruckModel truck) {
        trucks.add(truck);
    }
    
    public static void addCar(CarModel car) {
        cars.add(car);
    }
    public static void removeCar(CarModel car) {
        cars.add(car);
    }
    
    public static void addVan(VanModel van) {
        vans.add(van);
    }
    public static void removeVan(VanModel van) {
        vans.add(van);
    }
    
    public static void addTrailer(TrailerModel trailer) {
        trailers.add(trailer);
    }
    public static void removeTrailer(TrailerModel trailer) {
        trailers.add(trailer);
    }
    
    public static void addCustomer(CustomerModel customer) {
        customers.add(customer);
    }
    public static void removeCustomer(CustomerModel customer) {
        customers.add(customer);
    }
    
    public static void addPrivateCustomer(PrivateCustomerModel pcustomer) {
        pcustomers.add(pcustomer);
    }
    public static void removePrivateCustomer(PrivateCustomerModel pcustomer) {
        pcustomers.add(pcustomer);
    }
    
    public static void addBusinessCustomer(BusinessCustomerModel bcustomer) {
        bcustomers.add(bcustomer);
    }
    public static void removeBusinessCustomer(BusinessCustomerModel bcustomer) {
        bcustomers.add(bcustomer);
    }
    
    public static void addRental(RentalModel rental) {
        rentals.add(rental);
    }
    public static void removeRental(RentalModel rental) {
        rentals.remove(rental);
    }

    public static ArrayList<VehicleModel> getVehicles() {
        return vehicles;
    }

    public static void setVehicles(ArrayList<VehicleModel> vehicles) {
        App.vehicles = vehicles;
    }

    public static ArrayList<TruckModel> getTrucks() {
        return trucks;
    }

    public static void setTrucks(ArrayList<TruckModel> trucks) {
        App.trucks = trucks;
    }

    public static ArrayList<CarModel> getCars() {
        return cars;
    }

    public static void setCars(ArrayList<CarModel> cars) {
        App.cars = cars;
    }

    public static ArrayList<VanModel> getVans() {
        return vans;
    }

    public static void setVans(ArrayList<VanModel> vans) {
        App.vans = vans;
    }

    public static ArrayList<TrailerModel> getTrailers() {
        return trailers;
    }

    public static void setTrailers(ArrayList<TrailerModel> trailers) {
        App.trailers = trailers;
    }

    public static ArrayList<CustomerModel> getCustomers() {
        return customers;
    }

    public static void setCustomers(ArrayList<CustomerModel> customers) {
        App.customers = customers;
    }

    public static ArrayList<PrivateCustomerModel> getPcustomers() {
        return pcustomers;
    }

    public static void setPcustomers(ArrayList<PrivateCustomerModel> pcustomers) {
        App.pcustomers = pcustomers;
    }

    public static ArrayList<BusinessCustomerModel> getBcustomers() {
        return bcustomers;
    }

    public static void setBcustomers(ArrayList<BusinessCustomerModel> bcustomers) {
        App.bcustomers = bcustomers;
    }

    public static ArrayList<RentalModel> getRentals() {
        return rentals;
    }

    public static void setRentals(ArrayList<RentalModel> rentals) {
        App.rentals = rentals;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        App.price = price;
    }

    public static int getCurrentObejct() {
        return currentObejct;
    }

    public static void setCurrentObejct(int currentObejct) {
        App.currentObejct = currentObejct;
    }

    public static String getCurrentMainListView() {
        return currentMainListView;
    }

    public static void setCurrentMainListView(String currentMainListView) {
        App.currentMainListView = currentMainListView;
    }

    public static String getCurrentVehicleListView() {
        return currentVehicleListView;
    }

    public static void setCurrentVehicleListView(String currentVehicleListView) {
        App.currentVehicleListView = currentVehicleListView;
    }

    public static String getCurrentCustomerListView() {
        return currentCustomerListView;
    }

    public static void setCurrentCustomerListView(String currentCustomerListView) {
        App.currentCustomerListView = currentCustomerListView;
    }

    public static int getCurrentLicensnumberCounter() {
        return currentLicensnumberCounter;
    }

    public static void setCurrentLicensnumberCounter(int currentLicensnumberCounter) {
        App.currentLicensnumberCounter = currentLicensnumberCounter;
    }

    public static int getCurrentCustomernumberCounter() {
        return currentCustomernumberCounter;
    }

    public static void setCurrentCustomernumberCounter(int currentCustomernumberCounter) {
        App.currentCustomernumberCounter = currentCustomernumberCounter;
    }

    public static int getCurrentRentalnumberCounter() {
        return currentRentalnumberCounter;
    }

    public static void setCurrentRentalnumberCounter(int currentRentalnumberCounter) {
        App.currentRentalnumberCounter = currentRentalnumberCounter;
    }
    
    
}