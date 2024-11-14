package modelos;

/**
 *
 * @author crist
 */

import interfaces.Manutencao;

public class Carro extends Veiculo implements Manutencao {
    private final int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano, numeroPortas);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500.0 + (numeroPortas * 200);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção do carro realizada. Checagem de motor, portas e pneus.";
    }
}
