public class Profesor extends Persona {
    private int faltas;

    public Profesor(int edad, String nombre, int faltas) {
        super(edad, nombre);
        this.faltas = faltas;
    }

    public void revisarFaltas() {
        if (faltas >= 3) {
            System.out.println(nombre + " debe justificar sus faltas.");
        }
    }
//La clase Profesor incluye un método único llamado obtenerCategoria(),
// que devuelve una cadena de texto indicando la categoría del profesor
// en función de sus faltas.
    public String obtenerCategoria() {
        if (faltas < 3) {
            return "Profesor regular";
        } else {
            return "Profesor con faltas justificadas";
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Faltas: " + faltas);
        revisarFaltas();
        System.out.println("Categoría: " + obtenerCategoria());
    }
}
