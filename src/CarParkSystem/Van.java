/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarParkSystem;

/**
 *
 * @author THUSHAN
 */
public class Van extends Vehicle {

    private String cargoVolume;
    private DateTime VehicleInTime;

    //Create constructor of Van class
    Van(DateTime VehicleInTime) {
        this.VehicleInTime = VehicleInTime;

    }

    //public method to return hour
    public DateTime getHour() {
        return VehicleInTime;
    }

    //public method to set hour 
    public void setHour(DateTime getHour) {

    }

    //public method to return day
    public DateTime getDay() {
        return VehicleInTime;
    }

    //public method to set day
    public void setDay(DateTime getDay) {

    }

    //public method to return vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    //public method to set vehicle type
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    //public method to return vehicle ID plate
    public String getVehicleIdPlate() {
        return vehiclePlate;
    }

    //public method to return vehicle brand
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    //public method to display date and time
    public String getDateTime() {
        return String.format("%s", VehicleInTime);
    }

    //public method to set date and time
    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;

    }

    //public method to set vehicle ID plate
    public void setVehicleIdPlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;

    }

    //public method to set vehicle brand
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;

    }

    //public method to return cargo volume in van
    public String getCargoVolume() {
        return cargoVolume;
    }

    //public method to set cargo volume in van
    public void setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    //Van's toString method
    public String toString() {
        return "ID : " + getVehicleIdPlate() + "\n" + " Brand : " + getVehicleBrand() + "\n" + " Cargo Volume : " + getCargoVolume()
                + "\n" + " Type : " + getVehicleType();
    }
}
