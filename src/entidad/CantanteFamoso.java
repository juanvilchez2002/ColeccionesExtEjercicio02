
package entidad;


public class CantanteFamoso {
    
    //atributos
    private String cantante;
    private String disco;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String disco) {
        this.cantante = cantante;
        this.disco = disco;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "cantante=" + cantante + ", disco=" + disco + '}';
    }
    
}
