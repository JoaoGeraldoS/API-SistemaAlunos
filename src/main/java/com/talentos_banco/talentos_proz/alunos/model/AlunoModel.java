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

    @Column(name = "nome_completo")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "github_link")
    private String github;

    @Column(name = "data_formatura")
    private String dataFormatura;

    @Column(name = "habilidade_1")
    private String habilidade1;

    @Column(name = "habilidade_2")
    private String habilidade2;

    @Column(name = "habilidade_3")
    private String habilidade3;

    @Column(name = "link_image")
    private String imagem;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private CursoModel curso;
}
