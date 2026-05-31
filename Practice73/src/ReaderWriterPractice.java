import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

public class ReaderWriterPractice {
    public static void main(String[] args) {
        /*
         * InputStream и OutputStream работают с байтами.
         * Reader и Writer работают с символами.
         *
         * Для текстовых данных Reader и Writer удобнее,
         * потому что текст состоит из символов, а не просто из байтов.
         */
        String text = "Привет";

        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);

        System.out.println("Строка: " + text);
        System.out.println("Количество символов: " + text.length());
        System.out.println("Количество байтов в UTF-8: " + bytes.length);

        System.out.println();

        /*
         * StringReader читает строку как последовательность символов.
         * Метод read() возвращает код одного символа.
         */
        try (StringReader reader = new StringReader(text)) {
            int charCode;

            System.out.println("Чтение через Reader:");

            while ((charCode = reader.read()) != -1) {
                System.out.println("Код символа: " + charCode + ", символ: " + (char) charCode);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println();

        /*
         * StringWriter записывает текст как символы.
         * Это удобно для формирования строкового результата.
         */
        try (StringWriter writer = new StringWriter()) {
            writer.write("Java");
            writer.write(" ");
            writer.write("Reader");
            writer.write(" ");
            writer.write("Writer");

            System.out.println("Запись через Writer:");
            System.out.println(writer.toString());
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}