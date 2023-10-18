package org.study.basics;

public class Operator {

    public Operator() {
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

//        Abbreviate Operators
        int operand3 = 5;
        operand3 += 3;  // operand3 = operand3 + 3;
        System.out.println("operand3: " + operand3);
        operand3 -= 3;  // operand3 = operand3 - 3;
        System.out.println("operand3: " + operand3);
        operand3 *= 3;  // operand3 = operand3 * 3;
        System.out.println("operand3: " + operand3);
        operand3 /= 3;  // operand3 = operand3 / 3;
        System.out.println("operand3: " + operand3);
        operand3 %= 3;  // operand3 = operand3 % 3;
        System.out.println("operand3: " + operand3);

//        Ternary Operator
        int operand4 = 5;
        int operand5 = 3;
        int max = operand4 > operand5 ? operand4 : operand5;
        System.out.println("Max: " + max);

//        Conditional Operators
        int operand6 = 5;
        int operand7 = 3;
        boolean result1 = operand6 > operand7;
        boolean result2 = operand6 < operand7;
        boolean result3 = operand6 >= operand7;
        boolean result4 = operand6 <= operand7;
        boolean result5 = operand6 == operand7;
        boolean result6 = operand6 != operand7;
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
        System.out.println("result5: " + result5);
        System.out.println("result6: " + result6);

//        Precedence
        System.out.println("Precedence Info Table: https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html");


    }
}

//    operand1 and operand2 are operands.
//    +, -, *, /, and % are operators.
//     operand1 + operand2,
//     operand1 - operand2,
//     operand1 * operand2,
//     operand1 / operand2,
//     and operand1 % operand2 are expressions.
