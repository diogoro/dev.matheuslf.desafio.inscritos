package dev.matheuslf.desafio.inscritos.service;

import dev.matheuslf.desafio.inscritos.dto.PageableProjectResponseDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectRequestDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectResponseDto;
import dev.matheuslf.desafio.inscritos.mappers.ProjectMapper;
import dev.matheuslf.desafio.inscritos.repository.ProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public ProjectService (ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    public ProjectResponseDto create(ProjectRequestDto projectRequestDto) {
        var projectEntity = this.projectMapper.requestDtoToEntity(projectRequestDto);
        var projectSaved = this.projectRepository.save(projectEntity);

        return this.projectMapper.entityToResponseDto(projectSaved);
    }

    public PageableProjectResponseDto list(Pageable pageable) {
        var projectPage = this.projectRepository.findAll(pageable);

        var projectDtoList = projectPage.stream().map(this.projectMapper::entityToResponseDto).toList();

        return new PageableProjectResponseDto(projectDtoList, projectPage.getNumber(), projectPage.getTotalElements(), projectPage.getTotalPages());
    }
}
