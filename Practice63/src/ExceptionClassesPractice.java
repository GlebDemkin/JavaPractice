public class ExceptionClassesPractice {
    public static void main(String[] args) {
        /*
         * Throwable - общий родительский класс для Error и Exception.
         * Обычно напрямую Throwable используют редко.
         */
        Throwable throwable = new Throwable("Общий объект Throwable");

        /*
         * Error - серьёзная ошибка уровня JVM или среды выполнения.
         * В обычных программах Error обычно не создают и не обрабатывают.
         * Здесь объект создан только для демонстрации.
         */
        Error error = new Error("Пример серьёзной ошибки Error");

        /*
         * Exception - исключение, которое программа может обработать.
         * Например, ошибка при работе с файлом или вводом данных.
         */
        Exception exception = new Exception("Пример проверяемого исключения Exception");

        /*
         * RuntimeException - исключение времени выполнения.
         * Такие исключения часто возникают из-за ошибок в логике программы.
         */
        RuntimeException runtimeException = new RuntimeException("Пример RuntimeException");

        System.out.println("Примеры основных классов исключений:");
        System.out.println();

        printThrowableInfo(throwable);
        printThrowableInfo(error);
        printThrowableInfo(exception);
        printThrowableInfo(runtimeException);

        System.out.println("Иерархия:");
        System.out.println("Object");
        System.out.println("  Throwable");
        System.out.println("    Error");
        System.out.println("    Exception");
        System.out.println("      RuntimeException");
    }

    public static void printThrowableInfo(Throwable throwable) {
        /*
         * Все Error и Exception являются наследниками Throwable.
         * Поэтому их можно передать в метод с параметром Throwable.
         */
        System.out.println("Класс: " + throwable.getClass().getSimpleName());
        System.out.println("Сообщение: " + throwable.getMessage());
        System.out.println();
    }
}