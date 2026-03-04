public class Escuela{

    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;
    private int contador;

    public Escuela() {
        contador = 0;
    }

    public void agregarAlumno(Alumno alumno) {
        if (contador == 0) {
            alumno1 = alumno;
        } else if (contador == 1) {
            alumno2 = alumno;
        } else if (contador == 2) {
            alumno3 = alumno;
        } else if (contador == 3) {
            alumno4 = alumno;
        } else if (contador == 4) {
            alumno5 = alumno;
        } else {
            System.out.println("No hay espacio para más alumnos.");
            return;
        }
        contador++;
        System.out.println("Alumno agregado correctamente.");
    }

    public Alumno buscarAlumno(String matricula) {

        if (alumno1 != null && alumno1.getMatricula().equals(matricula))
            return alumno1;

        if (alumno2 != null && alumno2.getMatricula().equals(matricula))
            return alumno2;

        if (alumno3 != null && alumno3.getMatricula().equals(matricula))
            return alumno3;

        if (alumno4 != null && alumno4.getMatricula().equals(matricula))
            return alumno4;

        if (alumno5 != null && alumno5.getMatricula().equals(matricula))
            return alumno5;

        return null;
    }

    public void mostrarAlumnos() {

        if (contador == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        if (alumno1 != null) alumno1.mostrarAlumno();
        if (alumno2 != null) alumno2.mostrarAlumno();
        if (alumno3 != null) alumno3.mostrarAlumno();
        if (alumno4 != null) alumno4.mostrarAlumno();
        if (alumno5 != null) alumno5.mostrarAlumno();
    }
}