# Documentação

***
Em andamento...

## Documentação de Estrutura de Dados – Alunos e Cursos

Este projeto fornece uma estrutura de banco de dados que pode ser consumida por aplicações front-end para exibição e manipulação de informações relacionadas a alunos e cursos.

### Recursos Disponíveis

Abaixo estão os principais dados disponíveis para consumo. 

### Tabela Curso

~~~
{
  "id_curso": 1,
  "nome": "Desenvolvimento Web",
  "codigo": "DW2025"
}
~~~ 
#### Campos: 

| Campo     | Tipo    | Descrição                |
| --------- | ------- | ------------------------ |
| id\_curso | Inteiro | ID único do curso        |
| nome      | Texto   | Nome completo do curso   |
| codigo    | Texto   | Código resumido do curso |


### Tabela Aluno

~~~
{
  "id_aluno": 101,
  "nome": "Lucas",
  "sobrenome": "Silva",
  "idade": 22,
  "descricao": "Desenvolvedor focado em back-end e APIs REST.",
  "telefone": 11987654321,
  "email": "lucas.silva@email.com",
  "github_link": "https://github.com/lucas-silva",
  "data_formatura": "12/2025",
  "id_curso": 1,
}
~~~

#### Campos: 

| Campo            | Tipo    | Descrição                                       |
| ---------------- | ------- | ----------------------------------------------- |
| id\_aluno        | Inteiro | ID único do aluno                               |
| nome             | Texto   | Primeiro nome do aluno                          |
| sobrenome        | Texto   | Sobrenome do aluno                              |
| idade            | Inteiro | Idade                                           |
| descricao        | Texto   | Breve resumo ou biografia do aluno              |
| telefone         | Inteiro | Número de telefone (somente dígitos)            |
| email            | Texto   | E-mail para contato                             |
| github\_link     | Texto   | Link para o GitHub do aluno                     |
| data\_formatura  | Texto   | Data prevista para formatura (ex: "12/2025")    |
| id\_curso        | Inteiro | ID do curso ao qual está vinculado              |


### Relacionamento entre as Tabelas  

* Cada aluno está vinculado a um curso através do campo id_curso.
* Um curso pode ter vários alunos.