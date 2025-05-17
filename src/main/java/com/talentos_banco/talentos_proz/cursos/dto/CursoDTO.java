package com.talentos_banco.talentos_proz.cursos.dto;

import com.talentos_banco.talentos_proz.alunos.dto.AlunoDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CursoDTO {
    private Long id_curso;

    @NotBlank(message = "Nome não pode esta em branco.")
    @Size(min = 2, max = 20, message = "O nome tem que ser entre 2 a 20 caracteres.")
    private String nome;

    @NotBlank(message = "Nome não pode esta em branco.")
    private String codigo;

    private List<AlunoDTO> alunos;
}
