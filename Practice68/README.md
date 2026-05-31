# Собственное исключение

Практическая работа по теме создания собственных исключений в Java.

В программе создан собственный класс исключения:

```java
InvalidAgeException
```

Класс наследуется от `Exception`, поэтому является проверяемым исключением.

По соглашению названия классов исключений заканчиваются словом `Exception`.

В классе `InvalidAgeException` определены три конструктора:

```text
InvalidAgeException()
InvalidAgeException(String message)
InvalidAgeException(String message, Throwable cause)
```

В программе метод `setAge()` проверяет возраст. Если возраст меньше нуля, метод выбрасывает собственное исключение через `throw`.

Так как `InvalidAgeException` наследуется от `Exception`, метод `setAge()` объявляет:

```java
throws InvalidAgeException
```

Исключение обрабатывается в блоке `try-catch`.

Файл программы:

```text
CustomExceptionPractice.java
```