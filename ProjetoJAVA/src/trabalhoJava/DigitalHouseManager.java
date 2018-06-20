package trabalhoJava;


import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    public List<Aluno> listaAluno = new ArrayList<>();
    public List<Professor> listaProfessor = new ArrayList<>();
    public List<Curso> listaCurso = new ArrayList<>();
    public List<Matricula> listaMatricula = new ArrayList<>();

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

    public void registrarCurso(String nome, Integer codigo, Integer quantidadeMaximaDeAlunos) {
        Curso novocurso = new Curso(nome, codigo, null, null, quantidadeMaximaDeAlunos, new ArrayList<Aluno>());
        listaCurso.add(novocurso);
    }

    public void excluirCurso(Integer codigo) {
        for (Curso c : listaCurso) {
            if (c.getCodigo() == codigo) {
                listaCurso.remove(c);
            }
        }
    }

    public void registrarProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto registrarProfAdj = new ProfessorAdjunto(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor, quantidadeDeHoras);
        listaProfessor.add(registrarProfAdj);
    }

    public void registrarProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, String especialidade) {
        ProfessorTitular registrarProfTit = new ProfessorTitular(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor);
        listaProfessor.add(registrarProfTit);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        Professor excProfessor = new Professor(null, null, null, codigoProfessor);
        listaProfessor.remove(excProfessor);
    }

    public void registrarAluno(String nomeAluno, String sobrenomeAluno, Integer codigoAluno) {
        Aluno registrarAluno = new Aluno(null, null, ;
        listaAluno.add(registrarAluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Curso cursoSelecionado = null;
        for (Curso curso : listaCurso){
            if(codigoCurso.equals(curso.getCodigo())){
                cursoSelecionado = curso;
                break;
            }
        }
        Aluno alunoSelecionado = null;
        for (Aluno aluno: listaAluno) {
            if(codigoAluno.equals(aluno.getCodigo())){
                alunoSelecionado = aluno;
                break;
            }

        }
        if (cursoSelecionado != null && alunoSelecionado != null) {
            if (cursoSelecionado.adicionarUmAluno(alunoSelecionado)){
                Matricula matricula = new Matricula(alunoSelecionado, cursoSelecionado);
                listaMatricula.add(matricula);
                System.out.println("Matrícula realizada com sucesso.");

            }else{

                System.out.println("Não foi possível realizar a matrícula, pois não há vagas disponíveis.");

            }
        }else{

            System.out.println("Aluno não encontrado.");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso cursoSelecionado = null;
        for (Curso curso: listaCurso) {
            if (curso.getCodigo().equals(codigoCurso)) {
                cursoSelecionado = curso;
                break;
            }
        }

        Professor professorTitularSelecionado = null;
        for (Professor professorTitular : listaProfessor) {
            if (professorTitular.getCodigo().equals(codigoProfessorTitular)) {
                professorTitularSelecionado = professorTitular;
                break;
            }
        }

        Professor professorAdjuntoSelecionado = null;
        for (Professor professorAdjunto: listaProfessor) {
            if (professorAdjunto.getCodigo().equals(codigoProfessorAdjunto)){
                professorAdjuntoSelecionado = professorAdjunto;
                break;
            }
        }

        cursoSelecionado.setProfessorTitular((ProfessorTitular) professorTitularSelecionado);
        cursoSelecionado.setProfessorAdjunto((ProfessorAdjunto) professorAdjuntoSelecionado);
    }

}
