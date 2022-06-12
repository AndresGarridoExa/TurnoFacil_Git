import java.util.ArrayList;

public class Paciente extends Persona {
    String direc;
    int tel;
    String email;
    String obraSocial;
    int nroAfiliado;
    ArrayList<Turno> turnos;

    public Paciente(int dni, String nombre, String apellido, String direc, int tel, String email, String obraSocial, int nroAfiliado) {
    	super.dni= dni;
    	super.nombre=nombre;
    	super.apellido=apellido;
        this.direc = direc;
        this.tel = tel;
        this.email = email;
        this.obraSocial = obraSocial;
        this.nroAfiliado = nroAfiliado;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
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
