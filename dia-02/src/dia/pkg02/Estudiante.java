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
public class Estudiante extends Persona {

    private String FichaAcademica;
    private String carrera;

    public Estudiante(String FichaAcademica, String carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.FichaAcademica = FichaAcademica;
        this.carrera = carrera;
    }

    public Estudiante(String FichaAcademica, String carrera) {
        super();
        this.FichaAcademica = FichaAcademica;
        this.carrera = carrera;
    }

    public Estudiante() {
       super();  
    }
      
    public String getFichaAcademica() {
        return FichaAcademica;
    }

    public void setFichaAcademica(String FichaAcademica) {
        this.FichaAcademica = FichaAcademica;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() 
                +"Ficha Academica : " + FichaAcademica + "  Carrera :" + carrera +; 
    }

   
    
}
