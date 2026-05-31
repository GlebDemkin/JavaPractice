public class StringConversionPractice {
    public static void main(String[] args) {
        /*
         * String является неизменяемым классом.
         * StringBuilder и StringBuffer являются изменяемыми.
         * Между этими типами можно выполнять преобразования.
         */

        String stringValue = "Java";

        // String -> StringBuilder через конструктор.
        StringBuilder builderFromString = new StringBuilder(stringValue);
        System.out.println("String -> StringBuilder: " + builderFromString);

        // String -> StringBuffer через конструктор.
        StringBuffer bufferFromString = new StringBuffer(stringValue);
        System.out.println("String -> StringBuffer: " + bufferFromString);

        // StringBuilder -> String через метод toString().
        String stringFromBuilder = builderFromString.toString();
        System.out.println("StringBuilder -> String: " + stringFromBuilder);

        // StringBuffer -> String через метод toString().
        String stringFromBuffer = bufferFromString.toString();
        System.out.println("StringBuffer -> String: " + stringFromBuffer);

        // StringBuilder -> StringBuffer через строковое представление.
        StringBuffer bufferFromBuilder = new StringBuffer(builderFromString.toString());
        System.out.println("StringBuilder -> StringBuffer: " + bufferFromBuilder);

        // StringBuffer -> StringBuilder через строковое представление.
        StringBuilder builderFromBuffer = new StringBuilder(bufferFromString.toString());
        System.out.println("StringBuffer -> StringBuilder: " + builderFromBuffer);

        /*
         * После преобразования можно изменять StringBuilder и StringBuffer.
         * Исходный объект String при этом не изменяется.
         */
        builderFromString.append(" Builder");
        bufferFromString.append(" Buffer");

        System.out.println();
        System.out.println("После изменения:");
        System.out.println("Исходный String: " + stringValue);
        System.out.println("StringBuilder: " + builderFromString);
        System.out.println("StringBuffer: " + bufferFromString);
    }
}