package org.study;

public class OperatorExample {

    public OperatorExample() {
        System.out.println("OperatorExample called");

        int operand1 = 5;
        int operand2 = 3;
        int sum = operand1 + operand2;  // Expression: operand1 + operand2
        int difference = operand1 - operand2;  // Expression: operand1 - operand2
        int product = operand1 * operand2;  // Expression: operand1 * operand2
        int quotient = operand1 / operand2;  // Expression: operand1 / operand2
        int remainder = operand1 % operand2;  // Expression: operand1 % operand2

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}

//    operand1 and operand2 are operands.
//    +, -, *, /, and % are operators.
//     operand1 + operand2,
//     operand1 - operand2,
//     operand1 * operand2,
//     operand1 / operand2,
//     and operand1 % operand2 are expressions.
