import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int tab = sc.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.printf("%s x %s = %s\n", tab, i, tab*i);
        }
    }
}
