class BasicReport {
    /*
     * Метод родительского класса.
     * Подкласс сможет переопределить его, сохранив такое же название,
     * такие же параметры и совместимый тип возвращаемого значения.
     */
    public String getTitle() {
        return "Обычный отчёт";
    }

    /*
     * Метод возвращает Number.
     * В подклассе можно вернуть более конкретный тип, например Integer.
     */
    public Number getPagesCount() {
        return 1;
    }

    public void printInfo() {
        System.out.println("Информация из BasicReport");
    }
}

class PdfReport extends BasicReport {
    /*
     * Переопределение метода.
     * Название, параметры и тип возвращаемого значения совпадают.
     */
    @Override
    public String getTitle() {
        return "PDF-отчёт";
    }

    /*
     * Это тоже корректное переопределение.
     * Integer является наследником Number, поэтому такой возвращаемый тип допустим.
     * Это называется ковариантный возвращаемый тип.
     */
    @Override
    public Integer getPagesCount() {
        return 10;
    }

    @Override
    public void printInfo() {
        System.out.println("Информация из PdfReport");
    }

    /*
     * Так писать нельзя.
     * В родительском классе getTitle() возвращает String.
     * Если здесь вернуть Integer, Java выдаст ошибку компиляции.
     */
    // @Override
    // public Integer getTitle() {
    //     return 123;
    // }
}

public class OverridingPractice {
    public static void main(String[] args) {
        /*
         * Переменная имеет тип BasicReport,
         * но реальный объект имеет тип PdfReport.
         * Поэтому при вызове методов используются версии из PdfReport.
         */
        BasicReport report = new PdfReport();

        System.out.println(report.getTitle());
        System.out.println("Количество страниц: " + report.getPagesCount());
        report.printInfo();
    }
}