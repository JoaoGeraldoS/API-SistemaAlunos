package com.talentos_banco.talentos_proz.cursos.controller;

import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.talentos_banco.talentos_proz.cursos.dto.CursoDTO;
import com.talentos_banco.talentos_proz.cursos.service.CursoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CursoController {
    private final CursoService cursoService;

    @GetMapping("/curso")
    public ResponseEntity<List<CursoDTO>> verCursos(){
        List<CursoDTO> curso = cursoService.verCursos();
        return ResponseEntity.ok(curso);
    }

    @GetMapping("/curso/{id}")
    public ResponseEntity<CursoDTO> verPorId(@PathVariable("id") Long id) {
        CursoDTO cursoDTO = cursoService.verCursoId(id);
        return ResponseEntity.ok(cursoDTO);
    }

    @PostMapping("/curso")
    public ResponseEntity<Map<String, String>> adicionarCurso(@RequestBody @Valid CursoDTO cursoDTO) {
        cursoService.adicionarCurso(cursoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Curso adicionado!"));
    }

    @PutMapping("/curso/{id}")
    public ResponseEntity<Map<String, String>> atualizarCurso(@PathVariable("id") Long id, @RequestBody @Valid CursoDTO cursoDTO) {
        cursoService.atualizarCurso(id, cursoDTO);
        return ResponseEntity.ok(Map.of("message", "Curso atualizado"));
    }

    @DeleteMapping("/curso/{id}")
    public void deletarCurso(@PathVariable("id") Long id) {
        cursoService.deletarAluno(id);
    }
}