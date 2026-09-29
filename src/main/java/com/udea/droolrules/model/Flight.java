package com.udea.droolrules.model;

public class Flight {
    private int delayMinutes;
    private double flightDurationHours;
    private double baggageWeight;
    private boolean emergencyExitSeatAvailable;

    public int getDelayMinutes() {
        return delayMinutes;
    }

    public void setDelayMinutes(int delayMinutes) {
        this.delayMinutes = delayMinutes;
    }

    public double getFlightDurationHours() {
        return flightDurationHours;
    }

    public void setFlightDurationHours(double flightDurationHours) {
        this.flightDurationHours = flightDurationHours;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public boolean isEmergencyExitSeatAvailable() {
        return emergencyExitSeatAvailable;
    }

    public void setEmergencyExitSeatAvailable(boolean emergencyExitSeatAvailable) {
        this.emergencyExitSeatAvailable = emergencyExitSeatAvailable;
    }
}