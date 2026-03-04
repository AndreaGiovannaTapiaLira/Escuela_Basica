public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void setCalificacion1(double valor) {
        this.calificacion1 = valor;
    }

    public void setCalificacion2(double valor) {
        this.calificacion2 = valor;
    }

    public void setCalificacion3(double valor) {
        this.calificacion3 = valor;
    }

    public double calcularPromedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public void mostrarAlumno() {
        System.out.println("\n=== Datos del Alumno ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificaciones: " + calificacion1 + ", " + calificacion2 + ", " + calificacion3);
        System.out.println("Promedio: " + String.format("%.2f", calcularPromedio()));
    }
}