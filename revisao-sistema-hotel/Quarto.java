public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public void ocupar(Hospede hospede) {
        setHospedeAtual(hospede);
        setOcupado(true);
    }

    public void liberar() {
        setHospedeAtual(null);
        setOcupado(false);
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public int getNumero() {
        return this.numero;
    }

    public Hospede getHospedeAtual() {
        return this.hospedeAtual; 
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getPrecoPorNoite() {
        return this.precoPorNoite;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setHospedeAtual(Hospede hospede) {
        this.hospedeAtual = hospede;
    }
    
}