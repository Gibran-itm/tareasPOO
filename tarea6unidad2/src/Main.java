import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Cursos
        Curso matematicas = new Curso(
                "Matematicas",
                "AAA",
                "Julian"
        );

        Curso programacion = new Curso(
                "Programacion",
                "AAB",
                "Eder"
        );

        Curso calculo = new Curso(
                "Calculo",
                "ABA",
                "Alexander"
        );

        // Estudiantes
        ArrayList<Curso> cursosAlumnoUno = new ArrayList<Curso>();
        Estudiante alumnoUno = new Estudiante(
                "Juan Jose",
                1,
                cursosAlumnoUno
        );

        ArrayList<Curso> cursosAlumnoDos = new ArrayList<Curso>();
        Estudiante alumnoDos = new Estudiante(
                "Eduardo Montana",
                2,
                cursosAlumnoDos
        );

        ArrayList<Curso> cursosAlumnoTres = new ArrayList<Curso>();
        Estudiante alumnoTres = new Estudiante(
                "Sebastian Torres",
                3,
                cursosAlumnoTres
        );

        // Asignar cursos
        alumnoUno.agregarCurso(matematicas);
        alumnoUno.agregarCurso(programacion);

        alumnoDos.agregarCurso(calculo);
        alumnoDos.agregarCurso(programacion);

        alumnoTres.agregarCurso(calculo);
        alumnoTres.agregarCurso(matematicas);

        // Mostrar informacion cursos
        matematicas.mostrarInfoCurso();
        programacion.mostrarInfoCurso();
        calculo.mostrarInfoCurso();

        // Mostrar informacion alumnos
        alumnoUno.mostrarInformacion();
        alumnoDos.mostrarInformacion();
        alumnoTres.mostrarInformacion();





    }
}