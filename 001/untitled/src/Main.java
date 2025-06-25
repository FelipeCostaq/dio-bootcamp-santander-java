import java.util.Scanner;

public class Main {

    private final static String ASK_MESSAGE = "Qual";

    public static void main(String[] args)
    {
        Scanner _scanner = new Scanner(System.in);

        System.out.printf("%s seu nome?:", ASK_MESSAGE);
        String _name = _scanner.nextLine();

        System.out.printf("%s sua idade?:", ASK_MESSAGE);
        int _age = _scanner.nextInt();

        if(_age >= 18){
            System.out.printf("Olá, %s! Você é maior de idade pois tem %s anos", _name, _age);
        }
        else{
            System.out.printf("Olá, %s! Você é menor de idade pois tem %s anos", _name, _age);
        }

    }
}
