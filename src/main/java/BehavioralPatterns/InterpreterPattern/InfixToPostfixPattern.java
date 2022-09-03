package BehavioralPatterns.InterpreterPattern;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern {
    Stack<Character> s1 = new Stack<Character>();

    @Override
    public String conversion(String exp) {
        return postFixConversion(exp);
    }  // end override method

    /**
     *
     * @param exp
     * @return
     */
    private String postFixConversion(String exp) {
        String postfix = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'||ch=='%')
            {
                precedenceChecker(ch, i);
            } else {
                postfix += ch;
            }

        } // end for

        int len = s1.size();
        for (int j = 0; j < len; j++)
            postfix += s1.pop();
        return postfix;
    }

    /**
     * Sets Precedent
     * @param ch character
     * @param i index
     */
    private void precedenceChecker(char ch, int i) {

        String postfix = "";
        int priority = 0;// for the priority of operators.

        // check the precedence
        if (s1.size() <= 0)
            s1.push(ch);
        else {
            Character chTop = (Character) s1.peek();
            if (chTop == '*' || chTop == '/')
                priority = 1;
            else
                priority = 0;
            if (priority == 1) {
                if (ch == '*' || ch == '/' || ch == '%') {
                    postfix += s1.pop();
                    i--;
                } else { // Same
                    postfix += s1.pop();
                    i--;
                }
            } else {
                if (ch == '+' || ch == '-') {
                    postfix += s1.pop();
                    s1.push(ch);
                } else
                    s1.push(ch);
            }

        }
    }


} // end class
