package com.talentos_banco.talentos_proz.cursos.service;

import java.util.List;
import java.util.stream.Collectors;

import com.talentos_banco.talentos_proz.cursos.dto.CursoDTO;
import com.talentos_banco.talentos_proz.errors.NaoEncontrado;
import org.springframework.stereotype.Service;

import com.talentos_banco.talentos_proz.cursos.repository.CursoRepository;
import com.talentos_banco.talentos_proz.cursos.mapper.CursoMapper;
import com.talentos_banco.talentos_proz.cursos.model.CursoModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {
    private final CursoMapper cursoMapper;
    private final CursoRepository cursoRepository;

    private CursoModel verificaCurso(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new NaoEncontrado("Curso não encontrado"));
    }
    
    public List<CursoDTO> verCursos(){
        List<CursoModel> cursoModel = cursoRepository.findAll();
        
        return cursoModel.stream().map(cursoMapper::toDTO).collect(Collectors.toList());
    }

    public CursoDTO verCursoId(Long id) {
        CursoModel cursoModel = verificaCurso(id);
        return cursoMapper.toDTO(cursoModel);
    }

    public void adicionarCurso(CursoDTO cursoDTO) {
        CursoModel cursoModel = cursoMapper.toEntity(cursoDTO);
        cursoRepository.save(cursoModel);
    }

    public void atualizarCurso(Long id, CursoDTO cursoDTO) {
        CursoModel cursoModel = verificaCurso(id);
        cursoMapper.updateEntity(cursoModel, cursoDTO);
        cursoRepository.save(cursoModel);
    }

    public void deletarAluno(Long id) {
        CursoModel cursoModel = verificaCurso(id);
        cursoRepository.delete(cursoModel);
    }
}
