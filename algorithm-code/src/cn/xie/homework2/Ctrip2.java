package cn.xie.homework2;

import java.util.ArrayDeque;
import java.util.Scanner;


/**
 * @author: xie
 * @create: 2020-11-17 19:33
 **/
public class Ctrip2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while (input != null && input.length() > 0) {
            String[] inputs = input.trim().split("\\s+");
            System.out.println(calculate(inputs));
            input = in.nextLine();
        }
    }

    static String calculate(String[] inputs) {
        ArrayDeque<String> stackOperand = new ArrayDeque<>();
        ArrayDeque<String> stackOperator = new ArrayDeque<>();
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == "T" || inputs[i] == "F" || inputs[i] == "(") {
                stackOperand.push(inputs[i]);
            } else if (inputs[i] == "||" || inputs[i] == "&&" || inputs[i] == "!") {
                stackOperator.push(inputs[i]);
            } else if (inputs[i] == ")") {
                int trueCount = 0;
                int falseCount = 0;
                while (!stackOperand.isEmpty()) {
                    String pop = stackOperand.pop();
                    if (pop.equals("T")) {
                        trueCount++;
                    } else if (pop.equals("F")) {
                        falseCount++;
                    } else if (pop.equals("(")) {
                        break;
                    }
                }
                String operator = stackOperator.pop();
                if (operator.equals("!")) {
                    stackOperand.push(trueCount == 0 ? "T" : "F");
                } else if (operator.equals("&&")) {
                    stackOperand.push(falseCount > 0 ? "T" : "F");
                } else if (operator.equals("||")) {
                    stackOperand.push(trueCount > 0 ? "T" : "F");
                }
            }
        }
        return stackOperand.pop();
    }
}
