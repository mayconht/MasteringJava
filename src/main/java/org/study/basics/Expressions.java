package org.study.basics;

public class Expressions {
    public Expressions() {
        //Reserved Keywords
        System.out.println("Reserved Keywords: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html");
        //Expressions
        // An expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.
        // The Java programming language allows you to construct compound expressions from various smaller expressions as long as the data type required by one part of the expression matches the data type of the other.
        // For example, you can add an int to a double, because the int value will be converted to a double:
        int operandA = 5;
        double operandB = 3.0;
        double sum = operandA + operandB;  // Expression: operandA + operandB
        System.out.println("Sum: " + sum);
        // The Java programming language uses both operators and keywords as tokens in expressions.

        // Loops and Conditional Statements
        // if else examples:
        int operand1 = 5;
        int operand2 = 3;
        if (operand1 > operand2) {
            System.out.println("operand1 is greater than operand2");
        } else {
            System.out.println("operand1 is not greater than operand2");
        }
//        ternary operator
        int operand3 = 5;
        int operand4 = 3;
        int max = operand3 > operand4 ? operand3 : operand4;
        System.out.println("Max: " + max);
    }
}
