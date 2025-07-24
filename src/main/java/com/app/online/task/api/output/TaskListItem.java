package com.app.online.task.api.output;

import java.time.LocalDate;

import com.app.online.task.model.entity.Tasks;

public record TaskListItem(
		int id,
		int projectId,
		String project,
		String name,
		String assignee,
		LocalDate duedate,
		LocalDate startDate,
		LocalDate endDate) {

	
	public static TaskListItem from(Tasks entity) {
		var project = entity.getProject();
		
		return new TaskListItem(
				entity.getId(), 
				project.getId(), 
				project.getName(), 
				entity.getName(),
				entity.getAssignee(), 
				entity.getDueDate(), 
				entity.getStartDate(), 
				entity.getEndDate()
				);
	}
}
