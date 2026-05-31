# Default и static методы в интерфейсе

Практическая работа по теме методов `default` и `static` в интерфейсах Java.

В программе создан интерфейс `GreetingService`.

В интерфейсе определены два метода:

```text
default void printGreeting(String name)
static void printInfo()
```

`default`-метод имеет готовую реализацию. Класс, реализующий интерфейс, может использовать этот метод без переопределения.

`static`-метод принадлежит самому интерфейсу и вызывается через имя интерфейса:

```java
GreetingService.printInfo();
```

В программе показаны способы вызова `default`-метода:

```java
service.printGreeting("Глеб");
interfaceService.printGreeting("Java");
```

Также показан правильный способ вызова `static`-метода интерфейса.

Файл программы:

```text
DefaultStaticInterfacePractice.java
```