package com.talentos_banco.talentos_proz.alunos.controller;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import com.talentos_banco.talentos_proz.alunos.service.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;

    @GetMapping("/aluno")
    public ResponseEntity<List<AlunoDTO>> verAluno() {
        List<AlunoDTO> alunos = alunoService.verAlunos();
        return ResponseEntity.ok(alunos);
    }

    @GetMapping("/aluno/{id}")
    public ResponseEntity<AlunoDTO> verPorId(@PathVariable("id") Long id) {
        AlunoDTO alunoDTO = alunoService.verAlunoId(id);
        return ResponseEntity.ok(alunoDTO);
    }

    @PostMapping("/aluno")
    public ResponseEntity<Map<String, String>> adicionarAluno(@RequestBody @Valid AlunoDTO alunoDTO) {
        alunoService.adicionarAluno(alunoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Aluno adicionado!"));
    }

    @PutMapping("/aluno/{id}")
    public ResponseEntity<Map<String, String>> atualizarAluno(@PathVariable("id") Long id, @RequestBody @Valid AlunoDTO alunoDTO) {
        alunoService.atualizarAluno(id, alunoDTO);
        return ResponseEntity.ok(Map.of("message", "Aluno atualizado"));
    }

    @DeleteMapping("/aluno/{id}")
    public void deletarAluno(@PathVariable("id") Long id) {
        alunoService.deletarAluno(id);
    }

    // FILTROS

 @GetMapping("/aluno/filter")
    public ResponseEntity<AlunoDTO> buscarAluno(
            @RequestParam(value = "nome", required = false) String nome){

        AlunoDTO alunoDTO = alunoService.buscaUnicoAluno(nome);
        return ResponseEntity.ok(alunoDTO);
    }

    @GetMapping("/aluno/filters")
    public ResponseEntity<List<AlunoDTO>> filters(
            @RequestParam(value = "nome", required = false) String nome,
            @RequestParam(value = "formatura", required = false) String formatura) {

        List<AlunoDTO> alunoDTOS = alunoService.filterAluno(nome, formatura);
        return ResponseEntity.ok(alunoDTOS);
    }
}
