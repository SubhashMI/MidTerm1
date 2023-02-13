/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */



    /**
     * @param args the command line arguments
     */
   import arithmetic.ArithmeticBase.ArithmeticOperation;
import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();
        System.out.println("Enter the arithmetic operation to perform: ");
        String operationInput = sc.next();
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationInput.toUpperCase());

        ArithmeticBase arithmeticBase = new ArithmeticBase();
        double result = arithmeticBase.calculate(x, y, operation);

        System.out.println("Result: " + result);
    }
} // succesfully cloned it

