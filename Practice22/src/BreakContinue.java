public class BreakContinue {
    public static void main(String[] args) {
        /*
         * В этом цикле перебираются числа от 1 до 10.
         * Оператор continue пропускает текущую итерацию, если число является чётным.
         * Оператор break полностью завершает цикл,
         * когда число становится больше 7.
         */
        for (int i = 1; i <= 10; i++) {
            if (i > 7) {
                System.out.println("Число " + i + " больше 7. Выход из цикла через break.");
                break;
            }

            if (i % 2 == 0) {
                System.out.println("Число " + i + " пропущено через continue.");
                continue;
            }

            System.out.println("Обработано нечётное число: " + i);
        }

        System.out.println("Цикл завершён.");
    }
}