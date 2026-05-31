class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class MultipleCatchPractice {
    public static void main(String[] args) {
        System.out.println("Ситуация 1 - одинаковая обработка разных исключений:");
        handleDifferentExceptions(1);
        handleDifferentExceptions(2);

        System.out.println();

        System.out.println("Ситуация 2 - обработка исключений из одной иерархии:");
        handleExceptionHierarchy(1);
        handleExceptionHierarchy(2);
        handleExceptionHierarchy(3);
    }

    public static void handleDifferentExceptions(int variant) {
        /*
         * ArithmeticException и NullPointerException не находятся
         * в одной прямой цепочке наследования.
         *
         * Поэтому их можно объединить в одном catch через оператор |,
         * если обработка одинаковая.
         */
        try {
            if (variant == 1) {
                int result = 10 / 0;
                System.out.println(result);
            } else {
                String text = null;
                System.out.println(text.length());
            }
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Исключение обработано одинаково: " + e.getClass().getSimpleName());
        }
    }

    public static void handleExceptionHierarchy(int variant) {
        /*
         * Ex3 наследуется от Ex2, а Ex2 наследуется от Ex1.
         *
         * При обработке исключений из одной иерархии catch-блоки
         * нужно располагать от более конкретного типа к более общему.
         */
        try {
            if (variant == 1) {
                throw new Ex1("Ошибка Ex1");
            } else if (variant == 2) {
                throw new Ex2("Ошибка Ex2");
            } else {
                throw new Ex3("Ошибка Ex3");
            }
        } catch (Ex3 e) {
            System.out.println("Обработан Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Обработан Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Обработан Ex1: " + e.getMessage());
        }

        /*
         * Так писать нельзя:
         *
         * catch (Ex1 | Ex2 | Ex3 e) {
         * }
         *
         * Причина: Ex1, Ex2 и Ex3 находятся в одной цепочке наследования.
         */
    }
}