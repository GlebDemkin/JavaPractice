import java.util.Formatter;

public class FormatterSpecifiersPractice {
    public static void main(String[] args) {
        /*
         * Formatter используется для форматированного вывода данных.
         * Метод format() принимает строку-шаблон и значения,
         * которые подставляются вместо спецификаторов.
         */
        Formatter formatter = new Formatter(System.out);

        boolean isJavaHard = false;
        char grade = 'A';
        int age = 19;
        double height = 1.83;
        String name = "Gleb";

        /*
         * %s - строковое представление аргумента.
         */
        formatter.format("Имя: %s%n", name);

        /*
         * %d - десятичное целое число.
         */
        formatter.format("Возраст: %d%n", age);

        /*
         * %f - число с плавающей точкой.
         * .2 означает, что после точки будет выведено 2 знака.
         */
        formatter.format("Рост: %.2f%n", height);

        /*
         * %c - символ.
         */
        formatter.format("Оценка: %c%n", grade);

        /*
         * %b - логическое значение true или false.
         */
        formatter.format("Java сложная: %b%n", isJavaHard);

        /*
         * %% - выводит символ процента.
         */
        formatter.format("Выполнение задания: %d%%%n", 100);
        
        /*
         * close() закрывает Formatter, связанный с ним FileWriter и выполняет flush().
         */
        formatter.close();
    }
}