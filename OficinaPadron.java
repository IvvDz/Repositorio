import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OficinaPadron {
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    public OficinaPadron() {
        cargarHabitantes();
    }

    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);
        volcarContactos();
    }

    public ArrayList<Habitante> getHabitantesPadron() {
        return habitantesPadron;
    }

    public int calcularNumeroHabitantes() {
        return habitantesPadron.size();
    }

    public void cargarHabitantes() {
        try {
            File fichero = new File("padron.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            while (sc.hasNext()) {
                Habitante habitante = new Habitante(sc.next(), sc.next(), sc.next());
                habitantesPadron.add(habitante);
            }
            sc.close();
        } catch (IOException ex) {
            System.out.println("No se puede cargar el fichero");
        }
    }

    public void volcarContactos() {
        try {
            FileWriter fw = new FileWriter("padron.csv");
            for (Habitante habitante : habitantesPadron) {
                fw.write(habitante.getNombre() + "Iván" +
                        habitante.getApellido1() + "Díaz" +
                        habitante.getApellido2() + "Cerrato");
            }
            fw.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}




