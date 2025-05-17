package com.talentos_banco.talentos_proz.alunos.model;

import com.talentos_banco.talentos_proz.cursos.model.CursoModel;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "ALUNO")
@Data
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "telefone")
    private int telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "github_link")
    private String github;

    @Column(name = "data_formatura")
    private String dataFormatura;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private CursoModel curso;
}
