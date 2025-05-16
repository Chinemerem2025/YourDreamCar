package com.yourdreamcar.model;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getPhone() { return phone; }

    public List<Vehicle> getVehiclesByPrice(double min, double max){return null;}

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){return null;}

    public List<Vehicle> getVehiclesByYear(String make, String model){return null;}

    public List<Vehicle> getVehiclesByColor(String make, String model){return null;}

    public List<Vehicle> getVehiclesByMileage(String make, String model){return null;}

    public List<Vehicle> getVehiclesByType(String make, String model){return null;}

    public List<Vehicle> getAllVehicles(){return inventory;}

    public void addVehicle(Vehicle vehicle){inventory.add(vehicle);;}

    public void removeVehicle(Vehicle vehicle){

    }


}


//private static Transaction parseTransaction(String line) throws DateTimeParseException, NumberFormatException {
//    String[] parts = line.split("\\|");
//    return new Transaction(
//            LocalDate.parse(parts[0].trim()),
//            LocalTime.parse(parts[1].trim()),
//            parts[2].trim(),
//            parts[3].trim(),
//            Double.parseDouble(parts[4].trim())
//    );
//}
//while ((line = reader.readLine()) != null) {
 //       try {
//transactions.add(parseTransaction(line));
 //       } catch (Exception e) {
 //       System.err.println("Skipping malformed line: " + line);
 //           }
//                    }
//
 //                    try (BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"))) {
//        reader.readLine();
//
//try String header = bufferedReader.readLine();
//if (header == null) return transactions;
//
//} catch (IOException | DateTimeParseException | NumberFormatException e) {
//        System.err.println("Failed to read transactions: " + e.getMessage());
//        }