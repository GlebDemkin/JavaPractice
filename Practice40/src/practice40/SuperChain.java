package practice40;

class A {
    protected int a = 10;

    public void method() {
        System.out.println("Метод method() из класса A");
    }
}

class B extends A {
    /*
     * В классе B переменная a и метод method() не объявлены.
     * Но B наследует доступные элементы класса A.
     */
}

class C extends B {
    public void method() {
        /*
         * super обращается к ближайшему суперклассу, то есть к B.
         * Но в B нет собственного поля a.
         * Поэтому Java ищет поле выше по цепочке наследования и находит его в A.
         */
        int value = super.a;

        System.out.println("super.a = " + value);

        /*
         * Здесь аналогично: super.method() обращается к B.
         * Но в B метод method() не переопределён.
         * Поэтому вызывается унаследованный метод из A.
         */
        super.method();

        System.out.println("Метод method() из класса C");
    }
}

public class SuperChain {
    public static void main(String[] args) {
        C object = new C();

        object.method();
    }
}