import java.util.ArrayList;
public class Medico extends Persona {
    String especialidad;
   

    public Medico(String dni, String nombre, String apellido, String especialidad, String obraSocial) {
    	super.dni= dni;
    	super.nombre=nombre;
    	super.apellido=apellido;
        this.especialidad = especialidad;
        this.obraSocial = obraSocial;
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

    public ArrayList<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(ArrayList<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}

