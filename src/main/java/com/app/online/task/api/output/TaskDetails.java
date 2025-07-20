package com.app.online.task.api.output;

import java.time.LocalDate;

public record TaskDetails(
		int id,
		ProjectListItem project,
		String name,
		String assignee,
		LocalDate duedate,
		LocalDate startDate,
		LocalDate endDate,
		String description) {

}