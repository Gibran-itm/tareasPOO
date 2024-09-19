package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

public class Consulta {

    public int id;
    public String fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    // Constructor
    public Consulta(Consultorio consultorio, String fechaHora, int id, Medico medico, Paciente paciente) {
        this.consultorio = consultorio;
        this.fechaHora = fechaHora;
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
    }

    // Getters

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public int getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
