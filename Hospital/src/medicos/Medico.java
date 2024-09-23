package medicos;

public class Medico {
    // Atributos
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private String telefono;
    private String rfc;

    // Constructor
    public Medico(String apellidos, String fechaNacimiento, int id, String nombre, String rfc, String telefono) {
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    // Getters

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public String getTelefono() {
        return telefono;
    }
}



