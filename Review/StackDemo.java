package review;

import java.util.Scanner;

interface Stack {
    void push(int data);
    int pop();
}

class FixedStack implements Stack {
    int[] stack;
    int top = -1;
    int size;

    public FixedStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
}

class DynamicStack implements Stack {
    int[] stack;
    int top;
    int x;

    public DynamicStack(int size,int x) {
        stack = new int[size];
        top = -1;
        this.x=x;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length +x];
            for (int i = 0; i <= top; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }
}

public class StackDemo {
    public static void main(String[] args) {
    	  System.out.println("Enter the size of the dynamic array to be added");
          Scanner sc=new Scanner(System.in);
          int x;
          x=sc.nextInt();
        FixedStack fs = new FixedStack(6);
        DynamicStack ds = new DynamicStack(5,x);
      

        for (int i = 1; i <= 6; i++) {
            fs.push(i);
        }
        System.out.println("Elements in fixed stack:");
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+fs.pop());
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            ds.push(i);
        }
        System.out.println("Elements in dynamic stack:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+ds.pop());
        }
    }
}