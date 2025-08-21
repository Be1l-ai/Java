import java.util.Scanner;

public class Data {
    int maxStack = 4;
    int[] stack = new int[maxStack];
    int top = -1;

    public void push(int value) {
        if (IsFull()) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
            System.out.println("Push complete");
        }
    }

    public int pop(int value) {
        if (IsEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean IsFull() {
        if (top == maxStack - 1) {
            System.out.println("Stack is Full");
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("The top item is: " + stack[top]);
        }
    }

    public void size() {
        System.out.println("Current stack size: " + (top + 1));
    }

    public void ui() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---==Welcome==---");
        System.out.println("--=Stack Operations=--");
        System.out.println("What do you want to do?");
        System.out.println("[1] Push [2] Pop [3] Is Empty [4] Is full [5] Peek [6] Size");
        String answer = scan.nextLine();
        switch (answer) {
            case "1":
                System.out.print("Enter a number to push: ");
                int value = scan.nextInt();
                push(value);
                break;
            case "2":
                pop(top);
                System.out.println("Top value successfully popped");
                break;
            case "3":
                IsEmpty();
                break;
            case "4":
                IsFull();
                break;
            case "5":
                peek();
                break;
            case "6":
                size();
                break;
            default:
                System.out.println("Invalid option");
        }
        scan.close();
    }
}
