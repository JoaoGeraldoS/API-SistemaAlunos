package com.talentos_banco.talentos_proz.alunos.mapper;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import com.talentos_banco.talentos_proz.alunos.model.AlunoModel;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public AlunoDTO toDTO(AlunoModel alunoModel) {
        AlunoDTO alunoDTO = new AlunoDTO();

        alunoDTO.setId(alunoModel.getId());
        alunoDTO.setNome(alunoModel.getNome());
        alunoDTO.setSobrenome(alunoModel.getSobrenome());
        alunoDTO.setIdade(alunoModel.getIdade());
        alunoDTO.setDescricao(alunoModel.getDescricao());
        alunoDTO.setTelefone(alunoModel.getTelefone());
        alunoDTO.setEmail(alunoModel.getEmail());
        alunoDTO.setGithub(alunoModel.getGithub());
        alunoDTO.setDataFormatura(alunoModel.getDataFormatura());

        if(alunoModel.getCurso() != null) {
            alunoDTO.setCursoId(alunoModel.getCurso().getId_curso());
        }

        return alunoDTO;
    }

    public AlunoModel toEntity(AlunoDTO alunoDTO) {
        AlunoModel alunoModel = new AlunoModel();

        alunoModel.setNome(alunoDTO.getNome());
        alunoModel.setSobrenome(alunoDTO.getSobrenome());
        alunoModel.setIdade(alunoDTO.getIdade());
        alunoModel.setDescricao(alunoDTO.getDescricao());
        alunoModel.setTelefone(alunoDTO.getTelefone());
        alunoModel.setEmail(alunoDTO.getEmail());
        alunoModel.setGithub(alunoDTO.getGithub());
        alunoModel.setDataFormatura(alunoDTO.getDataFormatura());

        return alunoModel;
    }

    public void updateEntity(AlunoModel alunoModel, AlunoDTO alunoDTO) {

        alunoModel.setNome(alunoDTO.getNome());
        alunoModel.setSobrenome(alunoDTO.getSobrenome());
        alunoModel.setIdade(alunoDTO.getIdade());
        alunoModel.setDescricao(alunoDTO.getDescricao());
        alunoModel.setTelefone(alunoDTO.getTelefone());
        alunoModel.setEmail(alunoDTO.getEmail());
        alunoModel.setGithub(alunoDTO.getGithub());
        alunoModel.setDataFormatura(alunoDTO.getDataFormatura());
    }
}
