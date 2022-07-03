import java.util.ArrayList;

public class Persona {
  String dni;
  String nombre;
  String apellido;
  String obraSocial;
  ArrayList<Turno> listaTurnos;
  
public Persona() {}

public Persona(String dni, String nombre, String apellido) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
}

  public String getDni() {
      return dni;
  }

  public void setDni(String dni) {
          this.dni = dni;
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
}

