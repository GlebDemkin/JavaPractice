class ConstructorExample {
    int a;
    int b;
    int c;
    int z;

    public ConstructorExample() {
        /*
         * Базовый конструктор задаёт общее значение z.
         * Остальные конструкторы будут вызывать его через this().
         */
        z = 1;
    }

    public ConstructorExample(int a) {
        /*
         * this() вызывает конструктор без параметров.
         * Вызов this() должен быть первой строкой конструктора.
         */
        this();
        this.a = a;
    }

    public ConstructorExample(int a, int b) {
        /*
         * this(a) вызывает конструктор ConstructorExample(int a).
         * Так мы не повторяем инициализацию поля a и значения z.
         */
        this(a);
        this.b = b;
    }

    public ConstructorExample(int a, int b, int c) {
        /*
         * this(a, b) вызывает конструктор с двумя параметрами.
         * После этого остаётся проинициализировать только поле c.
         */
        this(a, b);
        this.c = c;
    }

    public void printFields() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("z = " + z);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        ConstructorExample object = new ConstructorExample(10, 20, 30);

        object.printFields();
    }
}