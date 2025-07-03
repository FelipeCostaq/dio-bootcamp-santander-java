import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Qual seu nome: ");
        String name = sc.nextLine();
        System.out.println("Saldo inicial: ");
        float initialBalance = sc.nextFloat();

        AccountBank accountBank = new AccountBank(name, initialBalance);

        while (true) {
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar se a conta esta usando cheque esperial");
            System.out.println("Escolha uma opcao: ");
            String opcao = sc.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Seu saldo é de R$" + accountBank.getBalance());
                Thread.sleep(1000);
            }else if(opcao.equals("2")) {
                System.out.println("Seu cheque especial é de R$" + accountBank.getEspecialCheck());
                Thread.sleep(1000);
            }else if(opcao.equals("3")) {
                System.out.println("Quanto você quer depositar?: ");
                float amount = sc.nextFloat();
                System.out.println("Seu saldo agora é R$" + accountBank.deposit(amount));
                Thread.sleep(1000);
            }else if(opcao.equals("4")) {
                System.out.println("Quanto você quer sacar?: ");
                float amount = sc.nextFloat();
                System.out.println("Seu saldo agora é R$" + accountBank.withdraw(amount));
                Thread.sleep(1000);
            }else if(opcao.equals("5")) {
                while (true){
                    System.out.println("Você tem um boleto no valor de R$" + accountBank.getBoletoCheck());
                    System.out.println("Você quer pagar [S/N]?: ");
                    String opt = sc.nextLine();
                    if(opt.equalsIgnoreCase("S")){
                        if(accountBank.getBalance() >= accountBank.getBoletoCheck()){
                            accountBank.payBoleto(accountBank.getBoletoCheck());
                            System.out.println("Boleto pago! Seu saldo agora é R$" + accountBank.getBalance());
                            Thread.sleep(1000);
                            break;
                        }
                        else{
                            System.out.println("Saldo Insuficiente");
                            Thread.sleep(1000);
                            break;
                        }
                    }else{
                        System.out.println("Voltando pro menu");
                        Thread.sleep(1000);
                        break;
                    }
                }
            }else if(opcao.equals("6")) {

            }else{
                System.out.println("Opcão inválida");
            }
        }
    }
}
