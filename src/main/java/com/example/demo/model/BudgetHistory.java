package com.example.demo.model;

public class BudgetHistory {
    private double action;
    private String description;

    public BudgetHistory(double action, String description) {
        this.action = action;
        this.description = description;
    }

    public double getAction() {
        return action;
    }

    public String getDescription() {
        return description;
    }

    public void setAction(double action) {
        this.action = action;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
