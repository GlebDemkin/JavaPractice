interface GreetingService {
    /*
     * default-метод — это неабстрактный метод интерфейса.
     * У него есть готовая реализация, поэтому класс может его не переопределять.
     */
    default void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
     * static-метод принадлежит самому интерфейсу.
     * Он вызывается через имя интерфейса: GreetingService.printInfo().
     */
    static void printInfo() {
        System.out.println("GreetingService - интерфейс для вывода приветствий.");
    }
}

class SimpleGreetingService implements GreetingService {
    /*
     * Класс реализует интерфейс GreetingService.
     * Метод printGreeting() можно не писать заново,
     * потому что в интерфейсе уже есть default-реализация.
     */
}

public class DefaultStaticInterfacePractice {
    public static void main(String[] args) {
        SimpleGreetingService service = new SimpleGreetingService();

        System.out.println("Вызов default-метода через объект класса:");
        service.printGreeting("Глеб");

        System.out.println();

        /*
         * Объект класса можно сохранить в переменную типа интерфейса.
         * Через такую переменную тоже можно вызвать default-метод.
         */
        GreetingService interfaceService = new SimpleGreetingService();

        System.out.println("Вызов default-метода через переменную типа интерфейса:");
        interfaceService.printGreeting("Java");

        System.out.println();

        /*
         * static-метод интерфейса вызывается только через имя интерфейса.
         * Через объект класса или через имя класса-реализации его вызывать нельзя.
         */
        System.out.println("Вызов static-метода через имя интерфейса:");
        GreetingService.printInfo();

        /*
         * Так писать нельзя:
         *
         * service.printInfo();
         * SimpleGreetingService.printInfo();
         */
    }
}