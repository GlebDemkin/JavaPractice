# Конфликт default-методов

Практическая работа по теме конфликтов `default`-методов в интерфейсах Java.

В программе созданы два интерфейса:

```text
FirstPrinter
SecondPrinter
```

Оба интерфейса содержат одинаковый `default`-метод:

```java
default void print()
```

Если класс реализует два интерфейса с одинаковыми `default`-методами, возникает конфликт. Java не может автоматически выбрать, какую реализацию использовать.

Такой код не скомпилируется:

```java
class BadPrinter implements FirstPrinter, SecondPrinter {
}
```

Чтобы решить конфликт, класс должен сам переопределить метод:

```java
@Override
public void print()
```

Внутри переопределённого метода можно вызвать конкретную реализацию интерфейса:

```java
FirstPrinter.super.print();
SecondPrinter.super.print();
```

Файл программы:

```text
DefaultMethodConflictPractice.java
```