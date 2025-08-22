import java.util.Scanner;
import java.util.ArrayList;

public class Task {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> task_name = new ArrayList<String>();
    boolean complete = true;
    boolean is_default = false;

    public void add_task() {
        System.out.println("Please name the task: ");
        String added_task = scan.nextLine();
        task_name.add(added_task);
        System.out.println("Task added: " + added_task);
        System.out.println(task_name);
    }

    public void delete_task() {
        System.out.println("Enter the task to be deleted: ");
        String deleted_task = scan.nextLine();
        task_name.remove(deleted_task);
        System.out.println("Task deleted: " + deleted_task);
        System.out.println(task_name);
    }

    public void view_task() {
        
    }

    public void mark_task() {
        
    }

    public void back() {
        
    }

    public void ui() {
        while (true) {
            add_task();
            delete_task();
        }
    }
}