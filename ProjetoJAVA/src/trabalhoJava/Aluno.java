package trabalhoJava;

public class Aluno {
    public String nomeAluno;
    public String sobrenomeAluno;
    public Integer idAluno;

    public Aluno(Integer idA, String nomeA, String sobrenomeA) {
        this.nomeAluno = nomeA;
        this.sobrenomeAluno= sobrenomeA;
        this.idAluno = idA;
    }

    public Aluno juntaNome(String nomeAluno, String sobrenomeAluno) {
        return nomeAluno + sobrenomeAluno + idAluno;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", sobrenomeAluno='" + sobrenomeAluno + '\'' +
                ", idAluno=" + idAluno +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Aluno aluno = (Aluno) object;
        return idAluno == aluno.idAluno;
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), idAluno);
    }
}
