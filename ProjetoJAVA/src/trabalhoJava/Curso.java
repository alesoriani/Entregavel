package trabalhoJava;

//import trabalhoJava.Aluno;
//import trabalhoJava.ProfessorAdjunto;
//import trabalhoJava.ProfessorTitular;
//import java.util.ArrayList;

import java.util.List;

public class Curso {

    public String curso;
    public Integer codigo;
    public ProfessorTitular professorTitular;
    public ProfessorAdjunto professorAdjunto;
    public Integer qtdeMaxAlunos;
    public List<Aluno> listaAlunos;

    public Curso(String curso, Integer codigo, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdeMaxAlunos, List<Aluno> listaAlunos) {
        this.curso = curso;
        this.codigo = codigo;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
        this.listaAlunos = listaAlunos;
    }

    public List<Aluno> getListaAlunos() {

        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {

        this.listaAlunos = listaAlunos;
    }

    public Integer getQtdeMaxAlunos() {

        return qtdeMaxAlunos;
    }

    public void setQtdeMaxAlunos(Integer qtdeMaxAlunos) {

        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public ProfessorTitular getProfessorTitular() {

        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {

        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {

        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {

        this.professorAdjunto = professorAdjunto;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public Integer getCodigo() {

        return codigo;
    }

    public void setCodigo(Integer codigo) {

        this.codigo = codigo;
    }


    public Boolean adicionarUmAluno(Aluno umAluno) {
        Integer qtdDeAlunosNoCurso = this.getListaAlunos().size();
        if(qtdDeAlunosNoCurso < qtdeMaxAlunos) {
            this.getListaAlunos().add(umAluno);
            return true;
        }else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        this.getListaAlunos().remove(umAluno);
    }

}
