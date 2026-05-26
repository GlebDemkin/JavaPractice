public class BooleanCreate {
    public static void main(String[] args) {
        /*
         * Класс Boolean является оболочкой для базового типа boolean.
         * Он хранит значение true или false как объект.
         */

        // Создание Boolean через valueOf(boolean).
        Boolean value1 = Boolean.valueOf(true);
        Boolean value2 = Boolean.valueOf(false);

        // Создание Boolean через valueOf(String).
        // Строка "true" даёт true, остальные строки дают false.
        Boolean value3 = Boolean.valueOf("true");
        Boolean value4 = Boolean.valueOf("false");
        Boolean value5 = Boolean.valueOf("My name is Gleb");

        // Создание через автоупаковку.
        // Java автоматически превращает boolean в Boolean.
        Boolean value6 = true;
        Boolean value7 = false;

        // Использование готовых констант класса Boolean.
        Boolean value8 = Boolean.TRUE;
        Boolean value9 = Boolean.FALSE;

        // parseBoolean() возвращает базовый тип boolean,
        // но затем он может быть автоматически упакован в Boolean.
        Boolean value10 = Boolean.parseBoolean("true");

        System.out.println("Boolean.valueOf(true): " + value1);
        System.out.println("Boolean.valueOf(false): " + value2);

        System.out.println("Boolean.valueOf(\"true\"): " + value3);
        System.out.println("Boolean.valueOf(\"false\"): " + value4);
        System.out.println("Boolean.valueOf(\"My name is Gleb\"): " + value5);

        System.out.println("Автоупаковка true: " + value6);
        System.out.println("Автоупаковка false: " + value7);

        System.out.println("Boolean.TRUE: " + value8);
        System.out.println("Boolean.FALSE: " + value9);

        System.out.println("Boolean.parseBoolean(\"true\"): " + value10);
    }
}