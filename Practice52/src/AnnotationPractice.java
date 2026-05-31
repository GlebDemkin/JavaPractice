import java.util.ArrayList;
import java.util.List;

class ParentPrinter {
    public void printMessage() {
        System.out.println("Метод родительского класса");
    }
}

class ChildPrinter extends ParentPrinter {
    /*
     * @Override показывает, что метод должен переопределять
     * метод родительского класса.
     *
     * Если ошибиться в названии метода или параметрах,
     * компилятор сразу покажет ошибку.
     */
    @Override
    public void printMessage() {
        System.out.println("Метод дочернего класса");
    }
}

class OldPrinter {
    /*
     * @Deprecated помечает метод как устаревший.
     * Такой метод всё ещё работает, но его не рекомендуется
     * использовать в новом коде.
     */
    @Deprecated
    public void oldPrint() {
        System.out.println("Устаревший метод oldPrint()");
    }

    public void newPrint() {
        System.out.println("Новый метод newPrint()");
    }
}

public class AnnotationPractice {
    /*
     * @SuppressWarnings отключает выбранные предупреждения компилятора.
     *
     * Здесь специально отключаются предупреждения:
     * deprecation — вызов устаревшего метода;
     * rawtypes — использование коллекции без generic-типа;
     * unchecked — небезопасные операции с коллекцией.
     */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static void main(String[] args) {
        System.out.println("Пример @Override:");

        ParentPrinter printer = new ChildPrinter();
        printer.printMessage();

        System.out.println();

        System.out.println("Пример @Deprecated:");

        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.oldPrint();
        oldPrinter.newPrint();

        System.out.println();

        System.out.println("Пример @SuppressWarnings:");

        /*
         * Здесь намеренно используется raw-тип List.
         * Обычно так писать не рекомендуется, но это нужно
         * для демонстрации работы @SuppressWarnings.
         */
        List list = new ArrayList();

        list.add("Gleb");
        list.add(123);
        list.add(true);

        System.out.println(list);
    }
}