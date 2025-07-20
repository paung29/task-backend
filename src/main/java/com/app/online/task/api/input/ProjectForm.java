package com.app.online.task.api.input;

import java.time.LocalDate;

public record ProjectForm(
		String name,
		LocalDate startDate,
		LocalDate dueDate,
		String description)
{
	

}
