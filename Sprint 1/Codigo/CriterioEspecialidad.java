public class CriterioEspecialidad implements Criterio{
    private String esp;

    public CriterioEspecialidad(String esp) {
        this.esp = esp;
    }

    public boolean cumple(Medico m){
        if (esp == m.especialidad){
            return true;
        }
        return false;
    }
}
