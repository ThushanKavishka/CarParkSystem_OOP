/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarParkSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author THUSHAN
 */
public class WestminsterCarParkManager implements CarParkManager {

    Scanner sc = new Scanner(System.in);
    //creating new vehicle arraylist with size20
    static ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>(20);
    static int numVehicle = 0;
    static int freeSlots;

    static int carCount;
    static int vanCount;
    static int motorbikeCount;

    public void runMenu() {
        //create Mainmenu
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("*****************************************************************");
        System.out.println("*************<-----CAR   PARK    SYSTEM----->**********************");
        System.out.println("*****************************************************************");
        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("      @@@@####  LOGIN #####@@@@    ");
        System.out.println("");
        System.out.print("   USERNAME:   ");
        String username = sc.next();
        System.out.println("");
        System.out.print("   PASSWORD:   ");
        String password = sc.next();
        System.out.println("");
        //check login validation
        if ((username.equalsIgnoreCase("1")) && ((password.equalsIgnoreCase("1")))) {
            System.out.println("******======<LOGIN SUCCESSFULLY>======******");
            System.out.println("");
            System.out.println("");

            while (true) {
                System.out.println("================================================");
                System.out.println("======<======<===<=HOME PAGE=>===>=====>========");
                System.out.println("================================================");

                System.out.println("");
                System.out.println("1 - Add Vehicle");
                System.out.println("2 - Remove Vehicle");
                System.out.println("3 - Display List Of Current Vehicles");
                System.out.println("4 - Display Car Park Percentage");
                System.out.println("5 - Display Last Vehicle");
                System.out.println("6 - Display Longest Time And Last Vehicle");
                System.out.println("7 - Car Park Charges");
                System.out.println("8 - Display List Of Vehicles For Specified Day");
                System.out.println("9 - Quit");
                System.out.println("");
                System.out.print("YOUR CHOISE: ");
                int choise = sc.nextInt();

                switch (choise) {
                    case 1:
                        addVehicle();
                        break;
                    case 2:
                        deleteVehicle();
                        break;
                    case 3:
                        displayListOfCurrentVehicles();
                        break;
                    case 4:
                        carParkPercentage();
                        break;
                    case 5:
                        displayLastVehicle();
                        break;
                    case 6:
                        longestTimeAndLastVehicle();
                        break;
                    case 7:
                        carparkCharges();
                        break;
                    case 8:
                        displayListOfVehiclesForSpecifiedDay();
                        break;
                    case 9:
                        quit();
                        break;
                    default:
                        System.out.println("********WRONG CHOISE********");
                        break;
                }
            }

        } else {
            System.out.println("");
            System.out.println("============!!!!!USERNAME OR PASSWORD INCORRECT!!!!!============");
            System.out.println("");
        }

    }

