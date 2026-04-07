import java.util.Stack;

public class StackExample{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("Popped Element " + stack.pop());
        System.out.println("Current Top element: " +stack.peek());
        System.out.println("is current stack empty: "+stack.isEmpty());        
    }
}
