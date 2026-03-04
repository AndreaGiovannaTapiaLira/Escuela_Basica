public class Alumno {

    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Alumno(String nombre, String matricula,
                  double c1, double c2, double c3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion1 = c1;
        this.calificacion2 = c2;
        this.calificacion3 = c3;
    }

    public String getMatricula() {
        return matricula;
    }

    public double calcularPromedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public void mostrarAlumno() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Calificación 1: " + calificacion1);
        System.out.println("Calificación 2: " + calificacion2);
        System.out.println("Calificación 3: " + calificacion3);
        System.out.println("Promedio: " + calcularPromedio());
    }
}
