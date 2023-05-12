package com.employeewage;

/**
 * This is an interface which is implemented by EmployeeWageBuilder class
 */

public interface IEmployeeWage {
    void addCompanyEmployeeWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmployeeWage();
    public int getTotalWage(String Company );
}
