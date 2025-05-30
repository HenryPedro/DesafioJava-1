import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        String nomeCliente = " ";
        String tipoConta = "Corrente";
        double saldoConta = 1900;
        int opcao = 0; // interage com o menu dentro do while

        double pix = (saldoConta - opcao);

        System.out.println("\n*************************************");
        System.out.println("\nDados iniciais do cliente");
        System.out.println(" Nome do cliente: " + nomeCliente );
        System.out.println(" Tipo de conta: " + tipoConta);
        System.out.println(" Saldo Inicial: R$" +saldoConta);
        System.out.println("\n*************************************");

        String menu = """
                \n ** Digite sua opção **
              
                1 - Consultar saldo
                2 - Pix
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
        if(opcao == 1){
            System.out.println("Saldo atual: " + saldoConta);
            opcao = leitura.nextInt();

        } else if(opcao == 2){
            System.out.println("Digite o valor a ser enviado: ");
            double valorDigitado = leitura.nextDouble();

            if(valorDigitado > saldoConta){
                System.out.println("Saldo em conta insuficiente!");
            } else {
                saldoConta -= valorDigitado;
                System.out.println("Novo Saldo" + saldoConta);
            }
        } else if (opcao == 3){
            System.out.println("Digite o valor a receber: ");
            double valoraReceber = leitura.nextDouble();

            saldoConta += valoraReceber;
            System.out.println("Novo Saldo \n" + saldoConta);

            } else if (opcao != 4){
            System.out.println("A opção digitada é invalida! ");
            }
        }
    }
}
