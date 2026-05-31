class StaticParent {
    /*
     * Статический метод принадлежит классу StaticParent,
     * а не конкретному объекту этого класса.
     */
    public static void printInfo() {
        System.out.println("Статический метод StaticParent");
    }

    /*
     * Обычный нестатический метод принадлежит объекту.
     * Поэтому для него работает динамический полиморфизм.
     */
    public void printObjectInfo() {
        System.out.println("Обычный метод StaticParent");
    }
}

class StaticChild extends StaticParent {
    /*
     * Это не переопределение, а скрытие статического метода.
     * Аннотацию @Override здесь поставить нельзя.
     */

    // @Override // ошибка компиляции
    public static void printInfo() {
        System.out.println("Статический метод StaticChild");
    }

    /*
     * А это настоящее переопределение обычного метода.
     * Здесь @Override использовать можно.
     */
    @Override
    public void printObjectInfo() {
        System.out.println("Обычный метод StaticChild");
    }
}

public class StaticPolymorphismPractice {
    public static void main(String[] args) {
        System.out.println("Вызов статических методов через имена классов:");

        StaticParent.printInfo();
        StaticChild.printInfo();

        System.out.println();

        /*
         * Переменная parent имеет тип StaticParent,
         * но реальный объект создан как StaticChild.
         */
        StaticParent parent = new StaticChild();

        System.out.println("Вызов статического метода через ссылку:");

        /*
         * Статический метод выбирается по типу переменной,
         * а не по реальному типу объекта.
         *
         * Тип переменной — StaticParent,
         * поэтому вызывается StaticParent.printInfo().
         */
        parent.printInfo();

        System.out.println();

        System.out.println("Вызов обычного переопределённого метода:");

        /*
         * Обычный метод выбирается по реальному типу объекта.
         * Реальный объект — StaticChild,
         * поэтому вызывается StaticChild.printObjectInfo().
         */
        parent.printObjectInfo();
    }
}