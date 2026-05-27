package base;

public class SamePackageTest {
    public void test() {
        AccessExample example = new AccessExample();

        /*
         * Класс SamePackageTest находится в том же пакете base.
         * Поэтому ему доступны default, protected и public элементы.
         * private элементы недоступны даже внутри того же пакета.
         */

        // System.out.println(example.privateField); // ошибка: private недоступен

        System.out.println(example.defaultField);
        System.out.println(example.protectedField);
        System.out.println(example.publicField);

        // example.privateMethod(); // ошибка: private недоступен

        example.defaultMethod();
        example.protectedMethod();
        example.publicMethod();
    }
}