class BasePrinter {
    public void printMessage(String message) {
        System.out.println("BasePrinter: " + message);
    }
}

class CorrectPrinter extends BasePrinter {
    /*
     * Здесь метод действительно переопределяет метод родительского класса.
     * Аннотация @Override подтверждает это.
     */
    @Override
    public void printMessage(String message) {
        System.out.println("CorrectPrinter: " + message);
    }
}

class WrongPrinter extends BasePrinter {
    /*
     * Здесь специально показана возможная ошибка.
     * В родительском классе метод называется printMessage(String message).
     *
     * Если случайно изменить параметры, например поставить int,
     * то это будет уже не переопределение, а перегрузка.
     */

    public void printMessage(int message) {
        System.out.println("WrongPrinter: " + message);
    }

    /*
     * Если добавить @Override к методу выше, Java сразу покажет ошибку.
     * Это помогает заметить, что метод не переопределяет родительский.
     */
}

public class OverrideAnnotationPractice {
    public static void main(String[] args) {
        BasePrinter printer1 = new CorrectPrinter();
        BasePrinter printer2 = new WrongPrinter();

        /*
         * У CorrectPrinter метод переопределён правильно,
         * поэтому вызывается версия из CorrectPrinter.
         */
        printer1.printMessage("Hello");

        /*
         * У WrongPrinter метод printMessage(String) не переопределён.
         * Поэтому вызывается метод из BasePrinter.
         */
        printer2.printMessage("Hello");

        /*
         * Метод printMessage(int) существует только в WrongPrinter.
         * Чтобы вызвать его, нужна переменная типа WrongPrinter.
         */
        WrongPrinter wrongPrinter = new WrongPrinter();
        wrongPrinter.printMessage(100);
    }
}