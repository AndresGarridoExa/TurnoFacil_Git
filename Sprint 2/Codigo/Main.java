import java.util.ArrayList;
public class Main {
    public static void main( String[] args) {
        Paciente p = new Paciente(123,"pepito", "a", "a", 123, "a", "IOMA", 123);
        /*
        Medico m1 = new Medico(111, "luis", "a", "Guardia1","IOMA", "Lunes", "5");
        Medico m2 = new Medico(112, "juan", "a", "Guardia1","IOMA", "Lunes", "5");*/
        String tur1 = "Lunes 18hs";
        String tur2 = "Martes 15hs";
        String tur3 = "Jueves 12hs";
        String tur4 = "Lunes 14hs";
        String tur5 = "Viernes 15hs";
        ArrayList<String> turno1 = new ArrayList<>();
        turno1.add(tur1); turno1.add(tur3);
        ArrayList<String> turno2 = new ArrayList<>();
        turno2.add(tur4); turno2.add(tur2); turno2.add(tur5);
        Medico m1 = new Medico(111, "luis", "a", "Guardia1","IOMA", turno1);
        Medico m2 = new Medico(112, "juan", "a", "Guardia1","IOMA", turno2);
        ArrayList<Medico> lista = new ArrayList<Medico>();
        lista.add(m1);
        lista.add(m2);
        Turno t = new Turno(lista,null,0, true);
        CriterioEspecialidad c1 = new CriterioEspecialidad("Guardia1");
        Criterio c2 = new CriterioObraSocial("IOMA");
        Criterio c = new CriterioAND(c1,c2);
        t.sacarTurno(p,c);
    }
}
