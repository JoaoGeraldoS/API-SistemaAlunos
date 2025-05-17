package com.talentos_banco.talentos_proz.alunos.dto;

import com.talentos_banco.talentos_proz.validations.TelefoneValidation;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDTO {

    private Long id;

    @NotBlank(message = "Nome não pode esta em branco.")
    @Size(min = 2, max = 20, message = "O nome tem que ser entre 2 a 20 caracteres.")
    private String nome;

    @NotBlank(message = "Sobrenome não pode esta em branco.")
    @Size(min = 2, max = 20, message = "O sobrenome tem que ser entre 2 a 20 caracteres.")
    private String sobrenome;


    @Min(value = 15, message = "A idade deve ser maior que 15 anos.")
    @Max(value = 70, message = "A idade deve ser menor que 70 anos.")
    private int idade;

    @NotBlank(message = "A descrição não pode ser vazia ou nula.")
    @Size(min = 1, max = 255, message = "A descrição tem que ser entre 1 a 255 caracteres.")
    private String descricao;


    @TelefoneValidation
    private int telefone;

    @Email(message = "Coloque um email valido.")
    private String email;

    private String github;

    @NotBlank(message = "Data não pode estar vazia.")
    @Size(min = 10, message = "A data tem que ter o padrão (dd/mm/yyyy)")
    private String dataFormatura;

    private Long cursoId;
}
