package com.talentos_banco.talentos_proz.alunos.mapper;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import com.talentos_banco.talentos_proz.alunos.model.AlunoModel;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public AlunoDTO toDTO(AlunoModel alunoModel) {
        AlunoDTO alunoDTO = new AlunoDTO();

        alunoDTO.setIdAluno(alunoModel.getIdAluno());
        alunoDTO.setNome(alunoModel.getNome());
        alunoDTO.setIdade(alunoModel.getIdade());
        alunoDTO.setDescricao(alunoModel.getDescricao());
        alunoDTO.setTelefone(alunoModel.getTelefone());
        alunoDTO.setEmail(alunoModel.getEmail());
        alunoDTO.setGithub(alunoModel.getGithub());
        alunoDTO.setDataFormatura(alunoModel.getDataFormatura());
        alunoDTO.setHabilidade1(alunoModel.getHabilidade1());
        alunoDTO.setHabilidade2(alunoModel.getHabilidade2());
        alunoDTO.setHabilidade3(alunoModel.getHabilidade3());
        alunoDTO.setImagem(alunoModel.getImagem());

        if(alunoModel.getCurso() != null) {
            alunoDTO.setCursoId(alunoModel.getCurso().getId_curso());
            alunoDTO.setCursoNome(alunoModel.getCurso().getNome());
        }

        return alunoDTO;
    }

    public AlunoModel toEntity(AlunoDTO alunoDTO) {
        AlunoModel alunoModel = new AlunoModel();

        alunoModel.setNome(alunoDTO.getNome());
        alunoModel.setIdade(alunoDTO.getIdade());
        alunoModel.setDescricao(alunoDTO.getDescricao());
        alunoModel.setTelefone(alunoDTO.getTelefone());
        alunoModel.setEmail(alunoDTO.getEmail());
        alunoModel.setGithub(alunoDTO.getGithub());
        alunoModel.setDataFormatura(alunoDTO.getDataFormatura());
        alunoModel.setHabilidade1(alunoDTO.getHabilidade1());
        alunoModel.setHabilidade2(alunoDTO.getHabilidade2());
        alunoModel.setHabilidade3(alunoDTO.getHabilidade3());
        alunoModel.setImagem(alunoDTO.getImagem());

        return alunoModel;
    }

    public void updateEntity(AlunoModel alunoModel, AlunoDTO alunoDTO) {

        alunoModel.setNome(alunoDTO.getNome());
        alunoModel.setIdade(alunoDTO.getIdade());
        alunoModel.setDescricao(alunoDTO.getDescricao());
        alunoModel.setTelefone(alunoDTO.getTelefone());
        alunoModel.setEmail(alunoDTO.getEmail());
        alunoModel.setGithub(alunoDTO.getGithub());
        alunoModel.setDataFormatura(alunoDTO.getDataFormatura());
        alunoModel.setHabilidade1(alunoDTO.getHabilidade1());
        alunoModel.setHabilidade2(alunoDTO.getHabilidade2());
        alunoModel.setHabilidade3(alunoDTO.getHabilidade3());
        alunoModel.setImagem(alunoDTO.getImagem());
    }
}
