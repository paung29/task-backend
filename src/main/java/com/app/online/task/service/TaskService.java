package com.app.online.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.online.task.api.input.ModificationResult;
import com.app.online.task.api.input.TaskForm;
import com.app.online.task.api.input.TaskSearch;
import com.app.online.task.api.output.TaskDetails;
import com.app.online.task.api.output.TaskListItem;
import com.app.online.task.model.repo.ProjectRepo;
import com.app.online.task.model.repo.TasksRepo;



@Service
@Transactional(readOnly = true)
public class TaskService {
	
	@Autowired
	private TasksRepo taskRepo;
	@Autowired
	private ProjectRepo projectRepo;
	
	@Transactional
	public ModificationResult<Integer> create(TaskForm form){
		var project = projectRepo.findById(form.projectId()).orElseThrow();
		var entity = taskRepo.save(form.entity(project));
		return ModificationResult.success(entity.getId());
	}
	
	@Transactional
	public ModificationResult<Integer> update(int id, TaskForm form){
		var entity = taskRepo.findById(id).orElseThrow();
		form.update(entity);
		return ModificationResult.success(id);
	}
	
	public List<TaskListItem> search(TaskSearch search){
		return null;
	}
	
	public TaskDetails findById(int id) {
		return null;
	}

}
