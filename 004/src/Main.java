import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        float _value1 = _sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        float _value2 = _sc.nextFloat();

        System.out.printf("A soma do valor %s e do valor %s é %s\n", _value1, _value2, _value1 + _value2);
        System.out.printf("A subtração do valor %s e do valor %s é %s\n", _value1, _value2, _value1 - _value2);
        System.out.printf("A divisão do valor %s e do valor %s é %s\n", _value1, _value2, _value1 / _value2);
        System.out.printf("A multiplicação do valor %s e do valor %s é %s\n", _value1, _value2, _value1 * _value2);
        System.out.printf("O resto da divisão do valor %s e do valor %s é %s\n", _value1, _value2, _value1 % _value2);

        // Concatenate
        System.out.println("Tente com " + "valores diferentes!");
    }
}
