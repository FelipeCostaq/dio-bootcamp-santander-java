import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura(cm): ");
        float height = sc.nextFloat() / 100;
        System.out.println("Digite seu peso(kg): ");
        float weight = sc.nextFloat();

        float imc = weight / (height * height);

        if(imc <= 18.5){
            System.out.printf("\nSeu imc é %.2f. Você esta abaixo do peso", imc);
        }
        else if(imc >= 18.6 && imc <= 24.9){
            System.out.printf("\nSeu imc é %.2f. Você com peso ideal", imc);
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.printf("\nSeu imc é %.2f. Você esta levemente acima do peso", imc);
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.printf("\nSeu imc é %.2f. Você com obesidade grau 1", imc);
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.printf("\nSeu imc é %.2f. Você com obesidade grau 2 (severa)", imc);
        }
        else if(imc >= 40){
            System.out.printf("\nSeu imc é %.2f. Você esta com obesidade grau 3 (mórbida)", imc);
        }
    }
}
