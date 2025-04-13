package grupoTrabalho;

public class Gp1TesteContato {

        public static void main(String[] args) {
            
            Gp1Estado estado = new Gp1Estado("Rio de janeiro", "RJ");
            Gp1Cidade cidade = new Gp1Cidade("Petrópolis", estado);
            Gp1Endereco end = new Gp1Endereco("Rua Fonseca Ramos 181", "Centro", "25246-125", cidade);
            
            Gp1Contato contato = new Gp1Contato("Roberta", new Gp1Telefone[2],end);//Acrescentar e iniciar o array Telefone

            Gp1Telefone tel1 = new Gp1Telefone("2234-1250");
            Gp1Telefone tel2 = new Gp1Telefone("2237-1350");

            contato.adicionarTelefone(tel1);
            contato.adicionarTelefone(tel2);

            System.out.println(contato.toString());
            contato.mostrarTelefones();

        }
}
