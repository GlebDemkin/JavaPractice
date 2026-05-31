public class TextBlockPractice {
    public static void main(String[] args) {
        /*
         * Три двойные кавычки создают text block.
         * Text block удобен для многострочных строк.
         */
        String message = """
                Это первая строка.
                Это вторая строка.
                Это третья строка.
                """;

        System.out.println("Обычный многострочный текст:");
        System.out.println(message);

        /*
         * Text block удобно использовать для HTML, JSON, SQL
         * и другого текста, где важна структура строк.
         */
        String html = """
                <html>
                    <body>
                        <h1>Hello Java</h1>
                    </body>
                </html>
                """;

        System.out.println("HTML-текст:");
        System.out.println(html);

        /*
         * Без text block такой текст пришлось бы писать
         * через обычные строки, символы переноса \\n и конкатенацию.
         */
        String oldStyle = "<html>\n"
                + "    <body>\n"
                + "        <h1>Hello Java</h1>\n"
                + "    </body>\n"
                + "</html>";

        System.out.println("Та же строка без text block:");
        System.out.println(oldStyle);
    }
}