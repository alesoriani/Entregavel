package trabalhoJava;

public class ProfessorAdjunto extends Professor{

    public Integer horasMonitoria;


    public Integer getHorasMonitoria() {

        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {

        this.horasMonitoria = horasMonitoria;
    }

    public ProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer tempoCasa, Integer codigo, Integer horasMonitoria) {
        super(nomeProfessor, sobrenomeProfessor, tempoCasa, codigo);
        this.horasMonitoria = horasMonitoria;
    }
}
