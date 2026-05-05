# Оператор `instanceof`

Практическая работа по теме использования оператора `instanceof` в Java.

Оператор `instanceof` проверяет, является ли объект экземпляром указанного класса или его наследника.

В программе созданы классы:

```text
Animal
Dog
Cat
```

Классы `Dog` и `Cat` наследуются от класса `Animal`, поэтому объекты этих классов также являются объектами типа `Animal`.

В программе показаны проверки:

```java
dog instanceof Dog
dog instanceof Animal
cat instanceof Animal
text instanceof String
text instanceof Object
```

Также отдельно рассмотрен случай с `null`.

Если переменная содержит `null`, оператор `instanceof` всегда возвращает `false`.


Файл программы:

```text
InstanceofPractice.java
```