import java.util.ArrayList;

public class Estudiante {

    public String nombre;
    public int ID;
    public ArrayList<Curso> cursos = new ArrayList<Curso>();

    // Constructor
    public Estudiante(String nombre, int ID, ArrayList<Curso> cursos) {
        this.nombre = nombre;
        this.ID = ID;
        this.cursos = cursos;
    }

    // Metodos
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ID: " + this.ID);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso.getNombreCurso() + ", ");
        }
        System.out.println("\n----------");
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

}
