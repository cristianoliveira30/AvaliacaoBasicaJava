/**
 *
 * @author crist
 */
package com.mycompany.veiculo;

import modelos.Veiculo;
import modelos.Carro;
import modelos.Moto;
import interfaces.Manutencao;
import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorVeiculos {

    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] dadosVeiculo = new String[3];

        System.out.println("O seu veículo é um carro ou moto?");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.print("Seu tipo de veiculo: ");

        int tipoVeiculo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira a placa nesse modelo ABC1234:");
        dadosVeiculo[0] = scanner.nextLine();

        System.out.println("Insira o ao nesse modelo '2024':");
        dadosVeiculo[1] = scanner.nextLine();
        
        switch (tipoVeiculo) {
            case 1 -> {
                System.out.println("Insira a quantidade de portas:");
                dadosVeiculo[2] = scanner.nextLine();
                Carro carro = new Carro(
                        dadosVeiculo[0],
                        Integer.parseInt(dadosVeiculo[1]),
                        Integer.parseInt(dadosVeiculo[2])
                );  frota.add(carro);
            }
            case 2 -> {
                System.out.println("Insira a cilindrada:");
                dadosVeiculo[2] = scanner.nextLine();
                Moto moto = new Moto(
                        dadosVeiculo[0],
                        Integer.parseInt(dadosVeiculo[1]),
                        Integer.parseInt(dadosVeiculo[2])
                );  frota.add(moto);
            }
            default -> System.out.println("Tipo de veículo inválido!");
        }

        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do Seguro: R$" + veiculo.calcularValorSeguro());

            if (veiculo instanceof Manutencao manutencao) {
                System.out.println(manutencao.realizarManutencao());
            }
            System.out.println("--------------");
        }
    }
}
