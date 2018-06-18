package trabalhoJava;

public class professorTitular extends Professor {
    public String especialidade;

    public professorTitular(String nomeProfessor) {
        super(nomeProfessor);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "professorTitular{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
