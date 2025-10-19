package dev.matheuslf.desafio.inscritos.dto;

import java.time.LocalDateTime;

public record ProjectResponseDto(
    Long id,
    String name,
    String description,
    LocalDateTime startDate,
    LocalDateTime endDate
) {
}
