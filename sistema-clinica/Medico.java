public class Medico {
    private String nome;
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCrm() {
        return this.crm;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

}
