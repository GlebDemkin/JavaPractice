package practice39;

class Parent {
    protected String name = "Родительское поле";

    public Parent(String name) {
        this.name = name;
        System.out.println("Вызван конструктор Parent");
    }

    public void printInfo() {
        System.out.println("Метод Parent: name = " + name);
    }
}

class Child extends Parent {
    private String name = "Дочернее поле";

    public Child(String parentName, String childName) {
        /*
         * super(parentName) вызывает конструктор суперкласса Parent.
         * Вызов super() должен быть первой строкой в конструкторе.
         */
        super(parentName);

        this.name = childName;
        System.out.println("Вызван конструктор Child");
    }

    public void showSuperExamples() {
        /*
         * super.name обращается к полю суперкласса Parent.
         * this.name обращается к полю текущего класса Child.
         */
        System.out.println("Поле текущего класса: " + this.name);
        System.out.println("Поле суперкласса: " + super.name);

        /*
         * super.printInfo() вызывает метод суперкласса Parent.
         */
        super.printInfo();
    }
}

public class SuperUsage {
    public static void main(String[] args) {
        Child child = new Child("Parent name", "Child name");

        System.out.println();
        child.showSuperExamples();
    }
}