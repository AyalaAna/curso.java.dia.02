/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkg02;

/**
 *
 * @author laboratorio
 */
public class Carrera {
    private String nombre;
    private Pensum pensum;

    public Carrera() {
    }

    public Carrera(String nombre, Pensum pensum) {
        this.nombre = nombre;
        this.pensum = pensum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pensum getPensum() {
        return pensum;
    }

    public void setPensum(Pensum pensum) {
        this.pensum = pensum;
    }
    
    
    
    
}
