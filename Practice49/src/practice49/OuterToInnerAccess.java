package practice49;

class OuterForInnerMembers {
    public class InnerData {
        private String privateField = "private поле внутреннего класса";
        String defaultField = "default поле внутреннего класса";
        protected String protectedField = "protected поле внутреннего класса";
        public String publicField = "public поле внутреннего класса";

        private void privateMethod() {
            System.out.println("private метод внутреннего класса");
        }

        void defaultMethod() {
            System.out.println("default метод внутреннего класса");
        }

        protected void protectedMethod() {
            System.out.println("protected метод внутреннего класса");
        }

        public void publicMethod() {
            System.out.println("public метод внутреннего класса");
        }
    }

    public void showInnerData() {
        /*
         * Внешний класс может создать объект своего внутреннего класса.
         */
        InnerData inner = new InnerData();

        /*
         * Внешний класс имеет доступ ко всем полям и методам внутреннего класса,
         * даже если они объявлены как private.
         */
        System.out.println(inner.privateField);
        System.out.println(inner.defaultField);
        System.out.println(inner.protectedField);
        System.out.println(inner.publicField);

        inner.privateMethod();
        inner.defaultMethod();
        inner.protectedMethod();
        inner.publicMethod();
    }
}

public class OuterToInnerAccess {
    public static void main(String[] args) {
        OuterForInnerMembers outer = new OuterForInnerMembers();

        outer.showInnerData();

        System.out.println();

        OuterForInnerMembers.InnerData inner = outer.new InnerData();

        /*
         * Из обычного внешнего кода доступны только те элементы,
         * которые разрешены спецификаторами доступа.
         */
        System.out.println(inner.publicField);
        inner.publicMethod();

        /*
         * Так нельзя, потому что private-поле и private-метод
         * доступны только внутри класса InnerData и его внешнего класса.
         */
        // System.out.println(inner.privateField);
        // inner.privateMethod();
    }
}