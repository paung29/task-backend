package com.app.online.task.api.input;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TaskForm(
		@NotNull(message = "Please select project.")
		Integer projectId,
		@NotBlank(message = "Please enter task name")
		String name,
		@NotBlank(message = "Please enter assignee")
		String assignee,
		@NotNull(message = "Please enter due date.")
		LocalDate dueDate,
		LocalDate startDate,
		LocalDate endDate,
		String description
		) {

}
