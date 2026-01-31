package BankSimulator;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        
        var opcao = -1;

        /*Criação da conta, instância do objeto*/
        System.out.println("== Bem-vindo ao Bank Simulator! Para começar vamos criar a sua conta ==");
        System.out.println("Digite o nome do usuário: ");
        var name = scanner.next();
        System.out.println("Digite o valor que deseja depositar: ");
        double balance = scanner.nextDouble();
        Conta conta = new Conta(name, balance);
        System.out.println("\nOlá " + name + "! Sua conta foi criada com sucesso!");
        
        
        do {
            System.out.println("\n==== Bank Simulator ====");
            
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar uso de cheque especial");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 : 
                    conta.checkBalance();
                    break;
                case 2 : 
                    conta.checkOverdraft();
                    break;
                case 3 : 
                    System.out.println("quanto deseja depositar agora?"); 
                    var deposit = scanner.nextDouble();
                    conta.depositMoney(deposit);
                    break;
                case 4 : 
                    System.out.println("quanto deseja sacar agora?"); 
                    var withdraw = scanner.nextDouble();
                    conta.withdrawMoney(withdraw);
                    break;
                case 5 :
                    System.out.println("Digite o valor do boleto a ser pago: ");
                    var payABill = scanner.nextDouble();
                    conta.payABill(payABill);
                    break;
                case 6 : 
                    conta.verifyUsingOverdraft();
                    break;
                case 0 : 
                    System.out.println("Obrigado por usar o Bank Simulator");
                    break;  
                default: 
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }


        } while (opcao != 0);

    }
}