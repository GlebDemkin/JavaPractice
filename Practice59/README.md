# Преобразование String, StringBuilder и StringBuffer

Практическая работа по теме преобразования строковых типов в Java.

В программе показано, как преобразовывать объекты между типами:

```text
String
StringBuilder
StringBuffer
```

Преобразование `String` в `StringBuilder` выполняется через конструктор:

```java
new StringBuilder(stringValue)
```

Преобразование `String` в `StringBuffer` выполняется через конструктор:

```java
new StringBuffer(stringValue)
```

Преобразование `StringBuilder` и `StringBuffer` в `String` выполняется через метод:

```java
toString()
```

Также в программе показано преобразование:

```text
StringBuilder -> StringBuffer
StringBuffer -> StringBuilder
```

После преобразования `StringBuilder` и `StringBuffer` можно изменять, а исходный объект `String` остаётся неизменным.

Файл программы:

```text
StringConversionPractice.java
```