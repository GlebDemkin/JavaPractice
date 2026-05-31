# Интерфейс AutoCloseable

Практическая работа по теме автоматического закрытия ресурсов в Java.

`AutoCloseable` - это интерфейс, который содержит метод:

```java
close()
```

Он нужен для объектов, которые нужно закрывать после использования.

Например:

```text
файлы
потоки ввода
потоки вывода
соединения
```

Объекты, реализующие `AutoCloseable`, можно использовать в конструкции `try-with-resources`:

```java
try (DemoResource resource = new DemoResource("test-resource")) {
    resource.use();
}
```

После выхода из блока `try` метод `close()` будет вызван автоматически.

Файл программы:

```text
AutoCloseablePractice.java
```