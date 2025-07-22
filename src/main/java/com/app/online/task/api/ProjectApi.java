package com.app.online.task.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.online.task.api.input.ModificationResult;
import com.app.online.task.api.input.ProjectForm;
import com.app.online.task.api.input.ProjectSearch;
import com.app.online.task.api.output.ProjectDetails;
import com.app.online.task.api.output.ProjectListItem;
import com.app.online.task.service.ProjectService;

@RestController
@RequestMapping("projects")
public class ProjectApi {
	
	@Autowired
	private ProjectService service;
	
	@GetMapping
	List<ProjectListItem> search(ProjectSearch search){
		return service.search(search);
	}
	
	@GetMapping("{id}")
	ProjectDetails findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping
	ModificationResult<Integer> create(@RequestBody ProjectForm form){
		return service.create(form);
	}
	
	@PutMapping("{id}")
	ModificationResult<Integer> update(@PathVariable int id,@RequestBody ProjectForm form){
		return service.update(id, form);
	}

}
