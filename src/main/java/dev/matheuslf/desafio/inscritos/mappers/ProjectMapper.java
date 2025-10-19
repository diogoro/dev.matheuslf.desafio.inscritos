package dev.matheuslf.desafio.inscritos.mappers;

import dev.matheuslf.desafio.inscritos.dto.ProjectRequestDto;
import dev.matheuslf.desafio.inscritos.dto.ProjectResponseDto;
import dev.matheuslf.desafio.inscritos.entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponseDto entityToResponseDto(Project projectEntity);
    Project requestDtoToEntity(ProjectRequestDto requestDto);
}
