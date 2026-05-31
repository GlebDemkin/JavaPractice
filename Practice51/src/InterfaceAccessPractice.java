public class InterfaceAccessPractice {
    /*
     * Интерфейс без спецификатора доступа имеет доступ по умолчанию.
     * Такой интерфейс доступен только внутри текущего пакета.
     */
    interface DefaultInterface {
        void printMessage();
    }

    /*
     * public-интерфейс доступен из любого класса и любого пакета.
     * Здесь он объявлен как вложенный интерфейс для удобства примера.
     */
    public interface PublicInterface {
        void printMessage();
    }

    /*
     * protected нельзя использовать для интерфейса верхнего уровня.
     * Но protected можно использовать для вложенного интерфейса внутри класса.
     */
    protected interface ProtectedInterface {
        void printMessage();
    }

    /*
     * private нельзя использовать для интерфейса верхнего уровня.
     * Но private можно использовать для вложенного интерфейса внутри класса.
     */
    private interface PrivateInterface {
        void printMessage();
    }

    static class DefaultInterfaceImpl implements DefaultInterface {
        @Override
        public void printMessage() {
            System.out.println("interface Interface { } - доступ только внутри пакета.");
        }
    }

    static class PublicInterfaceImpl implements PublicInterface {
        @Override
        public void printMessage() {
            System.out.println("public interface Interface { } - доступ из любого пакета.");
        }
    }

    static class ProtectedInterfaceImpl implements ProtectedInterface {
        @Override
        public void printMessage() {
            System.out.println("protected interface Interface { } - возможен только как вложенный интерфейс.");
        }
    }

    static class PrivateInterfaceImpl implements PrivateInterface {
        @Override
        public void printMessage() {
            System.out.println("private interface Interface { } - возможен только как вложенный интерфейс.");
        }
    }

    public static void main(String[] args) {
        DefaultInterface defaultObject = new DefaultInterfaceImpl();
        PublicInterface publicObject = new PublicInterfaceImpl();
        ProtectedInterface protectedObject = new ProtectedInterfaceImpl();
        PrivateInterface privateObject = new PrivateInterfaceImpl();

        defaultObject.printMessage();
        publicObject.printMessage();
        protectedObject.printMessage();
        privateObject.printMessage();

        /*
         * Такие объявления нельзя использовать на верхнем уровне файла:
         *
         * protected interface Interface {
         * }
         *
         * private interface Interface {
         * }
         *
         * Они вызовут ошибку компиляции.
         */
    }
}