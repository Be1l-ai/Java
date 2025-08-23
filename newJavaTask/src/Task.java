import java.util.Scanner;
import java.util.ArrayList;

public class Task {
    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<String>> task_shell = new ArrayList<>();
    // add new array to make the arraylist 2d so that way we could add both name and status or even description of the task //
    String complete = "Completed";
    String is_default = "On going";

    public ArrayList<String> newList() {
        ArrayList<String> task_info = new ArrayList<String>();
        return task_info;
    }

    public void add_task() {
        System.out.println("Please name the task: ");
        String added_task = scan.nextLine();
        System.out.println("Please the task description: ");
        String added_description = scan.nextLine();

        ArrayList<String> newTask = newList();

        newTask.add(added_task);
        newTask.add(added_description);
        newTask.add(is_default);

        System.out.println("Task added: " + added_task + ". Status: On progress");
        System.out.println(newTask);
        task_shell.add(newTask);
        System.out.println(task_shell);
    }

    public void delete_task() {
        System.out.println("Enter the task to be deleted: ");
        String deleted_task = scan.nextLine();

        for (int i = 0; i < task_shell.size(); i++) {
            if (task_shell.get(i).get(0).equals(deleted_task)) {
                task_shell.remove(i);
                break;
            }
        }
        
        System.out.println("Task deleted: " + deleted_task);
        System.out.println(task_shell);
    }

    public void view_task() {
        // allow viewing of the task//
        System.out.println("View one task [one] or View all [all]");
        String view_task = scan.nextLine();
        if (view_task == "one") {
            System.out.println("Enter task name: ");
            String name = scan.nextLine();
            for (int i = 0; i < task_shell.size(); i++) {
            if (task_shell.get(i).get(0).equals(name)) {
                System.out.println(task_shell.get(i));
                break;
                }
            }
        } else {
        System.out.println(task_shell);
        }
    }

    public void mark_task() {
        // allow marking of the completed task//
        System.out.println("Enter the task to be completed: ");
        String completed_task = scan.nextLine();

        for (int i = 0; i < task_shell.size(); i++) {
            if (task_shell.get(i).get(0).equals(completed_task)) {
                task_shell.get(i).set(2, complete);
                break;
            }
        }

        System.out.println("Task completed: " + completed_task);
        System.out.println(task_shell);
    }

    public void back() {
        // method to use for the ui//
    }

    public void ui() {
        while (true) {
            add_task();
            delete_task();
        }
    }
}