public class StaticBlockExceptionPractice {
    final static int START_COUNTER;

    static {
        /*
         * static-блок выполняется при загрузке класса,
         * то есть ещё до запуска метода main().
         *
         * Integer.parseInt("Y-") пытается преобразовать строку "Y-" в число.
         * Так как "Y-" не является числом, возникает NumberFormatException.
         */
        START_COUNTER = Integer.parseInt("Y-");
    }

    public static void main(String[] args) {
        /*
         * Эта строка не выполнится, потому что ошибка произойдёт раньше -
         * во время выполнения static-блока.
         */
        System.out.println("Hello");
    }
}