class A {
    int a1 = 1;
    public int a2 = 2;
    protected int a3 = 3;
    private int a4 = 4;

    void method1() {
        System.out.println("default method1() из класса A");
    }

    public void method2() {
        System.out.println("public method2() из класса A");
    }

    protected void method3() {
        System.out.println("protected method3() из класса A");
    }

    private void method4() {
        System.out.println("private method4() из класса A");
    }

    public void showInsideA() {
        /*
         * Внутри самого класса A доступны все поля и методы:
         * default, public, protected и private.
         */
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);

        method1();
        method2();
        method3();
        method4();
    }
}

class B extends A {
    public void showInsideB() {
        /*
         * Класс B наследуется от A.
         * В этом примере классы находятся в одном пакете,
         * поэтому доступны default, public и protected элементы.
         * private элементы напрямую недоступны.
         */
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        // System.out.println("a4 = " + a4); // ошибка: private недоступен

        method1();
        method2();
        method3();
        // method4(); // ошибка: private недоступен
    }
}

class C extends B {
    public void showInsideC() {
        /*
         * Класс C наследуется от B, а B наследуется от A.
         * Поэтому C получает доступ к доступным унаследованным элементам A.
         */
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        // System.out.println("a4 = " + a4); // ошибка: private недоступен

        method1();
        method2();
        method3();
        // method4(); // ошибка: private недоступен
    }
}

public class InheritanceAccess {
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
        C objectC = new C();

        System.out.println("Доступ внутри класса A:");
        objectA.showInsideA();

        System.out.println();

        System.out.println("Доступ внутри класса B:");
        objectB.showInsideB();

        System.out.println();

        System.out.println("Доступ внутри класса C:");
        objectC.showInsideC();
    }
}