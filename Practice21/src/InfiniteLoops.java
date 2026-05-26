public class InfiniteLoops {
    public static void main(String[] args) {
        System.out.println("Бесконечный цикл while:");

        int whileCounter = 1;

        /*
         * Условие true всегда истинно, поэтому цикл while является бесконечным.
         * Чтобы программа не зависла, внутри цикла используется break.
         * Если убрать break, цикл будет выполняться бесконечно.
         */
        while (true) {
            System.out.println("Итерация while: " + whileCounter);

            if (whileCounter == 5) {
                System.out.println("Выход из while через break.");
                break;
            }

            whileCounter++;
        }

        System.out.println();

        System.out.println("Бесконечный цикл do-while:");

        int doWhileCounter = 1;

        /*
         * Цикл do-while сначала выполняет тело цикла,
         * а только потом проверяет условие.
         * Условие true делает цикл бесконечным.
         * Для остановки снова используется break.
         */
        do {
            System.out.println("Итерация do-while: " + doWhileCounter);

            if (doWhileCounter == 5) {
                System.out.println("Выход из do-while через break.");
                break;
            }

            doWhileCounter++;
        } while (true);
    }
}