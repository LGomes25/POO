package org.serratec.exemplos;

import java.util.HashMap;
import java.util.Map;

public class EstadoMap {

	public static void main(String[] args) {

        // Criando um mapa para armazenar siglas e nomes de estados
        Map<String, String> estados = new HashMap<>();

        // Inserindo as siglas e os nomes dos estados no mapa
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AM", "Amazonas");
        estados.put("AP", "Amapá");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("DF", "Distrito Federal");
        estados.put("ES", "Espírito Santo");
       

        for (String sigla : estados.keySet()) {
            System.out.println(sigla);
        }
        for (String nome : estados.values()) {
        	System.out.println(nome);
        }
        for (Map.Entry<String,String> dados: estados.entrySet()) {
        	System.out.println(dados);
        }
        
        
        
        
    }
}
