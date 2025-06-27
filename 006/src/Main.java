import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int age = sc.nextInt();

        System.out.println("Você é emancipado?: ");
        boolean isEmancipated = sc.nextBoolean();

        if(age >= 18){
            System.out.printf("Olá %s! você tem %s anos, você é maior de idade", name, age);
        }
        else if(age >= 16 && isEmancipated){
            System.out.printf("Olá %s! apesar de você ter %s anos você é emancipado, então responde como adulto", name, age);
        }
        else {
            System.out.printf("Olá %s! você tem %s anos, você é menor de idade", name, age);
        }
    }
}
