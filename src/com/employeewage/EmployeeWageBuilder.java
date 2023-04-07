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
         * 1) calculate the random number.
         * 2) check employee is full-time and if employee
              is full-time taking user input for working hour
              and wage per hour then calculating and printing total wage.
         * 3) check employee is part-time and if employee
              is part-time taking user input for working hour
              and wage per hour then calculating and printing total wage.
         * 4) if employee is absent.
         */

        /*
         * 1) calculate the random number.
         */
        double isPresent = Math.random() * 3;
        /*
         * 2) check employee is present and if employee
              is present taking user input for working hour
              and wage per hour then calculating and printing total wage.
         */
        if (isPresent >= 2) {
            System.out.println("....Employee is full time....");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter wage per hour ₹ !");
            int wagePerHour = sc.nextInt();
            System.out.println("Please enter full day working hour !");
            int fullDayWorkingHour = sc.nextInt();
            int totalWage = wagePerHour * fullDayWorkingHour;
            System.out.println("Total wage of employee is : " + totalWage + "₹");
            /*
             * 3) check employee is part-time and if employee
             *   is part-time taking user input for working hour
             *   and wage per hour then calculating and printing total wage.
             */
        }else if(isPresent >= 1 && isPresent < 2){
            System.out.println("....Employee is part time....");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter wage per hour ₹ !");
            int wagePerHour = sc.nextInt();
            System.out.println("Please enter part time working hour !");
            int partTimeWorkingHour = sc.nextInt();
            int totalWage = wagePerHour * partTimeWorkingHour;
            System.out.println("Total wage of employee is : " + totalWage + "₹");
            /*
             * 3) if employee is absent.
             */
        } else {
            System.out.println("....Employee is absent....");
        }
    }
}
