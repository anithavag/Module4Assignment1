package com.ust.Module4;

import java.time.LocalDate;
//import java.util.Date;

public class TaskMainDemo {

	public static void main(String[] args) {
		 TaskOperations operations = new TaskOperations(5);

		 operations.addTask("Module 4 Assignment-1", LocalDate.of(2024, 9, 4));
		 operations.addTask("Module 4 Assignment-2", LocalDate.of(2024, 9, 6));
		 operations.addTask("Module 4 Assignment-3", LocalDate.of(2024, 9, 10));
	        
	        System.out.println("Display Tasks:");
	        operations.displayTasks();

	        
	        operations.removeTask(0);

	        
	        System.out.println("Tasks after removal:");
	        operations.displayTasks();
	}

}
