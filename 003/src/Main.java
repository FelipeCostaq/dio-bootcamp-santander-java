import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Operator Attribute
        Scanner _sc = new Scanner(System.in);

        Random _rand = new Random();

        int _num1 = _rand.nextInt(5, 10);
        int _num2 = _rand.nextInt(5, 10);

        int _result = _num1 + _num2;

        System.out.printf("Quanto é %s + %s?: ", _num1, _num2);
        int _userResult = _sc.nextInt();

        // Operator Comparator
        System.out.printf("O resultado é %s, Você acertou?: %s \n", _result, _userResult == _result);

        System.out.println("Quantos anos você tem?: ");
        int _age = _sc.nextInt();

        System.out.println("Você é emancipado?: ");
        boolean _isEmancipated = _sc.nextBoolean();

        boolean _canDrive = _age >= 18 || (_isEmancipated && _age >= 16);

        System.out.printf("Você pode dirigir?: %s", _canDrive);
    }
}
