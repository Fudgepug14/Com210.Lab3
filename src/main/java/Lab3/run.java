package main.java.Lab3;

public class run {
    public static void main(String[] args) {
        stack coolStack = new stack(10000);

        String x = "{[](){([])}}";
        try {

            for (char ch : x.toCharArray()){
                if (ch == '{' || ch == '(' || ch == '['){
                    System.out.println("pushing " + ch);
                    coolStack.push(ch);
                    continue;
                }
                char popped = coolStack.pop();
    
                System.out.println(ch + ", " + popped);
                if (ch == '}' && popped != '{'){
                    System.out.println("Not valid! }");
                    return;
                }
                if (ch == ')' && popped != '('){
                    System.out.println("Not valid! )");
                    return;
                }
                if (ch == ']' && popped != '['){
                    System.out.println("Not valid! ]");
                    return;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Not valid!");
            return;
        }
        System.out.println("Valid!");
    } 
}




