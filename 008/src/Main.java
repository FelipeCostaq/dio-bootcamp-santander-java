import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tabuada você quer?: ");
        int tab = sc.nextInt();


        for(int i = 0; i < 11; i++){
            System.out.printf("%s x %s = %s\n", tab, i, tab*i);
        }

        for(;;){
            System.out.println("Digite um nome: ");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase("exit")) break;
        }
    }
}
