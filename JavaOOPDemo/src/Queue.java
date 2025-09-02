import java.util.Scanner;

public class Queue {
    int maxQueue = 4;
    int[] queue = new int[maxQueue];
    int front = 0;
    int rear = -1;

    public void enqueue(int value) {
        if (IsFull()) {
            System.out.println("Queue is full");
        } else {
            queue[++rear] = value;
            System.out.println("Enqueue complete: " + value);
        }
    }

    public boolean IsFull() {
        return rear == maxQueue - 1;
    }

    public boolean IsEmpty() {
        return front > rear;
    }

    public void dequeue() {
        if (IsEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int removed = queue[front];
            queue[front] = 0;
            front++;
            System.out.println("Dequeued: " + removed);
            if (front > rear) {
                front = 0;
                rear = -1;
            }
        }
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("The front item is: " + queue[front]);
        }
    }

    public void size() {
        System.out.println("Current queue size: " + (rear - front + 1));
    }

    public void show() {
        if (IsEmpty()) {
            System.out.println(" ");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " | ");
            }
            System.out.println();
        }
    }

    public void ui() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---==Welcome==---");
            System.out.println("--=Queue Operations=--");
            System.out.println("What do you want to do?");
            System.out.println("[1] Enqueue [2] Dequeue [3] Is Empty [4] Is full [5] Peek [6] Size [0] Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    sc.nextLine();
                    enqueue(value);
                    show();
                    break;
                case "2":
                    dequeue();
                    show();
                    break;
                case "3":
                    boolean isEmpty = IsEmpty();
                    if (isEmpty == true) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    } 
                    show();
                    break;
                case "4":
                    boolean isFull = IsFull();
                    if (isFull == true){
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
                    } 
                    show();
                    break;
                case "5":
                    peek();
                    show();
                    break;
                case "6":
                    size();
                    show();
                    break;
                case "0":
                    System.out.println("Goodbye");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } 
    }

}
