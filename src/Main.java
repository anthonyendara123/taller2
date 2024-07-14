public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.3, 9.0};
        Alumno alumno = new Alumno(20, "Juan Pérez", notas);
        alumno.mostrarInformacion();

        Profesor profesor = new Profesor(45, "María Gómez", 3);
        profesor.mostrarInformacion();
    }
}