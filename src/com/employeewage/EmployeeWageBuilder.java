package com.employeewage;

import java.util.Scanner;

public class EmployeeWageBuilder {
    /**
     * This method is for calculating daily employee wage
     * and also part-time employee wage.
     *
     * @param args
     */

    public static void main(String[] args) {

        /*
         * 1) calculate the random number and declared some variable
         *    and import the scanner class for taking user input in program.
         * 2) taking switch statement and doing program case wise.
         * 3) check employee is full-time and if employee
              is full-time taking user input for working hour
              and wage per hour then calculating and printing total wage.
         * 4) check employee is part-time and if employee
              is part-time taking user input for working hour
              and wage per hour then calculating and printing total wage.
         * 5) if employee is absent.
         */

        /*
         * 1) calculate the random number.
         */
        int isPresent = (int) (Math.random() * 3);
        int wagePerHour, totalWage;
        Scanner sc = new Scanner(System.in);
        /*
         * 2) taking switch statement and doing program case wise.
         */
        switch (isPresent) {
            /*
             * 3) check employee is present and if employee
             *    is present taking user input for working hour
             *    and wage per hour then calculating and printing total wage.
             */
            case 1:
                System.out.println("....Employee is full time....");
                System.out.println("Please enter wage per hour ₹ !");
                wagePerHour = sc.nextInt();
                System.out.println("Please enter full day working hour !");
                int fullDayWorkingHour = sc.nextInt();
                totalWage = wagePerHour * fullDayWorkingHour;
                System.out.println("Total wage of employee is : " + totalWage + "₹");
                break;
                /*
                 * 4) check employee is part-time and if employee
                 *   is part-time taking user input for working hour
                 *   and wage per hour then calculating and printing total wage.
                 */
            case 2:
                System.out.println("....Employee is part time....");
                System.out.println("Please enter wage per hour ₹ !");
                wagePerHour = sc.nextInt();
                System.out.println("Please enter part time working hour !");
                int partTimeWorkingHour = sc.nextInt();
                totalWage = wagePerHour * partTimeWorkingHour;
                System.out.println("Total wage of employee is : " + totalWage + "₹");
                break;
                /*
                 * 5) if employee is absent.
                 */
            default:
                System.out.println("....Employee is absent....");
        }
    }
}
