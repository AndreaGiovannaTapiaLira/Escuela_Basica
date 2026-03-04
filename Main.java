public class Main {

    public static void main(String[] args) {

        Escuela escuela = new Escuela();

        Alumno a1 = new Alumno("Ana", "A001", 9, 8, 10);
        Alumno a2 = new Alumno("Luis", "A002", 7, 9, 8);

        escuela.agregarAlumno(a1);
        escuela.agregarAlumno(a2);

        System.out.println("\nLista de alumnos:");
        escuela.mostrarAlumnos();

        System.out.println("\nBuscar alumno A001:");
        Alumno encontrado = escuela.buscarAlumno("A001");

        if (encontrado != null) {
            encontrado.mostrarAlumno();
        } else {
            System.out.println("Alumno no encontrado, ingrese otra vez.");
        }
    }
}