package com.talentos_banco.talentos_proz.cursos.repository;

import com.talentos_banco.talentos_proz.cursos.model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoModel, Long> {
}