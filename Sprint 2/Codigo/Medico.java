import java.util.ArrayList;
public class Medico extends Persona {
    String especialidad;
    String obraSocial;
    ArrayList<String> listaTurnos;

    public Medico(int dni, String nombre, String apellido, String especialidad, String obraSocial, ArrayList<String> listaTurnos) {
    	super.dni= dni;
    	super.nombre=nombre;
    	super.apellido=apellido;
        this.especialidad = especialidad;
        this.obraSocial = obraSocial;
        this.listaTurnos = listaTurnos;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<String> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(ArrayList<String> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}
