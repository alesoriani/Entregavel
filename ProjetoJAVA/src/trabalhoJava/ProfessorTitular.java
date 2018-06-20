package trabalhoJava;

public class ProfessorTitular extends Professor {

    public String especialidade;

    public ProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer tempoCasa, Integer codigo) {
        super(nomeProfessor, sobrenomeProfessor, tempoCasa, codigo);
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }



}
