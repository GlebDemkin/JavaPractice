public class StringBuilderBufferMethods {
    public static void main(String[] args) {
        /*
         * StringBuilder и StringBuffer похожи по набору методов.
         * Главное отличие: StringBuffer потокобезопасный, а StringBuilder быстрее,
         * но не синхронизирован для многопоточного доступа.
         */

        System.out.println("Методы StringBuilder:");
        StringBuilder builder = new StringBuilder("Java");

        // append() добавляет текст в конец строки.
        builder.append(" language");
        System.out.println("append(): " + builder);

        // insert() вставляет текст по указанному индексу.
        builder.insert(5, "programming ");
        System.out.println("insert(): " + builder);

        // replace() заменяет часть строки от начального индекса до конечного.
        builder.replace(0, 4, "C++");
        System.out.println("replace(): " + builder);

        // delete() удаляет часть строки от начального индекса до конечного.
        builder.delete(3, 15);
        System.out.println("delete(): " + builder);

        // charAt() возвращает символ по индексу.
        System.out.println("charAt(0): " + builder.charAt(0));

        // setCharAt() заменяет символ по указанному индексу.
        builder.setCharAt(0, 'J');
        System.out.println("setCharAt(): " + builder);

        // length() возвращает текущую длину строки.
        System.out.println("length(): " + builder.length());

        // capacity() возвращает текущую вместимость внутреннего массива.
        System.out.println("capacity(): " + builder.capacity());

        // substring() возвращает часть строки, не изменяя исходный объект.
        System.out.println("substring(0, 4): " + builder.substring(0, 4));

        // reverse() разворачивает строку в обратном порядке.
        builder.reverse();
        System.out.println("reverse(): " + builder);

        System.out.println();

        System.out.println("Методы StringBuffer:");
        StringBuffer buffer = new StringBuffer("Java");

        // append() добавляет текст в конец строки.
        buffer.append(" language");
        System.out.println("append(): " + buffer);

        // insert() вставляет текст по указанному индексу.
        buffer.insert(5, "programming ");
        System.out.println("insert(): " + buffer);

        // replace() заменяет часть строки от начального индекса до конечного.
        buffer.replace(0, 4, "C++");
        System.out.println("replace(): " + buffer);

        // delete() удаляет часть строки от начального индекса до конечного.
        buffer.delete(3, 15);
        System.out.println("delete(): " + buffer);

        // charAt() возвращает символ по индексу.
        System.out.println("charAt(0): " + buffer.charAt(0));

        // setCharAt() заменяет символ по указанному индексу.
        buffer.setCharAt(0, 'J');
        System.out.println("setCharAt(): " + buffer);

        // length() возвращает текущую длину строки.
        System.out.println("length(): " + buffer.length());

        // capacity() возвращает текущую вместимость внутреннего массива.
        System.out.println("capacity(): " + buffer.capacity());

        // substring() возвращает часть строки, не изменяя исходный объект.
        System.out.println("substring(0, 4): " + buffer.substring(0, 4));

        // reverse() разворачивает строку в обратном порядке.
        buffer.reverse();
        System.out.println("reverse(): " + buffer);
    }
}