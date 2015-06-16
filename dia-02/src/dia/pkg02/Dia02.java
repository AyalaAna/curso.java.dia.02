package dia.pkg02;

/**
 *
 * @author laboratorio
 */
public class Dia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
         Persona p1= new Persona("Jose",22,'m');
         Estudiante e1= new   Estudiante("2321526312","ing informatica",p1.getNombre(),p1.getEdad(),p1.getSexo());
         Profesor prof1 = new Profesor("Ingenieron Informatico",23,p1.getNombre(),p1.getEdad(),p1.getSexo());
   
    */
         Universidad uni = new Universidad();
        Carrera carr = new  Carrera();
        carr.setNombre("ing informatico");
                uni.getCarreras().add(carr);
        Profesor prof =  new Profesor ("Ingeniero",14,"Rafael",37,'m');
        
        
        for (int i = 0; i < 10; i++) {
            
            Seccion seccion  = new Seccion();
            seccion.setNumeroSeccion(i+1);
            seccion.setProfesorAsignado(prof);
            
            for (int j = 0; j < 10; j++) {
                
                Estudiante e= new Estudiante("235346",carr.g,)
                
            }
            
        }
    
    
    }
    
 }
