package Projects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class javaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Welcome to the Scientific Calculator!");

        /**System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (sin, cos, tan, sqrt, exp, log, +, -, *, /): ");
        String operation = scanner.next();*/

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Welcome to the Scientific Calculator!\nEnter the first number: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your second number: "));
        String operation = JOptionPane.showInputDialog("Enter the operation (sin, cos, tan, sqrt, exp, log, +, -, *, /): ");

        double result = 0.0;
        switch (operation) {
            case "sin":
                result = sin(num1);
                break;
            case "cos":
                result = cos(num1);
                break;
            case "tan":
                result = tan(num1);
                break;
            case "sqrt":
                result = sqrt(num1);
                break;
            case "exp":
                result = exp(num1);
                break;
            case "log":
                result = log(num1);
                break;
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = sub(num1, num2);
                break;
            case "*":
                result = mul(num1, num2);
                break;
            case "/":
                result = div(num1, num2);
                break;
            default:
                System.out.println("Error! Invalid operation.");
        }

        System.out.println("Result: " + result);
        JOptionPane.showMessageDialog(null, result);

        //scanner.close();
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static double exp(double num) {
        return Math.exp(num);
    }

    public static double log(double num) {
        return Math.log(num);
    }

    public static double add(double num1, double num2) {
        return num1+num2;
    }

    public static double sub(double num1, double num2) {
        return num1-num2;
    }

    public static double mul(double num1, double num2) {
        return num1*num2;
    }

    public static double div(double num1, double num2) {
        return num1/num2;
    }
}

