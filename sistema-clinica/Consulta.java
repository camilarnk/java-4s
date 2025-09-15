public class Consulta {
    private String data;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Medico medico, Paciente paciente, String data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public String getData() {
        return this.data;
    }


}
