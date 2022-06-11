public class CriterioObraSocial implements Criterio {
        String OS;

    public CriterioObraSocial(String OS) {
        this.OS = OS;
    }

    public boolean cumple(Medico m){
        if (OS == m.obraSocial){
            return true;
        }
        return false;
    }
}
