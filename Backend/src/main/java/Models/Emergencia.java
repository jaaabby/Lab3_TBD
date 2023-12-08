package Models;

import java.time.LocalDate;

public class Emergencia {
    private String id;
    private String nombre;
    private String gravedad;
    private LocalDate fecha;
    private String estado;
    private String region;

    //Getters
    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getGravedad(){
        return gravedad;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public String getEstado(){
        return estado;
    }

    public String getRegion(){
        return region;
    }

    //Setters
    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setGravedad(String gravedad){
        this.gravedad = gravedad;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setRegion(String region){
        this.region = region;
    }
}
