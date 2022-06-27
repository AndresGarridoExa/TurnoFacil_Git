public class Medico extends Persona {
    String especialidad;
    String obraSocial;
    String dias; //puede ser lista
    String horarios; //puede ser lista

    public Medico(int dni, String nombre, String apellido, String especialidad, String obraSocial, String dias, String horarios) {
    	super.dni= dni;
    	super.nombre=nombre;
    	super.apellido=apellido;
        this.especialidad = especialidad;
        this.obraSocial = obraSocial;
        this.dias = dias;
        this.horarios = horarios;
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

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
