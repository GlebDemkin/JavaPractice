import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerFilePractice {
    public static void main(String[] args) {
        /*
         * Path хранит путь к текстовому файлу.
         * В этом примере файл input.txt должен лежать рядом с программой
         * или в рабочей папке, из которой запускается Java.
         */
        Path filePath = Path.of("Practice75", "lib", "input.txt");

        /*
         * Scanner может читать данные не только из консоли,
         * но и из файла.
         *
         * try-with-resources автоматически закрывает Scanner
         * после завершения работы с файлом.
         */
        try (Scanner scanner = new Scanner(filePath)) {
            /*
             * next() читает одно слово до пробела.
             * nextInt() читает целое число.
             */
            String name = scanner.next();
            int age = scanner.nextInt();
            String language = scanner.next();

            System.out.println("Данные из файла:");
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age);
            System.out.println("Язык программирования: " + language);
        } catch (IOException e) {
            /*
             * IOException может возникнуть, если файл не найден
             * или его невозможно прочитать.
             */
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}