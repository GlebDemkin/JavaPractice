# Обработка исключений

Практическая работа по теме генерации и обработки исключений в Java.

В программе показаны примеры возникновения и обработки исключений:

```text
ArithmeticException
ArrayIndexOutOfBoundsException
IllegalArgumentException
ClassCastException
NullPointerException
```

Каждое исключение обрабатывается через конструкцию:

```java
try {
    // код, в котором может возникнуть ошибка
} catch (ExceptionType e) {
    // обработка ошибки
}
```

`ArithmeticException` возникает при делении на ноль.

`ArrayIndexOutOfBoundsException` возникает при обращении к несуществующему индексу массива.

`IllegalArgumentException` возникает, если в метод передан некорректный аргумент.

`ClassCastException` возникает при неправильном приведении типа.

`NullPointerException` возникает при обращении к методу или полю через `null`.

Файл программы:

```text
ExceptionHandlingPractice.java
```