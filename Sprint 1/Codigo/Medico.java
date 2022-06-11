{
    int DNI;
    String nombre;
    String Apellido;
    String especialidad;
    String obraSocial;
    String dias;
    String horarios;

    public Medico(int DNI, String nombre, String apellido, String especialidad, String obraSocial, String dias, String horarios) {
        this.DNI = DNI;
        this.nombre = nombre;
        Apellido = apellido;
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
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
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
