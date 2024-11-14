package modelos;

/**
 *
 * @author crist
 */

import interfaces.Manutencao;

public class Moto extends Veiculo implements Manutencao {
    private final int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano, cilindrada);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300.0 + (cilindrada * 0.1);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção da moto realizada. Checagem de motor e ajustes na suspensão.";
    }
}
