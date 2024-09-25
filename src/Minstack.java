

import java.util.Stack;

public class Minstack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Minstack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        System.out.println("Pushed " + x + " to stack");
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public void min(){
        if (minStack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Minimum element in the stack is: " + minStack.peek());
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Minstack ms = new Minstack();
        ms.push(5);
        ms.push(60);
        ms.push(165);
        ms.push(90);
        ms.push(10);
        ms.min();
        ms.pop();
        ms.min();
    }
}