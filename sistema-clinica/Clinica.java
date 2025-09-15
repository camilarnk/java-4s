import java.util.ArrayList;

public class Clinica {
    private String nome;
    private String endereco;
    private ArrayList<Consulta> consultas;

    public Clinica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.consultas = new ArrayList<>();
    }

    public void agendarConsulta(Medico medico, Paciente paciente, String data) {
        this.consultas.add(new Consulta(medico, paciente, data));
        System.out.printf("Consulta agendada para %s no dia %s com Dr. %s\n",
        paciente.getNome(), data, medico.getNome());
    }

    public void cancelarConsulta(Paciente paciente, String data) {
        boolean removido = this.consultas.removeIf(consulta ->
            consulta.getPaciente().equals(paciente) &&
            consulta.getData().equals(data)
        );

        if(removido) {
            System.out.printf("A consulta de %s no dia %s foi cancelada\n", paciente.getNome(), data);
        }else {
            System.out.println("Nenhuma consulta com essas informações foi encontrada");
        }
    }

    public void listarConsultas() {
        System.out.println();
        System.out.printf("-------- Consultas da Clínica %s - %s --------\n", getNome(), getEndereco());
        for (Consulta consulta : consultas) {
            System.out.printf("%s - Paciente %s na especialidade %s com Dr. %s\n",
            consulta.getData(), consulta.getPaciente().getNome(), consulta.getMedico().getEspecialidade(),
            consulta.getMedico().getNome());
        }
        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
 
}
