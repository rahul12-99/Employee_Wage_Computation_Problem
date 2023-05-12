package com.employeewage;
import java.util.ArrayList;

public class EmployeeWageBuilder implements IEmployeeWage{
    /**
     * Initialize the variable
     */
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    /*
     Using Array list and passing CompanyEmployeeWage class as a parameter
     */
    ArrayList<CompanyEmployeeWage> companyEmpWageArray = new ArrayList<>();

    /*
     This method is for adding all company data in arraylist
     */
    @Override
    public void addCompanyEmployeeWage(String Company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray.add(numOfCompany, new CompanyEmployeeWage(Company, empRatePerHour, noOfWorkingDays, maxHoursPerMonth));
        numOfCompany++;
    }

    /*
     This method is for getting the data form arraylist and printing
     */
    @Override
    public void computeEmployeeWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray.get(i).setTotalEmpWage(this.computeEmployeeWage(companyEmpWageArray.get(i)));
            System.out.println(companyEmpWageArray.get(i));
        }
    }

    /**
     * This method is for compute employeeWage for each individual company with part-time and full-time
     */
    private int computeEmployeeWage(CompanyEmployeeWage companyEmpWage) {
        int empHrs , totalWorkingDays = 0, totalEmpHrs = 0;
        while (totalEmpHrs <= companyEmpWage.maxWorkingHours &&
                totalWorkingDays < companyEmpWage.noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * companyEmpWage.ratePerHour;
    }

    /**
     * This is main method of our program for calling the all methods and printing
     */
    public static void main(String[] args) {
        EmployeeWageBuilder employeeWage = new EmployeeWageBuilder();
        System.out.println("Welcome to employee wage calculator");
        employeeWage.addCompanyEmployeeWage("D-Mart", 23, 27, 80);
        employeeWage.addCompanyEmployeeWage("Reliance", 25, 20, 90);
        employeeWage.computeEmployeeWage();
    }
}
