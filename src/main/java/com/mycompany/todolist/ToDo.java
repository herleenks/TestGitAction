/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author sambh
 */
public class ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {
            System.out.println("\n--- To-Do List ---");
            List<String> tasks = todoList.getTasks();
            if (tasks.isEmpty()) {
                System.out.println("No tasks yet.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    boolean completed = todoList.isTaskCompleted(i);
                    String status = completed ? "[X]" : "[ ]";
                    System.out.println(i + ": " + status + " " + tasks.get(i));
                }
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add task");
            System.out.println("2. Update task");
            System.out.println("3. Delete task");
            System.out.println("4. Mark task completed");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String taskName = scanner.nextLine();
                    todoList.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new task description: ");
                    String newDesc = scanner.nextLine();
                    todoList.updateTask(updateIndex, newDesc);
                    break;
                case 3:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    todoList.deleteTask(deleteIndex);
                    break;
                case 4:
                    System.out.print("Enter task index to mark completed: ");
                    int completeIndex = scanner.nextInt();
                    todoList.markTaskCompleted(completeIndex);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return; // exit the program
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
