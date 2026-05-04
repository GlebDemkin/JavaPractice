/**
 * Класс Calculator демонстрирует использование Javadoc-комментариев.
 *
 * В классе описаны простые арифметические методы, для которых указаны
 * параметры, возвращаемые значения и сведения об авторе.
 *
 * @author Gleb Demkin
 * @version 1.0
 */
public class CalculateOperations {

    /**
     * Складывает два целых числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return результат вычитания
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Делит первое число на второе.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public static int divide(int a, int b) {
        return a / b;
    }

    /**
     * Точка входа в программу.
     *
     * В методе вызываются методы класса Calculator и выводятся результаты
     * арифметических операций.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Выводим значения переменных x и y.
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*
        Выводим значения для рещультатов вычислений в таком порядке:
        Сумма: ...
        Разность: ...
        Деление: ...
        */
        System.out.println("Сумма: " + add(x, y));
        System.out.println("Разность: " + subtract(x, y));
        System.out.println("Деление: " + divide(x, y));
    }
}