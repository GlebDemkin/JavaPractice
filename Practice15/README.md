# Создание объектов `Boolean`

Практическая работа по теме классов-оболочек в Java.

В программе показаны способы создания объекта класса `Boolean`.

Используются варианты:

```text
Boolean.valueOf(boolean)
Boolean.valueOf(String)
автоупаковка boolean в Boolean
Boolean.TRUE
Boolean.FALSE
Boolean.parseBoolean(String)
```

Класс `Boolean` является оболочкой для базового типа `boolean`.

Метод `Boolean.valueOf("true")` возвращает `true`, если строка равна `"true"` без учёта регистра. В остальных случаях возвращается `false`.

Файл программы:

```text
BooleanCreate.java
```