/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.todolist;


import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 *
 * @author sambh
 */
public class ToDoListTest {
   @Test
   public void createListTest(){
    ToDoList todo = new ToDoList();
    assertEquals(0, todo.getTasks().size());
}
   
@Test
void addTaskTest() {
    ToDoList todo = new ToDoList();
    todo.addTask("Finish lab");

    assertEquals(1, todo.getTasks().size());
    assertEquals("Finish lab", todo.getTasks().get(0));
}

@Test
void taskCompletedTest() {
    ToDoList todo = new ToDoList();
    todo.addTask("Write tests");

    todo.markTaskCompleted(0);

    assertTrue(todo.isTaskCompleted(0));
}

@Test
void deleteTaskTest() {
    ToDoList todo = new ToDoList();
    todo.addTask("Task 1");
    todo.addTask("Task 2");

    todo.deleteTask(0); 

    assertEquals(1, todo.getTasks().size());
    assertEquals("Task 2", todo.getTasks().get(0));
}

@Test 
void updateTaskTest(){
    ToDoList todo = new ToDoList();
    todo.addTask("Finish Lab 1");
    System.out.println(todo.getTasks()); //

    todo.updateTask(0, "Finish Lab 2");
    System.out.println(todo.getTasks());
}
}
