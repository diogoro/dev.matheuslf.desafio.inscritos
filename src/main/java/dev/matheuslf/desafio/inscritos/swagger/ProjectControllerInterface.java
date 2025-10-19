package dev.matheuslf.desafio.inscritos.swagger;

import dev.matheuslf.desafio.inscritos.dto.PageableProjectResponseDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectRequestDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ProjectControllerInterface {

    @Operation(description= "Cria um projeto")
    ResponseEntity<ProjectResponseDto> create(ProjectRequestDto requestDto);
    @Operation(description = "Listar projetos")
    ResponseEntity<PageableProjectResponseDto> list(Pageable pageable);
}
