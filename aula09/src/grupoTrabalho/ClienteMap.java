package grupoTrabalho;

import java.util.HashMap;
import java.util.Map;

public class ClienteMap {

	public static void main(String[] args) {

		 String[][] clientes = {
		            { "123", "Marcos", "m@gmail.com" },
		            { "143", "Carla", "c@gmail.com" },
		            { "125", "Amarildo", "a@gmail.com" }
		        };

        // Criar mapa
        Map<String, String> mapaClientes = new HashMap<>();

        // Inserir os dados da matriz no mapa
        for (String[] cliente : clientes) {
            String chave = cliente[0]; // A chave será o ID (primeiro elemento)
            String valor = "Nome: " + cliente[1] + " Email: " + cliente[2]; // Valor formatado
            mapaClientes.put(chave, valor);
        }

        // Percorrer o mapa e imprimir as chaves e valores
        for (Map.Entry<String, String> entrada : mapaClientes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " -> " + entrada.getValue());
        }

		
		
	}

}
