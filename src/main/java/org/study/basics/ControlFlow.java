package org.study.basics;

public class ControlFlow {
    public ControlFlow() {

        conditionalStatements();

    }

    private void conditionalStatements() {
        System.out.println("Conditional Statements");
        int x = 10;
        if (x == 10) {
            System.out.println("x is 10 and is on first if statement");
        } else if (x == 20) {
            System.out.println("x is 20 and is on second if statement");
        } else {
            System.out.println("x is not 10 or 20 and is on else statement");
        }

        switch (x) {
            case 10:
                System.out.println("x is 10 and is on first switch case");
                break;
            case 20:
                System.out.println("x is 20 and is on second switch case");
                break;
            default:
                System.out.println("x is not 10 or 20 and is on default switch case");
        }
        System.out.println(enhancedSwitchCase(x + 45));

    }

    private String enhancedSwitchCase(int x) {
        System.out.println("Enhanced Switch Statement");
        return switch (x) {
            case 10 -> {
                yield "x is 10 and is on first enhanced switch case";
            }
            case 20 -> {
                yield "x is 20 and is on second enhanced switch case";
            }
            case 30, 40, 50 -> {
                yield "x is 30, 40 or 50 and is on third enhanced switch case";
            }
            default -> {
                String message = "x is not 10, 20, 30, 40 or 50 and is on default enhanced switch case";
                yield message; //Just an example, the env is not needed here
            }
        };
    }
}

