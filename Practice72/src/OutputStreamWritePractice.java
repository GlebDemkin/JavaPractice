import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamWritePractice {
    public static void main(String[] args) {
        /*
         * OutputStream - абстрактный класс для байтового вывода.
         * ByteArrayOutputStream - его подкласс, который записывает байты в массив.
         */
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();

        /*
         * Переменная output имеет тип OutputStream.
         * Это позволяет работать с объектом через общий родительский тип.
         */
        try (OutputStream output = byteOutput) {
            /*
             * Метод write(int) записывает один байт.
             * Здесь передаются коды символов строки Java.
             */
            output.write('G');
            output.write('l');
            output.write('e');
            output.write('b');

            /*
             * flush() принудительно отправляет накопленные данные в поток вывода.
             */
            output.flush();
        } catch (IOException e) {
            System.out.println("Ошибка вывода: " + e.getMessage());
        }

        /*
         * Получаем записанные байты и преобразуем их обратно в строку.
         */
        String result = new String(byteOutput.toByteArray(), StandardCharsets.UTF_8);

        System.out.println("Результат записи: " + result);
    }
}