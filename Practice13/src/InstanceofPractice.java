class Animal {
    // Базовый класс для всех животных.
}

class Dog extends Animal {
    // Класс Dog наследуется от Animal, поэтому собака является животным.
}

class Cat extends Animal {
    // Класс Cat тоже наследуется от Animal, поэтому кошка является животным.
}

public class InstanceofPractice {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        String text = "Java";
        Object objectDog = dog;

        Animal nullAnimal = null;

        System.out.println("Оператор instanceof");

        System.out.println("\nПроверка объектов своих классов:");

        // Объект animal создан от класса Animal.
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));

        // Объект dog создан от класса Dog.
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));

        // Объект cat создан от класса Cat.
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat));

        System.out.println("\nПроверка наследования:");

        // Dog наследуется от Animal, поэтому dog также является Animal.
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));

        // Cat наследуется от Animal, поэтому cat также является Animal.
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));

        System.out.println("\nПроверка объекта через Object:");

        // Object является базовым классом для всех объектов в Java.
        System.out.println("objectDog instanceof Object: " + (objectDog instanceof Object));

        // Несмотря на тип переменной Object, внутри objectDog хранится объект Dog.
        System.out.println("objectDog instanceof Dog: " + (objectDog instanceof Dog));

        // Так как Dog наследуется от Animal, проверка на Animal тоже вернёт true.
        System.out.println("objectDog instanceof Animal: " + (objectDog instanceof Animal));

        System.out.println("\nПроверка строки:");

        // Строка является объектом класса String.
        System.out.println("text instanceof String: " + (text instanceof String));

        // String также является объектом, поэтому проверка на Object вернёт true.
        System.out.println("text instanceof Object: " + (text instanceof Object));

        System.out.println("\nПроверка null:");

        // Если переменная содержит null, instanceof всегда возвращает false.
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal));
        System.out.println("nullAnimal instanceof Dog: " + (nullAnimal instanceof Dog));
    }
}