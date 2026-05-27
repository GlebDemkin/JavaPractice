class A {
    public static int a = 1;
    public static int b;

    /*
     * Статический метод принадлежит классу A,
     * а не конкретному объекту класса A.
     */
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void callInsideClass() {
        /*
         * Внутри самого класса статический метод можно вызвать напрямую,
         * без указания имени класса.
         */
        printVars();
    }
}

class B extends A {
    /*
     * Класс B наследуется от A.
     * Статический метод printVars() можно вызвать через имя подкласса,
     * но фактически это всё равно метод класса A.
     */
}

public class StaticPractice {
    public static void main(String[] args) {
        System.out.println("1. Вызов через имя класса:");
        A.printVars();

        System.out.println("\n2. Вызов напрямую внутри класса A:");
        A.callInsideClass();

        System.out.println("\n3. Вызов через объект класса A:");
        A objectA = new A();
        objectA.printVars();

        System.out.println("\n4. Вызов через ссылку типа A:");
        A referenceA = objectA;
        referenceA.printVars();

        System.out.println("\n5. Вызов через имя подкласса B:");
        B.printVars();

        System.out.println("\n6. Вызов через объект подкласса B:");
        B objectB = new B();
        objectB.printVars();

        System.out.println("\n7. Вызов через null-ссылку типа A:");
        A nullReference = null;
        nullReference.printVars();

        /*
         * Несмотря на то что вызов через объект, ссылку и null-ссылку работает,
         * так писать не рекомендуется.
         *
         * Правильный и самый понятный способ вызова статического метода:
         * A.printVars();
         */
    }
}