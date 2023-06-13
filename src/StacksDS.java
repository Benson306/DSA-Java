import java.util.Stack;

public class StacksDS {

    public static void main(String[] args){ // LIFO
        Stack<String> stack = new Stack<String>();

        stack.push("Ben");
        stack.push("Eliud");
        stack.push("Mercy");
        stack.push("Jesicca");

        System.out.println(stack.peek()); // See what's at the top of the stack

        System.out.println(stack.search("Ben")); // Find in a stack

        stack.pop(); //Remove Last item In

        System.out.println(stack);
    }
}
