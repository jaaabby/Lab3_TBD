package Models;

public class Habilidad {
    private String nombre;
    private String descripcion;
    private String codigo;

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getCodigo(){
        return codigo;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
