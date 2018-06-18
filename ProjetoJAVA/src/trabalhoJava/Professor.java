package trabalhoJava;

public class Professor {
    public String nomeProfessor;
    public Interger idProfessor;

    public Professor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", idProfessor=" + idProfessor +
                '}';
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Professor professor = (Professor) object;
        return idProfessor == professor.idProfessor;
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), idProfessor);
    }
}
