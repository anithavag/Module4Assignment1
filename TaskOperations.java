package com.ust.Module4;

import java.time.LocalDate;
//import java.util.Date;

public class TaskOperations {
	
	private Task [] task;
	private int numOfTasks;
	
	public TaskOperations(int capacity) {
        task = new Task[capacity];
        numOfTasks = 0;
	}
	
	public void addTask(String description, LocalDate dueDate) {
        if (numOfTasks < task.length) {
            task[numOfTasks] = new Task(description, dueDate);
            numOfTasks++;
            System.out.println("Task added successfully!");
        } else {
            System.out.println("Task cannot be added.");
        }
    }
public void removeTask(int index) {
        if (index < 0 || index >= numOfTasks) {
            System.out.println("Invalid task index.");
            return;
        }
        for (int i = index; i < numOfTasks - 1; i++) {
            task[i] = task[i + 1];
        }
        task[--numOfTasks] = null; 
        System.out.println("Task removed.");
    }

	
public void displayTasks() {
    if (numOfTasks == 0) {
        System.out.println("No tasks available.");
        return;
    }
    for (int i = 0; i < numOfTasks; i++) {
        System.out.println((i + 1) + ". " + task[i]);
    }
}
}
