package trabalhoJava;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        digitalHouseManager.registrarProfessorAdjunto("Alexandre", "Tadeu",000011,30 );
        digitalHouseManager.registrarProfessorAdjunto("João","Monteiro", 000012, 50);
        digitalHouseManager.registrarProfessorTitular("Renata","Silva",000013, "Programação Mobile Android");
        digitalHouseManager.registrarProfessorTitular("Ana","Morais",000014,"Desenvolvimento Full Stack");
        digitalHouseManager.registrarCurso("FullStack",20001,3);
        digitalHouseManager.registrarCurso("Mobile Android", 20002, 2);
        digitalHouseManager.alocarProfessores(20001,000013,000012);
        digitalHouseManager.alocarProfessores(20002,000014,000011);
        digitalHouseManager.registrarAluno("Silas", "Mattos", 000020);
        digitalHouseManager.registrarAluno("Castro", "Leite",000021);
        digitalHouseManager.registrarAluno("Mario","Castro", 000022);
        digitalHouseManager.matricularAluno(000020, 20001);
        digitalHouseManager.matricularAluno(000021, 20001);
        digitalHouseManager.matricularAluno(000022,20001);
        digitalHouseManager.matricularAluno(000020,20002);
        digitalHouseManager.matricularAluno(000022,20002);
        digitalHouseManager.matricularAluno(000021,20002);

    }

}
