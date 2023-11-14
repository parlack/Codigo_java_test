// Definición de la clase Estudiante
public class Estudiante {
    // Atributos
    String nombre;
    int edad;
    double calificacion;

    // Método constructor
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Calificación: " + calificacion);
    }

    // Método para actualizar la calificación del estudiante
    public void actualizarCalificacion(double nuevaCalificacion) {
        calificacion = nuevaCalificacion;
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Creación de un objeto Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, 85.5);
        Estudiante estudiante2 = new Estudiante("pedro", 10, 89.5);
        // Mostrar información del estudiante
        System.out.println("\nInformación del Estudiante:");
        estudiante1.mostrarInformacion();
        System.out.println("\nInformación del Estudiante:");
        estudiante2.mostrarInformacion();

        // Actualizar la calificación del estudiante
        estudiante1.actualizarCalificacion(90.0);

        // Mostrar información actualizada
        System.out.println("\nInformación Actualizada del Estudiante:");
        estudiante1.mostrarInformacion();
    }
}

