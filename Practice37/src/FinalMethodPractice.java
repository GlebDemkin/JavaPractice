class ParentService {
    /*
     * final-метод можно наследовать и вызывать,
     * но нельзя переопределять в дочернем классе.
     */
    public final void printVersion() {
        System.out.println("Версия сервиса: 1.0");
    }

    /*
     * Обычный метод без final можно переопределить.
     */
    public void printStatus() {
        System.out.println("Статус из родительского класса");
    }
}

class ChildService extends ParentService {
    /*
     * Этот метод можно переопределить,
     * потому что в родительском классе он не объявлен как final.
     */
    @Override
    public void printStatus() {
        System.out.println("Статус из дочернего класса");
    }

    /*
     * Так писать нельзя.
     * Метод printVersion() в родительском классе объявлен как final,
     * поэтому его переопределение вызовет ошибку компиляции.
     */

    // @Override
    // public void printVersion() {
    //     System.out.println("Версия сервиса: 2.0");
    // }
}

public class FinalMethodPractice {
    public static void main(String[] args) {
        ChildService service = new ChildService();

        service.printVersion();
        service.printStatus();

        System.out.println();
        System.out.println("final-метод printVersion() наследуется, но не может быть переопределён.");
    }
}