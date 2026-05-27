package other;

import base.AccessExample;
import base.SamePackageTest;

public class Main {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();

        System.out.println("Доступ внутри самого класса:");
        example.showInsideClass();

        System.out.println("\nДоступ из класса того же пакета:");
        SamePackageTest samePackageTest = new SamePackageTest();
        samePackageTest.test();

        System.out.println("\nДоступ из подкласса в другом пакете:");
        ChildExample childExample = new ChildExample();
        childExample.testFromChild();

        System.out.println("\nДоступ из обычного класса другого пакета:");

        /*
         * Main находится в пакете other и не является наследником AccessExample.
         * Поэтому напрямую через объект example доступен только public метод.
         */

        // example.defaultMethod(); // ошибка: default недоступен из другого пакета
        // example.protectedMethod(); // ошибка: protected недоступен через объект из другого пакета
        example.publicMethod();
    }
}