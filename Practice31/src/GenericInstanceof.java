class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericInstanceof {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(100);
        Wrapper<String> stringWrapper = new Wrapper<>("Gleb");

        Object object1 = intWrapper;
        Object object2 = stringWrapper;

        /*
         * Из-за стирания типов в Java нельзя проверить:
         * object1 instanceof Wrapper<Integer>
         *
         * Во время выполнения Java знает только то, что это Wrapper,
         * но не знает, с каким именно типом он был создан.
         */
        // System.out.println(object1 instanceof Wrapper<Integer>); // ошибка компиляции

        /*
         * Правильный вариант — проверять объект как Wrapper<?>.
         * Знак ? означает неизвестный параметр типа.
         */
        if (object1 instanceof Wrapper<?>) {
            System.out.println("object1 является объектом Wrapper<?>");
        }

        if (object2 instanceof Wrapper<?>) {
            System.out.println("object2 является объектом Wrapper<?>");
        }

        /*
         * Тип самого Wrapper<Integer> проверить нельзя,
         * но можно получить значение из объекта и проверить уже его тип.
         */
        Object value1 = intWrapper.getItem();
        Object value2 = stringWrapper.getItem();

        if (value1 instanceof Integer) {
            System.out.println("В intWrapper хранится Integer: " + value1);
        }

        if (value2 instanceof String) {
            System.out.println("В stringWrapper хранится String: " + value2);
        }
    }
}