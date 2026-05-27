package base;

public class AccessExample {
    private String privateField = "private поле";
    String defaultField = "default поле";
    protected String protectedField = "protected поле";
    public String publicField = "public поле";

    private void privateMethod() {
        System.out.println("private метод доступен только внутри класса AccessExample");
    }

    void defaultMethod() {
        System.out.println("default метод доступен внутри пакета base");
    }

    protected void protectedMethod() {
        System.out.println("protected метод доступен внутри пакета и в классах-наследниках");
    }

    public void publicMethod() {
        System.out.println("public метод доступен из любого пакета");
    }

    public void showInsideClass() {
        /*
         * Внутри самого класса доступны все элементы:
         * private, default, protected и public.
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