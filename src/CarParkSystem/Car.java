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
public class Car extends Vehicle {

    private String numOfDoors;
    private String colour;
    private DateTime VehicleInTime;

    //create contructor of Car class
    Car(DateTime VehicleInTime) {
        this.VehicleInTime = VehicleInTime;
    }

    //public method to return vehicle Id plate
    public String getVehicleIdPlate() {
        return vehiclePlate;
    }

    //public method to return vehicle brand
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    //public method to return DateTime
    public String getDateTime() {
        return String.format("%s", VehicleInTime);
    }

    //public method to set DateTime
    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;

    }

    //public method to set vehicle Id plate
    public void setVehicleIdPlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;

    }

    //public method to set vehicle brand
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;

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

    //public method to return num of doors in car
    public String getNumOfDoors() {
        return numOfDoors;
    }

    //public method to set num of doors in car
    public void setNumOfDoors(String numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    //public method to return colour
    public String getColour() {
        return colour;
    }

    //publicmethod to set colour
    public void setColour(String colour) {
        this.colour = colour;

    }

    //Car's toString method
    public String toString() {
        return "ID : " + getVehicleIdPlate() + "\n" + " Brand : " + getVehicleBrand() + "\n" + " Number Of Doors : " + getNumOfDoors()
                + "\n" + " Colour : " + getColour() + "\n" + " Type : " + getVehicleType();
    }

}
