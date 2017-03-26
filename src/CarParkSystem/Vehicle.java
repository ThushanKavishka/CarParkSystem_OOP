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
public abstract class Vehicle {

    DateTime dateTime;
    protected String vehiclePlate;
    protected String vehicleBrand;
    protected String vehicleType;

    //create all the abstrct methods
    public abstract String getVehicleIdPlate();

    public abstract void setVehicleIdPlate(String vehiclePlate);

    public abstract String getDateTime();

    public abstract void setDateTime(DateTime dateTime);

    public abstract String getVehicleBrand();

    public abstract void setVehicleBrand(String vehicleBrand);

    public abstract DateTime getHour();

    public abstract DateTime getDay();

    public abstract String getVehicleType();

    public abstract void setVehicleType(String vehicleType);
}
