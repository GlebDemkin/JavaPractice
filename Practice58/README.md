# Методы StringBuilder и StringBuffer

Практическая работа по теме изменяемых строк в Java.

В программе показана работа методов классов `StringBuilder` и `StringBuffer`.

Используются методы:

```text
append()
insert()
replace()
delete()
charAt()
setCharAt()
length()
capacity()
substring()
reverse()
```

`StringBuilder` и `StringBuffer` позволяют изменять содержимое строки без создания нового объекта при каждой операции.

Основное отличие:

```text
StringBuilder - быстрее, но не потокобезопасный
StringBuffer - потокобезопасный, но обычно медленнее
```

В программе одни и те же методы показаны отдельно для `StringBuilder` и `StringBuffer`.

Файл программы:

```text
StringBuilderBufferMethods.java
```