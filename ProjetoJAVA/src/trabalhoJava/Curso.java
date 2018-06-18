package trabalhoJava;

import java.util.List;


public class Curso {
    public String nomeCurso;
    private interger idCurso;

    //Parte E - Prof Titular
    public professorAdjunto;
    public professorTitular;
    public Interger maxAlunos;
    public (List<Aluno>) matriculados;


    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", idCurso=" + idCurso +
                '}';
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
