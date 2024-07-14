public class Alumno extends Persona {
    private double[] notas;

    public Alumno(int edad, String nombre, double[] notas) {
        super(edad, nombre);
        this.notas = notas;
    }

    public double obtenerPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public boolean esAprobado() {
        return obtenerPromedio() >= 7;
    }
//La clase Alumno incluye un método único
// llamado obtenerNivel(), que devuelve una cadena
// de texto con el nivel del alumno según su promedio.
    public String obtenerNivel() {
        double promedio = obtenerPromedio();
        if (promedio >= 9) {
            return "Excelente";
        } else if (promedio >= 7) {
            return "Bueno";
        } else {
            return "Necesita mejorar";
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Promedio: " + obtenerPromedio() + ", Aprobado: " + esAprobado());
        System.out.println("Nivel: " + obtenerNivel());
    }
}
