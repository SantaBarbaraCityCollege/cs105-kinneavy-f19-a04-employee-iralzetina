// Replace all code in this file with what is provided in the assignment
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
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     * command line values. Not used in this example below.
     */
    public static void main(String[] args) {
        // Pasted code from sample usage section. Feel free to adjust things like the salary and percent raised
        Employee harry = new Employee("Harry", 20000);
        harry.raiseSalary(10); // Harry gets a 10% raise.
        double harrysSalary = harry.getSalary();
        System.out.println("Harry's salary is " + harrysSalary);
    }
}