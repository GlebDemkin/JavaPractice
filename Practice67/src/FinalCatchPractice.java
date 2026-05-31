public class FinalCatchPractice {
    public static void main(String[] args) {
        /*
         * final в параметре catch означает, что переменной e
         * нельзя присвоить другой объект исключения.
         */
        try {
            int result = 10 / 0;
            System.out.println("result = " + result);
        } catch (final ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение исключения: " + e.getMessage());

            /*
             * Так писать нельзя, потому что e объявлена как final.
             * Переменная e уже ссылается на пойманное исключение,
             * и эту ссылку нельзя заменить другой.
             */

            // e = new ArithmeticException("Новое исключение");
        }

        System.out.println("Программа продолжила работу после catch.");
    }
}