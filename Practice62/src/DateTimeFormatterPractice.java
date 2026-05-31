import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Locale;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {
        /*
         * Для форматирования даты и времени в Formatter
         * используются спецификаторы, начинающиеся с %t.
         */
        LocalDateTime dateTime = LocalDateTime.of(2026, 5, 31, 14, 25, 40, 123000000);

        /*
         * Locale задаёт язык вывода названий месяцев и дней недели.
         */
        Formatter formatter = new Formatter(System.out, new Locale("ru", "RU"));

        /*
         * %tH - час в формате 00-23.
         */
        formatter.format("Час 00-23: %tH%n", dateTime);

        /*
         * %tM - минуты в формате 00-59.
         */
        formatter.format("Минуты: %tM%n", dateTime);

        /*
         * %tS - секунды в формате 00-59.
         */
        formatter.format("Секунды: %tS%n", dateTime);

        /*
         * %tY - год в четырёхзначном формате.
         */
        formatter.format("Год: %tY%n", dateTime);

        /*
         * %tm - месяц в числовом формате.
         */
        formatter.format("Месяц числом: %tm%n", dateTime);

        /*
         * %tB - полное название месяца.
         */
        formatter.format("Месяц словом: %tB%n", dateTime);

        /*
         * %tA - полное название дня недели.
         */
        formatter.format("День недели: %tA%n", dateTime);

        formatter.flush();
        formatter.close();
    }
}