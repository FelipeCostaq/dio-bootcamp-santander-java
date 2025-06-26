import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        LocalDate _date = LocalDate.now();
        System.out.print("Qual seu nome?: ");
        String _name = _sc.nextLine();
        System.out.printf("\nOlá %s! Qual seu ano de nascimento?: ", _name);
        int _yearBorn = _sc.nextInt();
        int _age = _date.getYear() - _yearBorn;

        System.out.printf("\n%s, estamos no ano de %s, se você nasceu em %s então você tem %s anos.", _name, _date.getYear(), _yearBorn, _age);
    }
}
