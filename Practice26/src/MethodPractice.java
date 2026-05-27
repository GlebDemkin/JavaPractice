class Calculator {
    /*
     * Перегрузка методов: в одном классе есть несколько методов
     * с одинаковым названием add(), но с разными параметрами.
     */

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    /*
     * Метод makeSound() объявлен в суперклассе.
     * Подклассы смогут переопределить его поведение.
     */
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    /*
     * Переопределение метода: класс Dog изменяет поведение метода
     * makeSound(), который был объявлен в классе Animal.
     */
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}

class Cat extends Animal {
    /*
     * Переопределение метода: класс Cat тоже изменяет метод
     * makeSound(), но делает это по-своему.
     */
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}

public class MethodPractice {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Перегрузка методов:");

        /*
         * Java выбирает нужную версию метода add()
         * по количеству и типам переданных аргументов.
         */
        System.out.println("add(int, int): " + calculator.add(5, 3));
        System.out.println("add(double, double): " + calculator.add(2.5, 3.7));
        System.out.println("add(int, int, int): " + calculator.add(1, 2, 3));

        System.out.println();

        System.out.println("Переопределение методов:");

        /*
         * Переменные имеют тип Animal, но реальные объекты разные:
         * Animal, Dog и Cat.
         *
         * При вызове makeSound() Java выполняет версию метода
         * из реального класса объекта.
         */
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}