package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Main calc = new Main();
        int operator;
        double num1, num2, res;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator app");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Choose your operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        operator = input.nextInt();
        if(operator == 5){
            System.out.println("Exiting system");
            System.exit(0);
        }

        System.out.println();

        System.out.println("Enter first number");
        num1 = input.nextDouble();

        System.out.println("Enter second number");
        num2 = input.nextDouble();

        System.out.println("--------------------------------------------------------------------------");

        switch (operator){
            case 1:
                res = calc.add(num1, num2);
                System.out.println("Addition of " + num1 + " and " + num2 + " is " + res);
                break;
            case 2:
                res = calc.sub(num1, num2);
                System.out.println("Subtracting " + num2 + " from " + num1 + " gives " + res);
                break;
            case 3:
                res = calc.mul(num1, num2);
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + res);
                break;
            case 4:
                res = calc.div(num1, num2);
                System.out.println("Dividing " + num1 + " by " + num2 + " gives " + res);
                break;
            default:
                logger.error("Invalid menu input");
                System.out.println("Invalid menu output");
                break;
        }
        input.close();
    }

    public double add(double a, double b){
        logger.info("Executing addition");
        return a + b;
    }
    public double sub(double a, double b){
        logger.info("Executing subtraction");
        return a - b;
    }
    public double mul(double a, double b){
        logger.info("Executing multiplication");
        return a * b;
    }
    public double div(double a, double b){
        if(b == 0){
            logger.error("Division by 0 not possible");
            System.out.println("Invalid input");
            System.exit(-1);
        }
        logger.info("Executing division");
        return a / b;
        //eshshshs
    }
}