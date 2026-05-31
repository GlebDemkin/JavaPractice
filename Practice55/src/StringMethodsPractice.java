import java.util.Arrays;

public class StringMethodsPractice {
    public static void main(String[] args) {
        /*
         * Класс String хранит строку.
         * Объекты String неизменяемые: методы не изменяют исходную строку,
         * а возвращают новую строку или другое значение.
         */
        String text = "  Gleb программирует на Java  ";

        System.out.println("Исходная строка: [" + text + "]");

        /*
         * length() возвращает количество символов в строке.
         */
        System.out.println("1. length(): " + text.length());

        /*
         * trim() удаляет пробелы в начале и в конце строки.
         */
        String trimmedText = text.trim();
        System.out.println("2. trim(): [" + trimmedText + "]");

        /*
         * toUpperCase() возвращает строку в верхнем регистре.
         */
        System.out.println("3. toUpperCase(): " + trimmedText.toUpperCase());

        /*
         * toLowerCase() возвращает строку в нижнем регистре.
         */
        System.out.println("4. toLowerCase(): " + trimmedText.toLowerCase());

        /*
         * charAt(index) возвращает символ по индексу.
         * Индексация начинается с 0.
         */
        System.out.println("5. charAt(0): " + trimmedText.charAt(0));

        /*
         * substring(begin, end) возвращает часть строки.
         * begin включается, end не включается.
         */
        System.out.println("6. substring(0, 4): " + trimmedText.substring(0, 4));

        /*
         * contains() проверяет, содержит ли строка указанную подстроку.
         */
        System.out.println("7. contains(\"Gleb\"): " + trimmedText.contains("Gleb"));

        /*
         * indexOf() возвращает индекс первого вхождения подстроки.
         * Если подстрока не найдена, возвращается -1.
         */
        System.out.println("8. indexOf(\"программирует\"): " + trimmedText.indexOf("программирует"));

        /*
         * replace() заменяет одну часть строки на другую.
         */
        System.out.println("9. replace(\"Java\", \"C++\"): " + trimmedText.replace("Java", "C++"));

        /*
         * split() разбивает строку на массив строк по указанному разделителю.
         */
        String[] words = trimmedText.split(" ");
        System.out.println("10. split(\" \"): " + Arrays.toString(words));

        /*
         * equals() сравнивает содержимое строк.
         */
        String anotherText = "Gleb программирует на Java";
        System.out.println("Дополнительно equals(): " + trimmedText.equals(anotherText));
    }
}