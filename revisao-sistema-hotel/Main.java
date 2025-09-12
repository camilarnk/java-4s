public class Main {
    public static void main(String[] args) {

        Hotel meuHotel = new Hotel("Grand Hotel Maringá", "Avenida Brasil",
            502, "Deluxe", 300.00);

        meuHotel.adicionarQuarto(101, "Standard", 200.00);
        meuHotel.adicionarQuarto(202, "Standard", 200.00);
        meuHotel.adicionarQuarto(504, "Deluxe", 300.00);
        meuHotel.adicionarQuarto(701, "Suíte", 450.00);

        Hospede hospede1 = new Hospede("Mariah", "312.321.313-00");
        Hospede hospede2 = new Hospede("Rebeca", "321.221.221-00");

        meuHotel.exibirRelatorioOcupado();

        meuHotel.hospedar(hospede1, 202);
        meuHotel.hospedar(hospede2, 202);
        meuHotel.hospedar(hospede2, 504);

        meuHotel.exibirRelatorioOcupado();

        meuHotel.realizarCheckout(202);

        meuHotel.exibirRelatorioOcupado();

    }
}