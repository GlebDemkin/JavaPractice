package other;

import base.AccessExample;

public class ChildExample extends AccessExample {
    public void testFromChild() {
        /*
         * Класс ChildExample находится в другом пакете other,
         * но наследуется от AccessExample.
         *
         * Поэтому ему доступны protected и public элементы.
         * private и default элементы недоступны.
         */

        // System.out.println(privateField); // ошибка: private недоступен
        // System.out.println(defaultField); // ошибка: default недоступен из другого пакета

        System.out.println(protectedField);
        System.out.println(publicField);

        // privateMethod(); // ошибка: private недоступен
        // defaultMethod(); // ошибка: default недоступен из другого пакета

        protectedMethod();
        publicMethod();
    }
}