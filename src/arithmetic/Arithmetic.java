package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n = in.nextDouble();
        System.out.println("Enter second number: ");
        double m = in.nextDouble();
        
        System.out.println("Enter arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationString = in.next().toUpperCase();
        Operation operation = Operation.valueOf(operationString);
        
        ArithmeticBase calculator = new ArithmeticBase();
        double result = calculator.calculate(n, m, operation);
        System.out.println("Result: " + result);
    }
}