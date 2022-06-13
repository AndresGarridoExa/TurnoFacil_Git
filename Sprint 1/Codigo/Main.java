import java.util.ArrayList;
public class Main {
    public static void main( String[] args) {
        Paciente p = new Paciente(40568956,"Marcelo", "Diaz", "San Martin 123", 12345678, "a", "IOMA", 14589);
        Medico m1 = new Medico(20456897, "Luis", "Alvarez", "Guardia","IOMA", "Lunes", "17");
        Medico m2 = new Medico(32458795, "Juan", "Lopez", "Cardiologo","OSDE", "Viernes", "16");
        Medico m3 = new Medico(32458795, "Daniela", "Morales", "Ginecologo","Osprera", "Lunes", "18");
        Medico m4 = new Medico(32458795, "Pablo", "Diaz", "Dentista","Medife", "Mastes", "16");
        Medico m5 = new Medico(32458795, "Victoria", "Gonzalez", "Pediatra,","IOMA", "Jueves", "13");
        Medico m6 = new Medico(32458795, "Lucia", "Lopez", "Guardia","OSDE", "Miercoles", "12");
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
