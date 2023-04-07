package com.employeewage;

import java.util.Scanner;

public class EmployeeWageBuilder {
    /**
     * This method is for calculating daily employee wage
     * and also part-time employee wage for a month.
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Get the value from user for wage of employee.
         * 2) Get the value from user for number of days.
         * 3) Calculate the random number.
         * 4) Calculate the wage of employee if employee is full time.
         * 5) Calculate the wage of employee if employee is partially present.
         * 6) Print if employee is absent.
         * 7) Print total wage of employee.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * 1) Get the value from user for wage of employee
         */
        System.out.println("Please enter daily wage of employee");
        int wageOfEmployee = sc.nextInt();
        int totalWageOfEmployee = 0;

        /*
         * 2) Get the value from user for number of days
         */
        System.out.println("Please enter number of days");
        int numberOfDays = sc.nextInt();

        for (int i = 1; i <= numberOfDays; i++) {

            /*
             * 3) Calculate the random number
             */
            int isPresent = (int) (Math.random() * 3);

            /*
             * 4) Calculate the wage of employee if employee is full time
             */
            if (isPresent == 1) {
                totalWageOfEmployee += wageOfEmployee;
                System.out.println("Employee is full time on day " + i);
                System.out.println("Employee earned " + wageOfEmployee + "₹");
            }

            /*
             * 5) Calculate the wage of employee if employee is partially present
             */
            else if (isPresent == 2) {
                totalWageOfEmployee += (wageOfEmployee / 2);
                System.out.println("Employee is partial present on day " + i);
                System.out.println("Employee earned " + (wageOfEmployee/2) + "₹");
            }

            /*
             * 6) Print if employee is absent.
             */
            else {
                System.out.println("Employee is absent on day " + i );
                System.out.println("Employee earned " + 0 + "₹");
            }
        }

        /*
         * 7) Print total wage of employee.
         */
        System.out.println("Employee earned " + totalWageOfEmployee + "₹");
        sc.close();
    }
}
