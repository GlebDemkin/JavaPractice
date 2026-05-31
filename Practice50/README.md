# Вложенный класс в интерфейсе

Практическая работа по теме вложенных классов в Java.

В программе показан пример класса, объявленного внутри интерфейса.

Класс `MessageFormatter` объявлен внутри интерфейса `MessageService`:

```java
interface MessageService {
    public static class MessageFormatter {
        ...
    }
}
```

Классы, объявленные внутри интерфейса, автоматически являются `public static`. В данной программе эти спецификаторы указаны явно, чтобы показать поведение вложенного класса.

Так как `MessageFormatter` является статическим вложенным классом, объект интерфейса `MessageService` создавать не нужно.

Объект вложенного класса создаётся через имя интерфейса:

```java
MessageService.MessageFormatter formatter = new MessageService.MessageFormatter();
```

После создания объекта вызывается метод:

```java
formatter.printMessage("Пример вложенного класса внутри интерфейса");
```

Файл программы:

```text
InterfaceNestedClass.java
```