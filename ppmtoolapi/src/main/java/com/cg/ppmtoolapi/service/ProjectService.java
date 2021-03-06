package com.cg.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ppmtoolapi.domain.Project;
import com.cg.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
     private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		
		
		return projectRepository.save(project);
	}
}
