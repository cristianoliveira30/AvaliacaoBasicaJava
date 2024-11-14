package modelos;

/**
 *
 * @author crist
 */
public abstract class Veiculo {

    private String placa;
    private int ano;
    private int portasOuCilindrada;

    public Veiculo(String placa, int ano, int portasOuCilindrada) {
        this.placa = placa;
        this.ano = ano;
        this.portasOuCilindrada = portasOuCilindrada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}
