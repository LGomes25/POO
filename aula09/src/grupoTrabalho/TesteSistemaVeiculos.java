package grupoTrabalho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteSistemaVeiculos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Map<String, Veiculo> mapaVeiculos = new HashMap<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Buscar Veículo pela Placa");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Cadastrar veículo
                    System.out.println("\n=== Cadastro de Veículo ===");
                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    // Adiciona o veículo no mapa
                    Veiculo veiculo = new Veiculo(marca, modelo, ano);
                    mapaVeiculos.put(placa, veiculo);

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2: // Buscar veículo pela placa
                    System.out.println("\n=== Buscar Veículo ===");
                    System.out.print("Digite a placa: ");
                    String placaBusca = scanner.nextLine();

                    // Verifica se a placa existe no mapa
                    if (mapaVeiculos.containsKey(placaBusca)) {
                        Veiculo veiculoEncontrado = mapaVeiculos.get(placaBusca);
                        System.out.println("Veículo encontrado: " + veiculoEncontrado);
                    } else {
                        System.out.println("Nenhum veículo encontrado com esta placa.");
                    }
                    break;

                case 3: // Sair
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
	}

}
