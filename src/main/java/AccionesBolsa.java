

public class AccionesBolsa {

    private String nombre;
    private String simbolo;
    private double numeroDeAcciones;
    private double ultimoPrecio;



    AccionesBolsa(String nombre, String simbolo, double numeroDeAcciones, double ultimoPrecio) {

        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numeroDeAcciones = numeroDeAcciones;
        this.ultimoPrecio = ultimoPrecio;


    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getNumeroDeAcciones() {
        return numeroDeAcciones;
    }
    public void setNumeroDeAcciones(Double numeroDeAcciones) {
        this.numeroDeAcciones = numeroDeAcciones;
    }

    public Double getUltimoPrecio() {
        return ultimoPrecio;
    }
    public void setUltimoPrecio(Double ultimoPrecio) {
        this.ultimoPrecio = ultimoPrecio;
    }



}
