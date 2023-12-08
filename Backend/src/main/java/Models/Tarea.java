package Models;

public class Tarea {
    private String id;
    private String nombre;
    private String descripcion;
    private String region;

    //Getters
    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
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

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setRegion(String region){
        this.region = region;
    }
}
