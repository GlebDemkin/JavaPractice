class OuterAccess {
    /*
     * public-внутренний класс доступен из любого другого класса.
     */
    public class PublicInner {
        public void show() {
            System.out.println("public inner class");
        }
    }

    /*
     * protected-внутренний класс доступен внутри текущего пакета
     * и в классах-наследниках.
     */
    protected class ProtectedInner {
        public void show() {
            System.out.println("protected inner class");
        }
    }

    /*
     * Внутренний класс без спецификатора доступен только внутри текущего пакета.
     */
    class DefaultInner {
        public void show() {
            System.out.println("default inner class");
        }
    }

    /*
     * private-внутренний класс доступен только внутри класса OuterAccess.
     */
    private class PrivateInner {
        public void show() {
            System.out.println("private inner class");
        }
    }

    public void showPrivateInner() {
        /*
         * private-внутренний класс можно использовать внутри внешнего класса.
         */
        PrivateInner privateInner = new PrivateInner();
        privateInner.show();
    }
}

public class InnerAccessModifiers {
    public static void main(String[] args) {
        OuterAccess outer = new OuterAccess();

        /*
         * Для создания объекта нестатического внутреннего класса
         * сначала нужен объект внешнего класса.
         */
        OuterAccess.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        OuterAccess.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();

        OuterAccess.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();

        /*
         * Так нельзя, потому что PrivateInner объявлен как private.
         */
        // OuterAccess.PrivateInner privateInner = outer.new PrivateInner();

        /*
         * Но внешний класс может сам создать private-внутренний класс
         * внутри своего метода.
         */
        outer.showPrivateInner();
    }
}