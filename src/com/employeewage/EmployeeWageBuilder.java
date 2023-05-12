package com.employeewage;


public class EmployeeWageBuilder {
    /**
     * Initialize the variable
     */
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    private int noOfCompany = 0;
    private final CompanyEmployeeWage[] companyEmployeeWage;

    /*
     created constructor for passing size in array for company
     */
    public EmployeeWageBuilder() {
        companyEmployeeWage = new CompanyEmployeeWage[5];
    }

    /*
     This method for adding the company employee wage and passing variable as an arguments
     */
    private void addCompanyEmpWage(String company, int ratePerHour, int noOfWorkingDays, int maxWorkingHours) {
        companyEmployeeWage[noOfCompany] = new CompanyEmployeeWage(company, ratePerHour, noOfWorkingDays, maxWorkingHours);
        noOfCompany++;
    }

    /*
     This method is for get monthly wage for each company
     */
    private void getMonthlyWages() {
        for (int i = 0; i < noOfCompany; i++) {
            companyEmployeeWage[i].setTotalEmpWage(this.getMonthlyWage(companyEmployeeWage[i]));
            System.out.println(companyEmployeeWage[i]);
        }
    }
    /*
     This method is for getMonthly wage for all individual company and returning the totalWage
     */

    public int getMonthlyWage(CompanyEmployeeWage companyWage) {
        int totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours < companyWage.maxWorkingHours && totalWorkingDays < companyWage.noOfWorkingDays) {
            totalWorkingDays++;
            int empHours;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
                    break;
            }
            totalEmpHours += empHours;
        }
        return totalEmpHours * companyWage.ratePerHour;
    }

    /*
     * This is main method of our program for calling the all method and printing
     */
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmpWage("D-Mart", 23, 27,80);
        employeeWageBuilder.addCompanyEmpWage("Reliance", 25, 20, 90);
        employeeWageBuilder.getMonthlyWages();
    }
}
