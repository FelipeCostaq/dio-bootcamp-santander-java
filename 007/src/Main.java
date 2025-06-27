import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }

        var message = switch (option){
            case 1, 7 -> {
                String day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
        };

        System.out.println(message);
    }
}
