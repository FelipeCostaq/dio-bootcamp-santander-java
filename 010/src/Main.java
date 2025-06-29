import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        new Throwable(); //pai de exceptions e erros
        new Exception(); //exeções
        new Error(); //erros
        new RuntimeException(); //unchecked
        new FileNotFoundException(); //checked
    }
}
