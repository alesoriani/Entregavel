package trabalhoJava;

public class Professor {

    public String nomeProfessor;
    public String sobrenomeProfessor;
    public Integer tempoCasa;
    public Integer codigo;

    public Professor(String nomeProfessor, String sobrenomeProfessor, Integer tempoCasa, Integer codigo) {
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.tempoCasa = tempoCasa;
        this.codigo = codigo;
    }

    public String getNome() {
        return nomeProfessor;
    }

    public void setNome(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenome() {
        return sobrenomeProfessor;
    }

    public void setSobrenome(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
        Professor other = (Professor) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }


}

