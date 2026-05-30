class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Метод родительского класса");
        System.out.println("name = " + name);
    }
}

class Child extends Parent {
    private int age;

    public Child(String name, int age) {
        /*
         * super(name) вызывает конструктор родительского класса Parent.
         * Так мы передаём значение name в поле родительского класса.
         */
        super(name);

        /*
         * this.age означает поле текущего объекта.
         * age без this — это параметр конструктора.
         */
        this.age = age;
    }

    public void printChildInfo() {
        /*
         * this используется для обращения к текущему объекту.
         * Здесь через this вызывается метод текущего класса.
         */
        System.out.println("Метод дочернего класса");
        System.out.println("age = " + this.age);

        /*
         * super используется для обращения к родительскому классу.
         * Здесь вызывается метод printInfo() из класса Parent.
         */
        super.printInfo();
    }

    @Override
    public void printInfo() {
        /*
         * Метод printInfo() переопределён в дочернем классе.
         * this.name обращается к полю текущего объекта.
         */
        System.out.println("Переопределённый метод дочернего класса");
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);
    }
}

public class ThisSuperPractice {
    public static void main(String[] args) {
        Child child = new Child("Gleb", 19);

        System.out.println("Вызов метода дочернего класса:");
        child.printChildInfo();

        System.out.println();

        System.out.println("Вызов переопределённого метода:");
        child.printInfo();
    }
}