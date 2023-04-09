package com.employeewage;

import java.util.Scanner;

public class EmployeeWageBuilder {
    /**
     * This method is for calculating daily employee wage
     * and also part-time employee wage for a month.
     */

    public static void main(String[] args) {
        /*
         * 1) Get the value from user for wage of employee part-time working hour,
         *    full-time working hour.
         * 2) Get the value from user for the condition total number of working days
         *  in a month, and working hour in a month.
         * 3) putting the condition total working days and total working hour.
         * 4) Calculate the random number.
         * 5) Calculate the wage of employee if employee is full time.
         * 6) Calculate the wage of employee if employee is partially present.
         * 7) Print if employee is absent.
         * 8) Print total wage of employee.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * 1) Get the value from user for wage of employee , part-time working hour,
         *  full-time working hour
         */
        System.out.println("Please enter daily wage of employee");
        int wageOfEmployee = sc.nextInt();
        System.out.println("please enter part time working hour");
        int partTime = sc.nextInt();
        System.out.println("please enter full time working hour");
        int fullTime = sc.nextInt();
        int totalWageOfEmployee = 0;
        int workingHour = 0;
        int numberOfWorkingDays = 0;

        /*
         * 2) Get the value from user for the condition total number of working days
         *  in a month, and working hour in a month.
         */

        System.out.println("Please enter condition of total number of working days in a month");
        int totalWorkingDays = sc.nextInt();


        System.out.println("Please enter condition of total number of working hour in a month");
        int totalWorkingHour = sc.nextInt();
        /*
         * 3) putting the condition total working days and total working hour
         */


        while ((numberOfWorkingDays < totalWorkingDays) && (workingHour < totalWorkingHour)) {
            /*
             * 4) Calculate the random number
             */
            int isPresent = (int) (Math.random() * 3);
            /*
             * 5) Calculate the wage of employee if employee is full time
             */
            switch (isPresent) {
                case 1:
                    totalWageOfEmployee += wageOfEmployee;
                    System.out.println("Employee is full time on day ");
                    System.out.println("Employee earned " + wageOfEmployee + "₹");
                    workingHour = workingHour + fullTime;
                    break;
                /*
                 * 6) Calculate the wage of employee if employee is partially present
                 */
                case 2:
                    totalWageOfEmployee += (wageOfEmployee / 2);
                    System.out.println("Employee is partial present on day ");
                    System.out.println("Employee earned " + (wageOfEmployee / 2) + "₹");
                    workingHour = workingHour + partTime;
                    break;
                /*
                 * 7) Print if employee is absent.
                 */
                default:
                    System.out.println("Employee is absent on day ");
                    System.out.println("Employee earned " + 0 + "₹");
            }
            numberOfWorkingDays++;
        }

        /*
         * 8) Print total wage of employee and working hour and no of working days.
         */
        System.out.println("Employee total working hour is " + workingHour);
        System.out.println("Employee total working days is " + numberOfWorkingDays);
        System.out.println("Employee earned total " + totalWageOfEmployee + "₹");
        sc.close();
    }
}
