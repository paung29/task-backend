package com.app.online.task.api.output;

import java.time.LocalDate;

import com.app.online.task.model.entity.Project;
import com.app.online.task.model.entity.Project_;
import com.app.online.task.model.entity.Tasks;
import com.app.online.task.model.entity.Tasks_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ListJoin;
import jakarta.persistence.criteria.Root;

public record ProjectListItem(
		int id,
		String name,
		LocalDate startDate,
		LocalDate dueDate,
		long tasks) {

	public static void select(CriteriaBuilder cb, CriteriaQuery<ProjectListItem> cq, Root<Project> root,
			ListJoin<Project, Tasks> tasks) {
		
		cq.multiselect(
				root.get(Project_.id),
				root.get(Project_.name),
				root.get(Project_.startDate),
				root.get(Project_.dueDate),
				cb.count(tasks.get(Tasks_.id))
				
		);
		
		cq.groupBy(
				root.get(Project_.id),
				root.get(Project_.name),
				root.get(Project_.startDate),
				root.get(Project_.dueDate)
		);
		
		
	}

}
