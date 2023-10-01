
/**
 * Write a description of class Habitante here.
 * 
 * @author (Iván Díaz Cerrato) 
 * @version (19/09/2023)
 */

    public class Habitante
{
 private String nombre;
 private String apellido1;
 private String apellido2;
 
 public Habitante(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
 
public void setNombre(String nombreHabitante){
this.nombre = nombreHabitante;
}

public void setApellido1(String apellido1Habitante){
this.apellido1 = apellido1Habitante;
}

public void setApellido2(String apellido2Habitante){
this.apellido2 = apellido2Habitante;
}
//El código anterior establece los valores de los atributos(setters)
public String getNombre(){
return nombre;
}
public String getApellido1(){
return apellido1;
}
public String getApellido2(){
return apellido2;
}

    public static void main(String[] args) {
        Habitante habitante1 = new Habitante("Iván", "Díaz", "Cerrato");

        habitante1.setNombre("Iván");
        habitante1.setApellido1("Díaz");
        habitante1.setApellido2("Cerrato");
        
        System.out.println("Nombre: " + habitante1.nombre);
        System.out.println("Apellido1: " + habitante1.apellido1);
        System.out.println("Apellido2: " + habitante1.apellido2);
}
}
