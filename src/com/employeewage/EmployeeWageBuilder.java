package com.employeewage;


public class EmployeeWageBuilder {
    /**
     * Initialize the variable which is final
     */
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String Company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    /**
     * Created a parametrized constructor for private variable
     */
    public EmployeeWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.Company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    /**
     * This method is save total wage for company
     */
    public void company() {
        int empHrs, totalWorkingDays = 0, totalEmpHrs = 0;

        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
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
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    /**
     * To string method for printing
     * @return
     */
    @Override
    public String toString() {
        return "Total Emp Wage for " + Company + " = " + totalEmpWage;
    }

    /**
     * This is main method of the program for taking input and calling the company method
     * and printing the total employee wage
     */
    public static void main(String[] args) {
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("DMart", 23, 25, 80);
        dMart.company();
        System.out.println(dMart);
        EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance", 25, 20, 90);
        reliance.company();
        System.out.println(reliance);

    }
}
