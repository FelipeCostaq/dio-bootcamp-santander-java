import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String option = "";

        System.out.println("Digite o número inicial: ");
        num1 = sc.nextInt();
        while(true){
            System.out.println("Digite o último número (deve ser maior que o primeiro): ");
            num2 = sc.nextInt();
            if(num2 > num1) break;
        }

        while(true) {
            System.out.println("Quer contar os pares, impares ou todos números?: ");
            option = sc.next();
            if(option.equalsIgnoreCase("TODOS")){
                for(num1 = num1; num1 < num2 + 1; num1++){
                    System.out.println(num1);
                }
                break;
            }
            if(option.equalsIgnoreCase("PARES")){
                for(num1 = num1; num1 < num2 + 1; num1++){
                    if(num1 % 2 == 0){
                        System.out.println(num1);
                    }
                }
                break;
            }
            if(option.equalsIgnoreCase("IMPARES")){
                for(num1 = num1; num1 < num2 + 1; num1++){
                    if(num1 % 2 != 0){
                        System.out.println(num1);
                    }
                }
                break;
            }
        }
    }
}
