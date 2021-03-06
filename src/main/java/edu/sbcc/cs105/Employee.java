/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Iral A. Zetina
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {
    
    private String name;
    private double salary; 

    public void setName(String nameGiven) {
        name = nameGiven;
    }

    public void getSalary(double salaryGiven) {
        salary = salaryGiven; {
    
    }

}
    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {
        //Initializes instance variables from constructor (ctor) parameters
        name = employeeName;
        salary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
        // Returns the name of the employee;
        return name; 
    }

    public double getSalary() {
        // Returns the current salary of the employee
        return salary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
        // Calculates the new salary by increasing it by the percent passed in as a method argument
        salary = salary + (salary * (byPercent * .01)); 
    }
}