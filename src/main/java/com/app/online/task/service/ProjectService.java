package com.app.online.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.online.task.api.input.ModificationResult;
import com.app.online.task.api.input.ProjectForm;
import com.app.online.task.api.input.ProjectSearch;
import com.app.online.task.api.output.ProjectDetails;
import com.app.online.task.api.output.ProjectListItem;
import com.app.online.task.model.repo.ProjectRepo;

@Service
@Transactional(readOnly = true)
public class ProjectService {
	
	@Autowired
	private ProjectRepo repo;
	
	@Transactional
	public ModificationResult<Integer> create(ProjectForm form) {
		var entity = repo.save(form.entity());
		return ModificationResult.success(entity.getId());
	}

	@Transactional
	public ModificationResult<Integer> update(int id, ProjectForm form) {
		var entity = repo.findById(id).orElseThrow();
		form.update(entity);
		return ModificationResult.success(entity.getId());
	}

	public List<ProjectListItem> search(ProjectSearch search) {
		
		return null;
	}

	public ProjectDetails findById(int id) {
		
		return null;
	}


}
