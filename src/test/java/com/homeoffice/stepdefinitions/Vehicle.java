package com.homeoffice.stepdefinitions;

/**
 * Created by nitinm on 18/07/2017.
 */
public class Vehicle {
    String vehicleNumber;
    String make;
    String colour;
    Integer rowNum;

    public Vehicle(Integer rowNum, String vehicleNumber, String make, String colour) {
        this.vehicleNumber = vehicleNumber;
        this.make = make;
        this.colour = colour;
        this.rowNum = rowNum;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", rowNum=" + rowNum +
                '}';
    }
}
