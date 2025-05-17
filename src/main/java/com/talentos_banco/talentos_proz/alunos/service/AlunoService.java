package com.talentos_banco.talentos_proz.alunos.service;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import com.talentos_banco.talentos_proz.alunos.mapper.AlunoMapper;
import com.talentos_banco.talentos_proz.alunos.model.AlunoModel;
import com.talentos_banco.talentos_proz.alunos.repository.AlunoRepository;
import com.talentos_banco.talentos_proz.cursos.model.CursoModel;
import com.talentos_banco.talentos_proz.cursos.repository.CursoRepository;
import com.talentos_banco.talentos_proz.errors.NaoEncontrado;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoMapper alunoMapper;
    private final AlunoRepository alunoRepository;
    private final CursoRepository cursoRepository;


    private AlunoModel verificaAluno(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new NaoEncontrado("Aluno não encontrado"));
    }

    private CursoModel verificaCurso(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new NaoEncontrado("Curso não encontrado"));
    }

    public List<AlunoDTO> verAlunos() {
        List<AlunoModel> alunoModel = alunoRepository.findAll();
        return alunoModel.stream().map(alunoMapper::toDTO).collect(Collectors.toList());
    }

    public void adicionarAluno(AlunoDTO alunoDTO) {
        AlunoModel alunoModel = alunoMapper.toEntity(alunoDTO);
        CursoModel cursoModel = verificaCurso(alunoDTO.getCursoId());
        alunoModel.setCurso(cursoModel);
        alunoRepository.save(alunoModel);
    }

    public AlunoDTO verAlunoId(Long id) {
        AlunoModel alunoModel = verificaAluno(id);
        return  alunoMapper.toDTO(alunoModel);
    }

    public void atualizarAluno(Long id, AlunoDTO alunoDTO) {
        AlunoModel alunoModel = verificaAluno(id);

        CursoModel cursoModel = verificaCurso(alunoDTO.getCursoId());
        alunoModel.setCurso(cursoModel);

        alunoMapper.updateEntity(alunoModel, alunoDTO);
        alunoRepository.save(alunoModel);
    }

    public void deletarAluno(Long id) {
        AlunoModel alunoModel = verificaAluno(id);
        alunoRepository.delete(alunoModel);
    }

    // FILTROS


    public List<AlunoDTO> filterAluno(String nome, String dataFormatura, String email) {
        List<AlunoModel> alunoModels = alunoRepository.findAll();

        return alunoModels.stream()
                .filter(a -> nome == null || a.getNome().equalsIgnoreCase(nome))
                .filter(a -> dataFormatura == null || a.getDataFormatura().equals(dataFormatura))
                .filter(a -> email == null || a.getEmail().equalsIgnoreCase(email))
                .map(alunoMapper::toDTO).collect(Collectors.toList());
    }
}
