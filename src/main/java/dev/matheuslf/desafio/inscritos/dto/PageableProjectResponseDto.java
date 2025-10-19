package dev.matheuslf.desafio.inscritos.dto;

import java.util.List;

public record PageableProjectResponseDto(
    List<ProjectResponseDto> content,
    int currentPage,
    long totalItems,
    int totalPages
) {
}
