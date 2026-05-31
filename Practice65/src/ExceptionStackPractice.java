public class ExceptionStackPractice {
    public static void main(String[] args) {
        /*
         * Первое исключение будет перехвачено в блоке try-catch.
         * Поэтому программа после него продолжит работу.
         */
        try {
            generateHandledException();
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());
            System.out.println("Причина: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнился после обработки первого исключения.");
        }

        System.out.println();
        System.out.println("После первого исключения программа продолжает работу.");
        System.out.println();

        /*
         * Второе исключение не обрабатывается.
         * Оно поднимется вверх по стеку вызовов и приведёт к аварийному завершению программы.
         */
        System.out.println("Сейчас будет сгенерировано неперехваченное исключение.");
        generateUnhandledException();

        /*
         * Эта строка уже не выполнится, потому что программа завершится аварийно.
         */
        System.out.println("Эта строка не будет выведена.");
    }

    public static void generateHandledException() {
        /*
         * Деление на ноль создаёт ArithmeticException.
         * Исключение не обрабатывается в этом методе,
         * поэтому передаётся вверх в main(), где есть try-catch.
         */
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void generateUnhandledException() {
        /*
         * Обращение к несуществующему индексу массива создаёт
         * ArrayIndexOutOfBoundsException.
         *
         * Для этого исключения в программе нет catch-блока,
         * поэтому оно приведёт к аварийному завершению приложения.
         */
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[10]);
    }
}