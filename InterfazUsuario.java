import java.util.ArrayList;
public class InterfazUsuario {
    public static void ejecutar(String[] instruccion) {
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1) {
            mostrarOficinaPadron(padron);
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            padron.volcarContactos();
            System.out.println("Habitante añadido correctamente");
        } else {
            System.out.println("Error en la instrucción");
        }
    }

    private static void mostrarOficinaPadron(OficinaPadron padron) {
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for (Habitante habitante : habitantes) {
            System.out.println(habitante.getNombre() + " " +
                    habitante.getApellido1() + " " +
                    habitante.getApellido2());
        }
        System.out.println("El número total de habitantes es " + padron.calcularNumeroHabitantes());
    }

    public static void main(String[] args) {
        ejecutar(new String[]{"mostrar"});//La declaración String[] instruccion en Java define la variable instruccion que es de tipo array de strings.
        ejecutar(new String[]{"añadir", "NuevoNombre", "NuevoApellido1", "NuevoApellido2"});
    }
}


