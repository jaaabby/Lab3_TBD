package Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "voluntarios")
public class Voluntario {
    @Id
    private String id;
    private String rut;
    private String nombres;
    private String apellidos;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
    private String disponibilidad;
    private String telefono;
    private String rol;
    private String contrasena;
    private String region;
    private List<Habilidad> habilidades;

    //Getters
    public String getId(){
        return id;
    }

    public String getRut(){
        return rut;
    }

    public String getNombres(){
        return nombres;
    }

    public String getApellidos(){
        return apellidos;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getDisponibilidad(){
        return disponibilidad;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getRol(){
        return rol;
    }

    public String getContrasena(){
        return contrasena;
    }

    public String getRegion(){
        return region;
    }

    public List<Habilidad> getHabilidades(){
        return habilidades;
    }

    //Setters
    public void setId(String id){
        this.id = id;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public void setHabilidades(List<Habilidad> habilidades){
        this.habilidades = habilidades;
    }
}
