package practice48;

class OuterForInner {
    private String privateField = "private поле внешнего класса";
    String defaultField = "default поле внешнего класса";
    protected String protectedField = "protected поле внешнего класса";
    public String publicField = "public поле внешнего класса";

    private void privateMethod() {
        System.out.println("private метод внешнего класса");
    }

    void defaultMethod() {
        System.out.println("default метод внешнего класса");
    }

    protected void protectedMethod() {
        System.out.println("protected метод внешнего класса");
    }

    public void publicMethod() {
        System.out.println("public метод внешнего класса");
    }

    public class InnerReader {
        public void showOuterData() {
            /*
             * Нестатический внутренний класс хранит скрытую ссылку
             * на объект внешнего класса.
             *
             * Поэтому он имеет доступ ко всем полям и методам внешнего класса,
             * даже если они объявлены как private.
             */
            System.out.println(privateField);
            System.out.println(defaultField);
            System.out.println(protectedField);
            System.out.println(publicField);

            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
        }
    }
}

public class InnerToOuterAccess {
    public static void main(String[] args) {
        OuterForInner outer = new OuterForInner();

        /*
         * Создаём объект внутреннего класса через объект внешнего класса.
         */
        OuterForInner.InnerReader inner = outer.new InnerReader();

        inner.showOuterData();
    }
}