public class FinallyPractice {
    public static void main(String[] args) {
        /*
         * Практика 1.
         * try без catch и finally использовать нельзя.
         * Такой код не скомпилируется.
         */

        // try {
        //     System.out.println("try без catch и finally");
        // }

        System.out.println("Практика 1:");
        System.out.println("try без catch и finally использовать нельзя.");
        System.out.println("После try должен быть хотя бы catch или finally.");

        System.out.println();

        /*
         * Практика 2.
         * try только с finally использовать можно.
         * Блок finally выполнится в любом случае.
         */
        System.out.println("Практика 2:");

        try {
            System.out.println("Выполняется блок try.");
        } finally {
            System.out.println("Выполняется блок finally.");
        }

        System.out.println();

        /*
         * Практика 3.
         * У одного try не может быть двух finally.
         * Такой код не скомпилируется.
         */

        // try {
        //     System.out.println("try с двумя finally");
        // } finally {
        //     System.out.println("Первый finally");
        // } finally {
        //     System.out.println("Второй finally");
        // }

        System.out.println("Практика 3:");
        System.out.println("У одного try может быть только один finally.");

        /*
         * Если нужно выполнить несколько действий после try,
         * их можно записать внутри одного блока finally.
         */
        try {
            System.out.println("Выполняется try.");
        } finally {
            System.out.println("Первое действие в finally.");
            System.out.println("Второе действие в finally.");
        }
    }
}