/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sambh
 */
public class ToDoList {

  
    
    
    //Original Code during TDD Process 
    
    private List<String> tasks = new ArrayList<>();
    private List<Boolean> completed = new ArrayList<>();
    
    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        completed.add(false);
    }

    public void markTaskCompleted(int index) {
        completed.set(index, true);
        }

    public boolean isTaskCompleted(int index) {
        return completed.get(index);
        }
    
    public void deleteTask(int index){
        tasks.remove(index);
    }

    public void updateTask(int index, String newTask){
        tasks.set(index,newTask);

    }
    
    //Refactored code
    
     /**
    private List<Task> tasks = new ArrayList<>();

    private static class Task {
        String description;
        boolean completed;

        Task(String description) {
            this.description = description;
            this.completed = false;
        }
    }
    
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public List<String> getTasks() {
        List<String> taskNames = new ArrayList<>();
        for (Task task : tasks) {
            taskNames.add(task.description);
        }
        return taskNames;
    }

    public void updateTask(int index, String newDescription) {
        tasks.get(index).description = newDescription;
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public void markTaskCompleted(int index) {
        tasks.get(index).completed = true;
    }

    public boolean isTaskCompleted(int index) {
        return tasks.get(index).completed;
    }
    */
    
  
};


