import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class FormatterFlushPractice {
    public static void main(String[] args) {
        /*
         * flush() нужен для принудительной отправки накопленных данных
         * из буфера в конечное место вывода.
         *
         * В этом примере данные записываются в файл formatter_output.txt.
         */
        try {
            FileWriter writer = new FileWriter("Practice61/lib/formatter_output.txt");
            Formatter formatter = new Formatter(writer);

            formatter.format("first string%n");
            formatter.format("second string%n");
            formatter.format("number: %d%n", 100);

            /*
             * До flush() данные могут находиться во внутреннем буфере.
             * После flush() они принудительно передаются в FileWriter.
             */
            formatter.flush();

            /*
             * close() закрывает Formatter и связанный с ним FileWriter.
             * Обычно close() тоже выполняет flush(), но flush() можно вызвать отдельно,
             * если поток ещё нужен дальше.
             */
            formatter.close();

            System.out.println("Данные записаны в файл formatter_output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
        }
    }
}