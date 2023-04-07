package com.employeewage;

public class EmployeeWageBuilder {
    /**
     * This method is for checking the employee is present or absent
     *
     * @param args
     */

    public static void main(String[] args) {

        /*
         * 1) calculate the random number
         * 2) check employee is present and printing
         * 3) if employee is absent
         */

        /*
         * 1) calculate the random number
         */
        double isPresent = Math.random();
        /*
         * 2) check employee is present and printing
         */
        if (isPresent > 0.5) {
            System.out.println("Employee is present");
            /*
             * 3) if employee is absent
             */
        } else {
            System.out.println("Employee is absent");
        }
    }
}
