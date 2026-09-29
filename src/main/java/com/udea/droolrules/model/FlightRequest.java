package com.udea.droolrules.model;

public class FlightRequest {
    private Passenger passenger;
    private Flight flight;

    public FlightRequest() {}

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }
    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
}
