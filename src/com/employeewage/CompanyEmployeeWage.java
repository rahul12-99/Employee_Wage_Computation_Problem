package com.employeewage;

/**
 * This class is for declare the variable and constructor and also to string method
 */

public class CompanyEmployeeWage {
    /**
     * Initialize the variable
     */
    public final String company;
    public final int ratePerHour;
    public final int noOfWorkingDays;
    public final int maxWorkingHours;
    public int totalEmpWage;

    /**
     * Created a constructor
     */

    public CompanyEmployeeWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    /**
     * This is setter method for total employeeWage
     */

    public void setTotalEmpWage (int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    /**
     * To string method for printing
     */
    @Override
    public String toString() {
        return "Total employee wage for company " + company + " is " + totalEmpWage;
    }
}
