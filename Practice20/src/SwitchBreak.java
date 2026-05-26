public class SwitchBreak {
    public static void main(String[] args) {
        /*
         * Переменная value определяет, с какого case начнётся выполнение.
         * Здесь value равен 2, поэтому выполнение начнётся с case 2.
         */
        int value = 2;
        int i = 0;

        System.out.println("value = " + value);

        switch (value) {
            case 1:
                i = 1;
                System.out.println("Выполнился case 1");
                break;

            case 2:
                i = 2;
                System.out.println("Выполнился case 2");

                /*
                 * Здесь нет break.
                 * Поэтому выполнение не остановится и перейдёт дальше в case 3.
                 */
            case 3:
                i = 3;
                System.out.println("Выполнился case 3");
                break;

            default:
                i = 4;
                System.out.println("Выполнился default");
                break;
        }

        System.out.println("Итоговое значение i = " + i);
    }
}