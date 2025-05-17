package com.talentos_banco.talentos_proz.cursos.model;

import com.talentos_banco.talentos_proz.alunos.model.AlunoModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "CURSO")
@Data
public class CursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id_curso;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<AlunoModel> alunos;
}
