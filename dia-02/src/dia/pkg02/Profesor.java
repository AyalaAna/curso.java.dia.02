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
public class Profesor extends Persona {

    private String profesion;
    private int anosExperiencia;

    public Profesor(String profesion, int anosExperiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
    }

    public Profesor(String profesion, int anosExperiencia) {
        super();
        this.profesion = profesion;
        this.anosExperiencia = anosExperiencia;
    }

    public Profesor() {

        super();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Profesion : " + profesion + "  Anos de Experiencia:" + anosExperiencia +;
    }

    
}
