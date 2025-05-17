package com.talentos_banco.talentos_proz.cursos.mapper;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import com.talentos_banco.talentos_proz.alunos.mapper.AlunoMapper;
import com.talentos_banco.talentos_proz.alunos.model.AlunoModel;
import com.talentos_banco.talentos_proz.cursos.dto.CursoDTO;
import com.talentos_banco.talentos_proz.cursos.model.CursoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CursoMapper {

    private final AlunoMapper alunoMapper;

    public CursoDTO toDTO(CursoModel cursoModel){
        CursoDTO cursoDTO = new CursoDTO();

        cursoDTO.setId_curso(cursoModel.getId_curso());
        cursoDTO.setNome(cursoModel.getNome());
        cursoDTO.setCodigo(cursoModel.getCodigo());

        List<AlunoModel> alunoModels = cursoModel.getAlunos();
        if(alunoModels != null) {
            List<AlunoDTO> alunoDTOS = alunoModels.stream().map(alunoMapper::toDTO).collect(Collectors.toList());
            cursoDTO.setAlunos(alunoDTOS);
        }

        return cursoDTO;
    }

    public CursoModel toEntity(CursoDTO cursoDTO){
        CursoModel cursoModel = new CursoModel();

        cursoModel.setNome(cursoDTO.getNome());
        cursoModel.setCodigo(cursoDTO.getCodigo());

        return cursoModel;
    }

    public void updateEntity(CursoModel cursoModel, CursoDTO cursoDTO) {
        cursoModel.setNome(cursoDTO.getNome());
        cursoModel.setCodigo(cursoDTO.getCodigo());
    }
}
