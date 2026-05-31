import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class InputStreamReadPractice {
    public static void main(String[] args) {
        /*
         * InputStream - абстрактный класс для байтового ввода.
         * ByteArrayInputStream - его подкласс, который читает байты из массива.
         */
        byte[] data = "Gleb".getBytes(StandardCharsets.UTF_8);

        /*
         * Переменная имеет тип InputStream, но объект создан как ByteArrayInputStream.
         * Это показывает работу через общий родительский тип.
         */
        try (InputStream input = new ByteArrayInputStream(data)) {
            int value;

            /*
             * Метод read() читает один байт и возвращает его как int.
             * Если данные закончились, read() возвращает -1.
             */
            while ((value = input.read()) != -1) {
                System.out.println("Код байта: " + value + ", символ: " + (char) value);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}