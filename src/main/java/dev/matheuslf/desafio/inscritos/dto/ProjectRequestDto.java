package dev.matheuslf.desafio.inscritos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ProjectRequestDto(
    @NotBlank String name,
    String description,
    @NotNull LocalDateTime startDate,
    LocalDateTime endDate
) {
}
