package com.employeewage;


public class EmployeeWageBuilder {
    /**
     * Initialize the variable which is final and static
     */
    static final int IS_FULL_TIME = 1;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int IS_PART_TIME = 2;
    static final int NO_OF_WORKING_DAYS = 20;

    /**
     * Method to return random value for employee
     */
    static int employeeCheck() {
        return (int) Math.floor((Math.random() * 10) % 3);
    }

    /**
     * Method to calculate daily wage of employee for part-time,full-time and also printing total wage
     */
    public int dailyWageOfEmployee() {
        int empHrs;
        int totalHrs = 0;
        int totalWage;
        int totalWorkingDays = 0;
        while (totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            switch (employeeCheck()) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " " + "Emp hr: " + totalHrs);
        }
        totalWage = totalHrs * EMP_RATE_PER_HOUR;
        return totalWage;
    }

    /**
     * This is main method of the program creating object to call dailyWageOfEmployee method and printing
     */

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageBuilder employee = new EmployeeWageBuilder();
        System.out.println("Total Wage: " + employee.dailyWageOfEmployee());
    }
}
