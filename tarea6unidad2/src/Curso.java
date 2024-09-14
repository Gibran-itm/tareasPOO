public class Curso {

    public String nombreCurso;
    public String codigoCurso;
    public String nombreInstructorCurso;

    // Constructor
    public Curso(String nombreCurso, String codigoCurso, String nombreInstructorCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.nombreInstructorCurso = nombreInstructorCurso;
    }

    // Metodos
    public void mostrarInfoCurso() {
        System.out.println("Nombre del curso: " + this.nombreCurso);
        System.out.println("Codigo del curso: " + this.codigoCurso);
        System.out.println("Nombre del instructor: " + this.nombreInstructorCurso);
        System.out.println("//////////");
    }

    public String getCodigoCurdo() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getNombreInstructorCurso() {
        return nombreInstructorCurso;
    }

    public void setNombreInstructorCurso(String nombreInstructorCurso) {
        this.nombreInstructorCurso = nombreInstructorCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCodigoCurdo(String codigoCurdo) {
        this.codigoCurso = codigoCurdo;
    }
} // Fin curso
