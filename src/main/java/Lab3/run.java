package main.java.Lab3;

import java.util.*;

public class run {
    public static void main(String[] args) {
        stack coolStack = new stack(10);

        String x = "{()}";

        for (char ch : x.toCharArray()){
            if (ch == '{' || ch == '(' || ch == '['){
                coolStack.push(ch);
            }
            if (ch == '}' || ch == ')' || ch == ']'){
                char popped = coolStack.pop();
                if popped 
            }
        }
        
    }
}


