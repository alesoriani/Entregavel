package trabalhoJava;

public class Aluno {
    public String nomeAluno;
    public String sobrenomeAluno;
    public Integer idAluno;

    public Aluno(Integer idAluno, String nomeAluno, String sobrenomeAluno) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nomeAluno) {

        this.nomeAluno = nomeAluno;
    }

    public String getSobrenomeAluno() {

        return sobrenomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno) {

        this.sobrenomeAluno = sobrenomeAluno;
    }

    public Integer getIdAluno() {

        return idAluno;
    }

    public void setidA(Integer idAluno) {

        this.idAluno = idAluno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (idAluno == null) {
            if (other.idAluno != null)
                return false;
        } else if (!idAluno.equals(other.idAluno))
            return false;
        return true;
    }

}
