package grupoTrabalho;

import java.util.Scanner;

public class Gp2TesteVendedor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op =0;
               
        Gp2Fixo fx1 = new Gp2Fixo("Joana", "123456798", 2000., 0.03);
        Gp2Fixo fx2 = new Gp2Fixo("Maria", "987654322", 2000., 0.03);
        //FreeLancer fl1 = new FreeLancer("Jose", "6549517532", 5, 250.);
        //FreeLancer fl2 = new FreeLancer("Joca", "3579514654", 10, 150.);
              
        do{
            Gp2MenuTelas.exibirOpcoes(fx1, fx2);
            op = sc.nextInt();
            System.out.println("---------------------------------------");
            
            if (op != 3){
                Gp2MenuTelas.calcSalario(fx1,fx2,op,sc);
            }
            
        }while(op != 3);
        
        Gp2MenuTelas.exibirSalarios(fx1, fx2);
        Gp2MenuTelas.exibirTotalVendas(Gp2Vendedor.getTotalVendas());

        sc.close();
    }

}
