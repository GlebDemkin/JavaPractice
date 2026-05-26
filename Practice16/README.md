# NullPointerException при автораспаковке

Практическая работа по теме автоупаковки и автораспаковки в Java.

В программе показан случай, когда при автораспаковке возникает исключение `NullPointerException`.

Автораспаковка — это автоматическое преобразование объекта-оболочки в значение базового типа.

Пример:

```java
Integer wrapperValue = null;
int primitiveValue = wrapperValue;
```

В этом случае программа выбросит `NullPointerException`, потому что переменная `wrapperValue` не содержит объект. Она равна `null`, поэтому Java не может извлечь из неё значение типа `int`.

Файл программы:

```text
UnboxingNullPointerException.java
```