    public void addVehicle() {
        try {
            System.out.println("----------------------------------------------");
            System.out.println("**********ADD VEHICLE TO CAR PARK*************");
            System.out.println("----------------------------------------------");
            //calculate no of freeslots that available in car park
            freeSlots = 20 - numVehicle;
            System.out.println("Available Free Slots: " + freeSlots);
            //get user inputs for add vehicle
            System.out.println("");
            System.out.println("Please Enter Valid Vehicle ID Plate No:");
            String vehId = sc.next();
            System.out.println("Please Enter Valid Vehicle Brand:");
            String vehBrand = sc.next();
            System.out.println("Please Enter Valid Entry Date: [Format: dd/mm/yyyy]");
            String vehDate = sc.next();
            System.out.println("Please Enter Valid Entry Time: [Format: hh:mm]");
            String vehTime = sc.next();
            System.out.println("");

            System.out.println("Please Enter Vehicle Type: ");
            System.out.println("1 - Add Car");
            System.out.println("2 - Add Van");
            System.out.println("3 - Add Motorbike");
            System.out.println("");
            System.out.print("YOUR CHOISE:  ");
            System.out.println("");
            int choise1 = sc.nextInt();

            switch (choise1) {
                case 1:
                    //check Are there any free slots available in car park
                    if (numVehicle <= 20) {
                        //get carCount and num of vehicles in carpark increament by 1
                        carCount++;
                        numVehicle++;

                        //   System.out.println("Available Free Slots: " + freeSlots);
                        System.out.println("");
                        System.out.println("***********ADD CAR**************");
                        //create new objects in DateTime class and Car class
                        DateTime dateTime = new DateTime();
                        Car car = new Car(dateTime);
                        System.out.println("");
                        System.out.println("Please Enter Colour Of Car:");
                        String carColor = sc.next();
                        System.out.println("Please Enter Number Of Doors in Car:");
                        String carNoOfDoors = sc.next();
                        //from user inputs,set values to set methods in Car and DateTime class 
                        car.setVehicleIdPlate(vehId);
                        car.setVehicleBrand(vehBrand);
                        car.setNumOfDoors(carNoOfDoors);
                        car.setColour(carColor);
                        car.setVehicleType("Car");
                        dateTime.setDate(vehDate);
                        dateTime.setTime(vehTime);
                        //add car object to vehicle Arraylist that has Vehicle object reference.
                        vehicle.add(car);

                        System.out.println("");
                        //  System.out.println(vehicle.toString());
                    } else {
                        System.out.println("             ________________");
                        System.out.println("-------------CAR PARK IS FULL--------------");
                    }
                    break;
                case 2:
                    //check Are there any free slots available in car park
                    if (numVehicle <= 18) {
                        //get vanCount and num of vehicles in carpark increament by 1
                        vanCount++;
                        numVehicle += 2;
                        //   System.out.println("Available Free Slots: " + freeSlots);
                        System.out.println("");
                        System.out.println("***********ADD VAN**************");
                        //create new objects in DateTime class and Van class
                        DateTime dateTime2 = new DateTime();
                        Van van = new Van(dateTime2);
                        System.out.println("");
                        System.out.println("Please Enter Valid Cargo Volume in Van: ");
                        String vanCargoVol = sc.next();
                        //from user inputs,set values to set methods in Van and DateTime class 
                        van.setVehicleIdPlate(vehId);
                        van.setVehicleBrand(vehBrand);
                        van.setCargoVolume(vanCargoVol);
                        van.setVehicleType("Van");
                        dateTime2.setDate(vehDate);
                        dateTime2.setTime(vehTime);
                        //add van object to vehicle Arraylist that has Vehicle object reference.
                        vehicle.add(van);

                        System.out.println("");
                        //System.out.println(vehicle.toString());
                    } else {
                        System.out.println("             ________________");
                        System.out.println("-------------CAR PARK IS FULL--------------");
                    }
                    break;
                case 3:
                    //check Are there any free slots available in car park
                    if (numVehicle <= 20) {
                        //get motorbikeCount and num of vehicles in carpark increament by 1
                        motorbikeCount++;
                        numVehicle++;

                        //   System.out.println("Available Free Slots: " + freeSlots);
                        System.out.println("");

                        System.out.println("************ADD MOTORBIKE**************");
                        //create new objects in DateTime class and Motorbike class
                        DateTime dateTime3 = new DateTime();
                        Motorbike motorbike = new Motorbike(dateTime3);
                        System.out.println("");
                        System.out.println("Please Enter Valid Size Of Engine in Motorbike: ");
                        String SizeOfEngine = sc.next();
                        //from user inputs,set values to set methods in Motorbike and DateTime class
                        motorbike.setVehicleIdPlate(vehId);
                        motorbike.setVehicleBrand(vehBrand);
                        motorbike.setEngineSize(SizeOfEngine);
                        motorbike.setVehicleType("MotorBike");
                        dateTime3.setDate(vehDate);
                        dateTime3.setTime(vehTime);
                        //add motorbike object to vehicle Arraylist that has Vehicle object reference.
                        vehicle.add(motorbike);

                        System.out.println("");
                        //System.out.println(vehicle.toString());
                    } else {
                        System.out.println("             ________________");
                        System.out.println("-------------CAR PARK IS FULL---------------");

                    }

                    break;
                default:
                    System.out.println("************WRONG CHOISE*********");
                    break;
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("====================INVALID USER INPUT===================");
            System.out.println("");
        }
    }

    public void deleteVehicle() {
        try {
            System.out.println("-------------------------------------------------------");
            System.out.println("*******************REMOVE VEHICLE**********************");
            System.out.println("-------------------------------------------------------");
            System.out.println("");

            //check if num of vehicles in carpark is zero
            if (numVehicle == 0) {
                System.out.println("===========Car Park Is Empty===============");
                System.out.println("");
            } else {
                //get user inputs
                System.out.println("Please Enter Valid Vehicle ID Plate No:");
                String vehId = sc.next();
                System.out.println("Are You Sure That You Want To Remove That Vehicle InThe List? [Y/N]");
                String getPermission = sc.next();
                System.out.println("");
                if (getPermission.equalsIgnoreCase("Y")) {
                    //create variable through Vehicle object reference
                    for (Vehicle AllVehicles : vehicle) {
                        for (int i = 0; i < vehicle.size(); i++) {
                            //check validation
                            if (AllVehicles.getVehicleIdPlate().equals(vehId)) {
                                //create new file to that removing vehicle
                                fileWriting(i);
                                //selected element removed in vehicle Arraylist
                                vehicle.remove(i);
                                System.out.println("*******Vehicle ID Plate " + vehId + " Vehicle Is Successfully Removed*******");

                            } else {
                                System.out.println("******There Is No Vehicle In that VehicleID*******");
                                System.out.println("");
                            }
                        }
                        break;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("============INVALID USER INPUT============");
            System.out.println("");
        }
    }

    public void displayListOfCurrentVehicles() {

        System.out.println("-------------------------------------------------------");
        System.out.println("**********DISPLAY LIST OF CURRENT VEHICLES*************");
        System.out.println("-------------------------------------------------------");
        System.out.println("");

        if (vehicle != null && !vehicle.isEmpty()) {
            //sort the Arraylist
            for (int i = (vehicle.size() - 1); i >= 0; i--) {
                //display vehicle plate,date ,time and vehicle brand of all current vehicles
                System.out.println("");
                System.out.format("%s", vehicle.get(i).vehiclePlate);
                System.out.format("%s", (vehicle.get(i).getDateTime()));
                System.out.format("%s", (vehicle.get(i).getVehicleType()));
                System.out.println("");
                System.out.format("%s", (vehicle.get(i).getVehicleBrand()));
                System.out.println("");

            }
        } else {
            System.out.println("===========Car Park Is Empty===============");
            System.out.println("");
        }
        System.out.println("");

    }

    public void carParkPercentage() {
        try {
            System.out.println("-------------------------------------------------------");
            System.out.println("**********DISPLAY CAR PARK PERCENTAGE******************");
            System.out.println("-------------------------------------------------------");
            System.out.println("");

            //calculate percentage
            double carPercentage = (carCount * 100) / numVehicle;
            double vanPercentage = (vanCount * 100) / numVehicle;
            double motorbikePercentage = (motorbikeCount * 100) / numVehicle;

            System.out.println("Car Percentage: " + carPercentage);
            System.out.println("Van Percentage: " + vanPercentage);
            System.out.println("MotorBike Percentage: " + motorbikePercentage);
            System.out.println("Available Cars in Car Park: " + carCount);
            System.out.println("Available Vans in Car Park: " + vanCount);
            System.out.println("Available MotorBikes in Car Park: " + motorbikeCount);
        } catch (Exception e) {
            System.out.println("");
            System.out.println("===========Car Park Is Empty===============");
            System.out.println("");
        }
    }

    public void displayLastVehicle() {

        System.out.println("-------------------------------------------------------");
        System.out.println("*****************DISPLAY LAST VEHICLE******************");
        System.out.println("-------------------------------------------------------");
        System.out.println("");

        //get value in last element in the Arraylist and Display it.
        if (vehicle != null && !vehicle.isEmpty()) {
            System.out.println(vehicle.get(vehicle.size() - 1));
        } else {
            System.out.println("===========Car Park Is Empty===============");
            System.out.println("");
        }
        System.out.println("");
    }

    public void longestTimeAndLastVehicle() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("*****************DISPLAY LONGEST TIME AND LAST VEHICLE******************");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");

        if (vehicle != null && !vehicle.isEmpty()) {
            //get value in last element in the Arraylist and Display it.
            System.out.print("Longest Time Vehicle In The Car Park: ");
            System.out.println(vehicle.get(vehicle.size() - 1));
            System.out.println("");
            //get value in first element in the Arraylist and Display it.
            System.out.print("Last Vehicle That Enter To The Car Park: ");
            System.out.println(vehicle.get(0));
        } else {
            System.out.println("*******Car Park Is Already Empty*****");
            System.out.println("");
        }
        System.out.println("");
    }

    public void carparkCharges() {
        try {
            DateTime dateTime3 = new DateTime();
            System.out.println("---------------------------------------------------------------");
            System.out.println("*************************CAR PARK CHARGES**********************");
            System.out.println("---------------------------------------------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("===================================================");
            System.out.println("=*       For the first 3 Hours: 3£ per hour      *=");
            System.out.println("=* The Car Park Charges Additionl 1£ per 1hour   *=");
            System.out.println("=*       Max Charges for 24 Hours: 30£           *=");
            System.out.println("===================================================");
            System.out.println("");
            System.out.println("Please Enter Valid Out Date: [Format: dd/mm/yyyy**]");
            String vehDate = sc.next();
            dateTime3.setDate(vehDate);
            System.out.println("Please Enter Valid Out Time: [Format: hh:mm**]");
            String vehTime = sc.next();
            dateTime3.setTime(vehTime);

            int currentDate, currentMonth, currentYear, currentHour, currentMinute;
            currentDate = dateTime3.getdate();
            currentMonth = dateTime3.getMonth();
            currentYear = dateTime3.getYear();
            currentHour = dateTime3.getHour();
            currentMinute = dateTime3.getMinute();

            if (vehicle.size() != 0) {

                for (int i = 0; i < vehicle.size(); i++) {
                    int hourCalc = (currentHour - vehicle.get(i).getHour().getHour());
                    // System.out.println(hourCalc);
                    int dayCalc = (currentDate - vehicle.get(i).getDay().getdate());

                    if (0 <= hourCalc && hourCalc <= 3 && dayCalc == 0) {
                        hourCalc = hourCalc * 3;
                        System.out.println("");
                        System.out.println("Vehicle ID Plate: " + vehicle.get(i).getVehicleIdPlate());
                        System.out.println("         WESTMINSTER CAR PARK          ");
                        System.out.println("=======================================");
                        System.out.println("         YOUR FINAL PRICE: " + hourCalc + "£");
                        System.out.println("        THANK YOU. COME AGAIN!!!!");
                        System.out.println("=======================================");
                        System.out.println("");
                    } else if (3 < hourCalc && hourCalc < 24 && dayCalc == 0) {
                        hourCalc = hourCalc - 3;
                        int newHourCalc = (hourCalc * 1) + 9;
                        System.out.println("");
                        System.out.println("Vehicle ID Plate: " + vehicle.get(i).getVehicleIdPlate());
                        System.out.println("");
                        System.out.println("         WESTMINSTER CAR PARK         ");
                        System.out.println("======================================");
                        System.out.println("YOUR FINAL PRICE : " + newHourCalc + "£");
                        System.out.println("        THANK YOU. COME AGAIN!!!!");
                        System.out.println("======================================");
                        System.out.println("");
                    } else if (dayCalc == 1) {
                        System.out.println("");
                        System.out.println("Vehicle ID Plate: " + vehicle.get(i).getVehicleIdPlate());
                        System.out.println("");
                        System.out.println("         WESTMINSTER CAR PARK         ");
                        System.out.println("======================================");
                        System.out.println("        YOUR FINAL PRICE: 30£");
                        System.out.println("        THANK YOU. COME AGAIN!!!!");
                        System.out.println("======================================");
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("********Invalid User Input********");
                        System.out.println("");
                    }
                }
            } else if (vehicle.size() == 0) {
                System.out.println("");
                System.out.println("=========CAR PARK IS EMPTY==========");
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("============OOPS!!!SOMETHING WENT WRONG============");
            System.out.println("");
        }
    }
//Methods to write a file

    public void fileWriting(int i) {

        try {
            int vehicleParkedYear = vehicle.get(i).getDay().getYear();
            int vehicleParkedMonth = vehicle.get(i).getDay().getMonth();
            int vehicleParkedDay = vehicle.get(i).getDay().getdate();

            String fileName = String.valueOf(vehicleParkedYear) + "-" + String.valueOf(vehicleParkedMonth) + "-" + String.valueOf(vehicleParkedDay);

            File file = new File(fileName);

            //Creates the text file if doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(vehicle.get(i).toString());
            bw.newLine();

            bw.close();

            System.out.println("All The Data Was Successfully Saved To A Text File.");
            System.out.println("");

        } catch (IOException e) {
            System.out.println("Sorry! The Program Could Not Locate The Text File");
            System.out.println("");

        }
    }

    //Retrieving the previous parking details
    public void displayListOfVehiclesForSpecifiedDay() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("********************DISPLAY LIST OF VEHICLES FOR SPECIFIED DATE**********************");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("");

        System.out.print("Please Enter The Valid Specific Day - ");

        int vehicleEnteredDay = 0;
        int vehicleEnteredMonth = 0;
        int vehicleEnteredYear = 0;

        vehicleEnteredDay = sc.nextInt();
        if (vehicleEnteredDay <= 31) {
            System.out.print("Please Enter The Valid Specific Month - ");
            vehicleEnteredMonth = sc.nextInt();
            if (vehicleEnteredMonth <= 12) {
                System.out.print("Please Enter The Valid Specific Year - ");
                vehicleEnteredYear = sc.nextInt();
            } else {
                System.out.println("INVALID MONTH!!!");
                displayListOfVehiclesForSpecifiedDay();
            }
        } else {
            System.out.println("INVALID DAY!!!");
            displayListOfVehiclesForSpecifiedDay();
        }
        System.out.println("");

        String fileName = String.valueOf(vehicleEnteredYear) + "-" + String.valueOf(vehicleEnteredMonth) + "-" + String.valueOf(vehicleEnteredDay);
        fileReading(fileName);

    }

    public static void fileReading(String fileName) {

        //instance of the buffer reader
        BufferedReader br = null;
        try {
            //current line
            String line;
            br = new BufferedReader(new FileReader(fileName));

            System.out.println("======================= S Y S T E M   H I S T O R Y =====================");
            System.out.println("====ON " + fileName + " DAY                                              ====");
            System.out.println("================================         ================================");
            System.out.println("");

            while ((line = br.readLine()) != null) {
                System.out.println("\t" + line);
            }
            System.out.println("\nAll the data was successfully loaded from the text file. \n");
            System.out.println("");
        } catch (IOException e) {
            System.out.println("\nSorry! The program could not locate the text file");
            System.out.println("");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println("\nOops! Something went wrong.");
                System.out.println("");
            }
        }
    }

    public void quit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        WestminsterCarParkManager obj = new WestminsterCarParkManager();
        obj.runMenu();

    }
}
