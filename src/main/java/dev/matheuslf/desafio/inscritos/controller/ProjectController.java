package dev.matheuslf.desafio.inscritos.controller;

import dev.matheuslf.desafio.inscritos.Routes;
import dev.matheuslf.desafio.inscritos.dto.ProjectRequestDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectResponseDto;
import dev.matheuslf.desafio.inscritos.service.ProjectService;
import dev.matheuslf.desafio.inscritos.swagger.ProjectControllerInterface;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.Project.PATH)
public class ProjectController implements ProjectControllerInterface {

    private final ProjectService projectService;

    public ProjectController (ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<ProjectResponseDto> create(@RequestBody @Valid ProjectRequestDto requestDto) {
        var projectCreated = this.projectService.create(requestDto);
        return ResponseEntity.ok(projectCreated);
    }
}
