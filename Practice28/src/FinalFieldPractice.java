class InitInConstructor {
    public final int a;

    /*
     * Первый способ: инициализация final-поля в конструкторе.
     * Значение передаётся при создании объекта.
     */
    public InitInConstructor(int value) {
        a = value;
    }
}

class InitInDefaultConstructor {
    public final int a;

    /*
     * Второй вариант через конструктор:
     * значение задаётся прямо внутри конструктора без параметров.
     */
    public InitInDefaultConstructor() {
        a = 10;
    }
}

class InitInAllConstructors {
    public final int a;

    /*
     * Если в классе несколько конструкторов,
     * final-поле должно быть проинициализировано в каждом из них.
     */
    public InitInAllConstructors() {
        a = 1;
    }

    public InitInAllConstructors(int value) {
        a = value;
    }
}

class InitInBlock {
    public final int a;

    /*
     * Ещё один способ: инициализация в нестатическом блоке.
     * Такой блок выполняется перед конструктором при создании объекта.
     */
    {
        a = 100;
    }

    public InitInBlock() {
        /*
         * Здесь поле a уже проинициализировано в блоке выше.
         * Повторно присвоить значение нельзя.
         */
        // a = 200; // ошибка компиляции
    }
}

public class FinalFieldPractice {
    public static void main(String[] args) {
        InitInConstructor object1 = new InitInConstructor(5);
        InitInDefaultConstructor object2 = new InitInDefaultConstructor();
        InitInAllConstructors object3 = new InitInAllConstructors();
        InitInAllConstructors object4 = new InitInAllConstructors(25);
        InitInBlock object5 = new InitInBlock();

        System.out.println("Инициализация через конструктор с параметром: " + object1.a);
        System.out.println("Инициализация через конструктор без параметров: " + object2.a);
        System.out.println("Инициализация в первом конструкторе: " + object3.a);
        System.out.println("Инициализация во втором конструкторе: " + object4.a);
        System.out.println("Инициализация через блок инициализации: " + object5.a);

        /*
         * После создания объекта изменить final-поле нельзя.
         */
        // object1.a = 50; // ошибка компиляции
    }
}