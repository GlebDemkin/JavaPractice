# Исключение в static-блоке

Практическая работа по теме исключений при инициализации класса.

В программе рассматривается код:

```java
final static int START_COUNTER;

static {
    START_COUNTER = Integer.parseInt("Y-");
}
```

Статический блок выполняется при загрузке класса, ещё до запуска метода `main()`.

Метод `Integer.parseInt()` преобразует строку в число. Строка `"Y-"` не является числом, поэтому возникает исключение `NumberFormatException`.

Так как исключение возникает во время выполнения `static`-блока, класс не может нормально инициализироваться.

Метод `main()` не успевает выполниться, поэтому строка:

```java
System.out.println("Hello");
```

не будет выведена.

В результате программа завершается с ошибкой `ExceptionInInitializerError`, причиной которой является `NumberFormatException`.

Файл программы:

```text
StaticBlockExceptionPractice.java
```