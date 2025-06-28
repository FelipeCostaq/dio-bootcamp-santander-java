import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inicial: ");
        int initialNumber = sc.nextInt();
        int tempNumber = 0;

        while(true){
            System.out.print("\nInforme outro valor: ");
            tempNumber = sc.nextInt();

            if(tempNumber > initialNumber){
                if(tempNumber % initialNumber != 0 ){
                    System.out.printf("\n O valor %s divido por %s, tem resto diferente de zero continuando execução...", tempNumber, initialNumber);
                }
                else{
                    System.out.printf("\n O valor %s divido por %s, tem resto igual a zero encerrando execução...", tempNumber, initialNumber);
                    break;
                }
            }
        }
    }
}
