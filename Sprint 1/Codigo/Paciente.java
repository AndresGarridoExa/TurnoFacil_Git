import java.util.ArrayList;

public class Paciente {
    int DNI;
    String nombre;
    String apellido;
    String direc;
    int Tel;
    String email;
    String obraSocial;
    int nroAfiliado;
    ArrayList<Turno> turnos;

    public Paciente(int DNI, String nombre, String apellido, String direc, int tel, String email, String obraSocial, int nroAfiliado) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direc = direc;
        Tel = tel;
        this.email = email;
        this.obraSocial = obraSocial;
        this.nroAfiliado = nroAfiliado;
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

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getNroAfiliado() {
        return nroAfiliado;
    }

    public void setNroAfiliado(int nroAfiliado) {
        this.nroAfiliado = nroAfiliado;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
