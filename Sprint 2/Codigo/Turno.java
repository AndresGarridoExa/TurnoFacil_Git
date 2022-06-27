import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Turno {
    ArrayList<Medico> listaM;
    Date fecha;
    double hora;
    boolean Valido;

    public Turno(ArrayList<Medico> listaM, Date fecha, double hora, boolean valido) {
        this.listaM = listaM;
        this.fecha = fecha;
        this.hora = hora;
        Valido = valido;
    }
    public ArrayList<Medico> getListaM() {
        return listaM;
    }

    public void setListaM(ArrayList<Medico> listaM) {
        this.listaM = listaM;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public boolean isValido() {
        return Valido;
    }

    public void setValido(boolean valido) {
        Valido = valido;
    }

    public ArrayList<Medico> verMedicos(Criterio c){
        ArrayList<Medico> mDisponibles = new ArrayList<Medico>();
        for (int i = 0; i < listaM.size();i++){
            if (c.cumple(listaM.get(i))){
                mDisponibles.add(listaM.get(i));
            }
        }
        return mDisponibles;
    }
    public void sacarTurno(Paciente p,Criterio c){
        System.out.println("Elija un medico: ");
        for (int i = 0; i < verMedicos(c).size(); i++){
            System.out.println(i+1 + ") " + verMedicos(c).get(i).nombre + ", " + verMedicos(c).get(i).especialidad + ", " + verMedicos(c).get(i).obraSocial);
        }
        try (Scanner in = new Scanner (System.in)) {
			int s = in.nextInt();
			Medico m = (verMedicos(c).get(s-1));
			System.out.println("Dias que atiende: "+ m.dias + ", horarios disponibles: "+ m.horarios);
			try (Scanner in2 = new Scanner (System.in)) {
				System.out.println("¿Desea confirmar el turno? s/n");
				String s1 = in2.nextLine();
				if (!s1.equals("n")){
				    imprimirTurno(m);
				}else{
				    System.out.println("Turno no confirmado");
				}
			}
		}
    }
    public void imprimirTurno(Medico m){
        System.out.println(m.dias +" "+ m.horarios +" dni del medico: " +m.dni);
    }
}
