public class Medico {
    int DNI;
    String nombre;
    String apellido;
    String especialidad;
    String obraSocial;
    String dias; //puede ser lista
    String horarios; //puede ser lista

    public Medico(int DNI, String nombre, String apellido, String especialidad, String obraSocial, String dias, String horarios) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
