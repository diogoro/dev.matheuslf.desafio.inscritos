package dev.matheuslf.desafio.inscritos.repository;

import dev.matheuslf.desafio.inscritos.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
