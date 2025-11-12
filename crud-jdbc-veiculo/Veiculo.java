public abstract class Veiculo {

    private int id;
    private String modelo;
    private double precoBase;

    public Veiculo(String modelo, double precoBase) {
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();

    public abstract String getTipo();

    public double calcularImposto() {
        return 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
