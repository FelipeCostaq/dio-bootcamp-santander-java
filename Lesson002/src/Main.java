import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _sc =  new Scanner(System.in);

        System.out.println("Qual a medida do lado do quadrado(cm)?:");
        float _side = _sc.nextFloat();
        float _area = _side * _side;

        System.out.printf("A área de um quadrado com os lados de medida de %scm é %scm2", _side, _area);
    }
}
