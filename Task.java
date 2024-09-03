package com.ust.Module4;

import java.time.LocalDate;

//import java.util.Date;

public class Task {

	private String description;
	private LocalDate duedate;
	
	
	public Task(String description, LocalDate duedate) {
		this.description = description;
		this.duedate = duedate;
	}

	public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return duedate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueDate=" + duedate +
                '}';
    }
}
