enum Turno{
    AM, PM;
}
enum DDS{
    SEG, TER, QUA, QUI, SEX, SAB, DOM;
}

public class Duvidas{
    boolean estaTrabalhando(int hora, int minuto, Turno turno, DDS dia){
        if(dia == DDS.SAB && turno == Turno.PM)
            return false;
        if(dia == DDS.DOM)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Duvidas duv = new Duvidas();
        System.out.println(duv.estaTrabalhando(9, 25, Turno.PM, DDS.SEG));
        System.out.println(duv.estaTrabalhando(9, 25, Turno.AM, DDS.SAB));
        System.out.println(duv.estaTrabalhando(9, 25, Turno.PM, DDS.SAB));
    }
}