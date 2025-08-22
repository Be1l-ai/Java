## **Activity: Personal Task Manager (Console App)**

Build a simple **console-based task manager** in Java.

### **Requirements:**

1. A user should be able to:

   * Add a task (with a name, description, and due date).
   * View all tasks.
   * Mark a task as completed.
   * Delete a task.

2. Use **Object-Oriented Programming (OOP)**:

   * Create a `Task` class with fields (`id`, `name`, `description`, `dueDate`, `isCompleted`).
   * Create a `TaskManager` class that stores tasks in an `ArrayList<Task>`.

3. Add a simple **menu system** in the `main` method:

   ```
   1. Add Task
   2. View Tasks
   3. Mark Task as Completed
   4. Delete Task
   5. Exit
   ```

4. Optional (for challenge):

   * Save tasks to a file (using Java’s `FileWriter` and `BufferedReader`) so they persist when you restart the program.
   * Add search/filter features (e.g., view only incomplete tasks, or tasks due today).

---

### **What You’ll Learn by Doing This:**

* **Classes & Objects** (how to model real-world things in code).
* **ArrayLists** (dynamic storage).
* **Methods** (breaking big problems into smaller parts).
* **User Input** with `Scanner`.
* (Optional) **File I/O** for persistence.