interface MessageService {
    /*
     * Класс, объявленный внутри интерфейса, автоматически является public static.
     * Поэтому его можно создать без объекта интерфейса.
     * Здесь public static написано явно, чтобы показать это в коде.
     */
    public static class MessageFormatter {
        /*
         * Метод форматирует текст сообщения.
         */
        public void printMessage(String text) {
            System.out.println("Сообщение: " + text);
        }
    }
}

public class InterfaceNestedClass {
    public static void main(String[] args) {
        /*
         * Вложенный класс вызывается через имя интерфейса.
         * Создавать объект интерфейса MessageService не нужно.
         */
        MessageService.MessageFormatter formatter = new MessageService.MessageFormatter();

        formatter.printMessage("Пример вложенного класса внутри интерфейса");
    }
}