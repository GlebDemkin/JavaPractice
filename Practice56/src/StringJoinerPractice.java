import java.util.StringJoiner;

public class StringJoinerPractice {
    public static void main(String[] args) {
        /*
         * StringJoiner используется для объединения строк
         * с заданным разделителем.
         */
        StringJoiner names = new StringJoiner(", ");

        names.add("Глеб");
        names.add("Иван");
        names.add("Анна");

        System.out.println("Список имён:");
        System.out.println(names);

        /*
         * Можно указать не только разделитель,
         * но и префикс с суффиксом.
         */
        StringJoiner languages = new StringJoiner(", ", "[", "]");

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("\nСписок языков:");
        System.out.println(languages);

        /*
         * setEmptyValue() задаёт строку, которая будет выведена,
         * если в StringJoiner не добавили ни одного элемента.
         */
        StringJoiner emptyJoiner = new StringJoiner(", ");
        emptyJoiner.setEmptyValue("Список пуст");

        System.out.println("\nПустой StringJoiner:");
        System.out.println(emptyJoiner);

        /*
         * merge() объединяет данные из одного StringJoiner с другим.
         */
        StringJoiner firstGroup = new StringJoiner(", ");
        firstGroup.add("1").add("2").add("3");

        StringJoiner secondGroup = new StringJoiner(", ");
        secondGroup.add("4").add("5").add("6");

        firstGroup.merge(secondGroup);

        System.out.println("\nПосле merge():");
        System.out.println(firstGroup);
    }
}