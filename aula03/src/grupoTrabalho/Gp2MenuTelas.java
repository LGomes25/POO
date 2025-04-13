package grupoTrabalho;

import java.util.Scanner;

public class Gp2MenuTelas {

      

    //Método para exibir opções de escolha
    public static void exibirOpcoes(Gp2Fixo fx1, Gp2Fixo fx2){
        
        System.out.println("\n---------- Sistema de Vendas ----------");
        System.out.println("Vendedores:");
        System.out.println("1 - " + fx1.getNome());
        System.out.println("2 - " + fx2.getNome());
        System.out.println("3 - Sair do Programa");
        System.out.println("---------------------------------------");
        System.out.print("Opção escolhida: ");
    }
    //Método para adicionar vendas ao vend 1 + valor total
    public static void calcSalario(Gp2Fixo fx1, Gp2Fixo fx2, int op, Scanner sc){
        
        System.out.println("Digite o valor da venda:");
        double valorVenda = sc.nextDouble();   
        Gp2Vendedor.setTotalVendas(valorVenda);
        switch (op) {
            case 1: fx1.calcularSalario(valorVenda);
                break;
            case 2: fx2.calcularSalario(valorVenda);
                break;
            case 3: System.out.println("");
                break;
            default:System.out.println("Opção Inválida! Tente novamente.");
                break;
        }
    }
    
    //método para apresentar salario dos vendedores
    public static void exibirSalarios(Gp2Fixo fx1, Gp2Fixo fx2){
        System.out.println("------- Salário dos Vendedores --------");
        System.out.println(fx1.menuSalario());
        System.out.println(fx2.menuSalario());
    }

    //Método para exibir total de vendas
    public static void exibirTotalVendas (double totalVendas){
        System.out.println("------------ Total Vendido ------------");
        System.out.println("Total: "+totalVendas);
        System.out.println("---------------------------------------");
    }

}
