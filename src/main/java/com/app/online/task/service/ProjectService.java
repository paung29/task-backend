package com.app.online.task.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.online.task.api.input.ModificationResult;
import com.app.online.task.api.input.TaskForm;
import com.app.online.task.api.input.TaskSearch;
import com.app.online.task.api.output.TaskDetails;
import com.app.online.task.api.output.TaskListItem;

@Service
public class ProjectService {
	
	public List<TaskListItem> search(TaskSearch search){
		return null;
	}
	
	public TaskDetails findById(int id) {
		return null;
	}
	
	public ModificationResult<Integer> create(TaskForm form){
		return null;
	}
	
	public ModificationResult<Integer> update(int id, TaskForm form){
		return null;
	}

}
