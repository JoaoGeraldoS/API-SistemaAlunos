package com.talentos_banco.talentos_proz.alunos.dto;

import com.talentos_banco.talentos_proz.validations.TelefoneValidation;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDTO {
private Long idAluno;

    @NotBlank(message = "Nome não pode esta em branco.")
    @Size(min = 2, max = 50, message = "O nome tem que ser entre 2 a 50 caracteres.")
    private String nome;

    @Min(value = 15, message = "A idade deve ser maior que 15 anos.")
    @Max(value = 70, message = "A idade deve ser menor que 70 anos.")
    private int idade;

    @NotBlank(message = "A descrição não pode ser vazia ou nula.")
    @Size(min = 1, max = 255, message = "A descrição tem que ser entre 1 a 255 caracteres.")
    private String descricao;

    @NotBlank(message = "Telefone não pode estar em branco")
    @Size(min = 10, max = 11, message = "Telefone tem que estrar entre 10 a 11 digitos")
    private String telefone;

    @Email(message = "Coloque um email valido.")
    private String email;

    private String github;

    private String habilidade1;

    private String habilidade2;

    private String habilidade3;

    private String imagem;

    @NotBlank(message = "Data não pode estar vazia.")
    @Size(min = 10, message = "A data tem que ter o padrão (dd/mm/yyyy)")
    private String dataFormatura;

    private Long cursoId;

    private String cursoNome;
    
}
