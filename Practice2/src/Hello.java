import java.nio.charset.Charset;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, Charset.forName("CP866"));

        System.out.print("Введите ваше имя: ");

        String name = scanner.nextLine();

        System.out.print("Привет, " + name + "!");

        scanner.close();
    }
}
