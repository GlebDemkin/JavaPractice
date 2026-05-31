class DemoResource implements AutoCloseable {
    private String name;

    public DemoResource(String name) {
        this.name = name;
        System.out.println("Ресурс открыт: " + name);
    }

    public void use() {
        /*
         * Метод имитирует работу с ресурсом.
         * Например, это мог бы быть файл, поток или соединение.
         */
        System.out.println("Ресурс используется: " + name);
    }

    @Override
    public void close() {
        /*
         * Метод close() вызывается автоматически,
         * если объект используется в try-with-resources.
         */
        System.out.println("Ресурс закрыт: " + name);
    }
}

public class AutoCloseablePractice {
    public static void main(String[] args) {
        /*
         * AutoCloseable нужен для автоматического закрытия ресурсов.
         *
         * Объект resource будет закрыт автоматически после выхода из try,
         * даже если внутри блока возникнет исключение.
         */
        try (DemoResource resource = new DemoResource("test-resource")) {
            resource.use();
        }

        System.out.println("Программа завершена.");
    }
}