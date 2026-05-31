interface FirstPrinter {
    /*
     * Первый интерфейс содержит default-метод print().
     */
    default void print() {
        System.out.println("Метод print() из FirstPrinter");
    }
}

interface SecondPrinter {
    /*
     * Второй интерфейс содержит default-метод с таким же названием
     * и таким же списком параметров.
     */
    default void print() {
        System.out.println("Метод print() из SecondPrinter");
    }
}

/*
 * Если класс реализует два интерфейса с одинаковыми default-методами,
 * Java не сможет сама выбрать нужную реализацию.
 *
 * Такой класс не скомпилируется:
 *
 * class BadPrinter implements FirstPrinter, SecondPrinter {
 * }
 */

class GoodPrinter implements FirstPrinter, SecondPrinter {
    /*
     * Чтобы решить конфликт, класс обязан переопределить метод print().
     */
    @Override
    public void print() {
        System.out.println("Класс GoodPrinter сам решает конфликт default-методов.");

        /*
         * При необходимости можно явно вызвать реализацию
         * из конкретного интерфейса.
         */
        FirstPrinter.super.print();
        SecondPrinter.super.print();
    }
}

public class DefaultMethodConflictPractice {
    public static void main(String[] args) {
        GoodPrinter printer = new GoodPrinter();

        printer.print();
    }
}