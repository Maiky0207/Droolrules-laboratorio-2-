package com.udea.droolrules.model;

import java.util.ArrayList;
import java.util.List;

public class FlightResponse {
    private boolean upgradedToBusiness;
    private double discountPercentage;
    private double compensationAmount;
    private boolean luggageAllowed = true;
    private List<String> appliedRules = new ArrayList<>();

    // Método exigido pelas regras DRL:
    public void addAppliedRule(String rule) {
        this.appliedRules.add(rule);
    }

    public List<String> getAppliedRules() {
        return appliedRules;
    }

    public void setAppliedRules(List<String> appliedRules) {
        this.appliedRules = appliedRules;
    }

    public boolean isUpgradedToBusiness() {
        return upgradedToBusiness;
    }

    public void setUpgradedToBusiness(boolean upgradedToBusiness) {
        this.upgradedToBusiness = upgradedToBusiness;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getCompensationAmount() {
        return compensationAmount;
    }

    public void setCompensationAmount(double compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public boolean isLuggageAllowed() {
        return luggageAllowed;
    }

    public void setLuggageAllowed(boolean luggageAllowed) {
        this.luggageAllowed = luggageAllowed;
    }
}