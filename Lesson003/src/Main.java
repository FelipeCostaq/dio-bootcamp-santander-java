import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _sc = new Scanner(System.in);
        System.out.println("Quanto é a altura do triângulo(cm)?: ");
        float _height = _sc.nextFloat();
        System.out.println("Quanto é a base do triângulo(cm)?:");
        float _base = _sc.nextFloat();

        float _area = _height * _base;

        System.out.printf("Um triângulo com altura %scm e base %scm tem %scm2 de área", _height, _base, _area);
    }
}
