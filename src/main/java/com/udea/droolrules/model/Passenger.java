package com.udea.droolrules.model;

public class Passenger {
    private String name;
    private int age;
    private String membershipStatus; // "Basic", "Gold", "Platinum"
    private double luggageWeightKg;
    private boolean travelingWithChildren;
    private String seatPreference; // "Any", "Window", "Aisle"
    private boolean eligibleForUpgrade = true;
    private int loyaltyPoints = 0;
    private boolean vipLoungeAccess = false;
    private boolean priorityCheckIn = false;
    private String assignedSeat;

    public Passenger() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getMembershipStatus() { return membershipStatus; }
    public void setMembershipStatus(String membershipStatus) { this.membershipStatus = membershipStatus; }
    public double getLuggageWeightKg() { return luggageWeightKg; }
    public void setLuggageWeightKg(double luggageWeightKg) { this.luggageWeightKg = luggageWeightKg; }
    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public void setTravelingWithChildren(boolean travelingWithChildren) { this.travelingWithChildren = travelingWithChildren; }
    public String getSeatPreference() { return seatPreference; }
    public void setSeatPreference(String seatPreference) { this.seatPreference = seatPreference; }
    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }
    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }
    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }
}