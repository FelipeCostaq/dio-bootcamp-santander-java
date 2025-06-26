import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner _sc = new Scanner(System.in);

        System.out.print("Nome 1: ");
        String _name1 = _sc.nextLine();
        System.out.print("\nIdade 1: ");
        int _age1 = _sc.nextInt();
        _sc.nextLine();

        System.out.print("\nNome 2: ");
        String _name2 = _sc.nextLine();
        System.out.print("\nIdade 2: ");
        int _age2 = _sc.nextInt();

        System.out.printf("\nO %s tem %s anos, o %s tem %s anos, a diferença de idade deles é de %s anos", _name1, _age1, _name2, _age2, Math.abs(_age1 - _age2));
    }
}
