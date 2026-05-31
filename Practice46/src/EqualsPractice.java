import java.util.Objects;

class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    /*
     * Переопределяем equals(), чтобы сравнивать студентов по содержимому,
     * а не по ссылкам на объекты в памяти.
     */
    @Override
    public boolean equals(Object obj) {
        // Если сравниваем объект с самим собой, они точно равны.
        if (this == obj) {
            return true;
        }

        // Если obj равен null или классы объектов разные, объекты не равны.
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        /*
         * После проверки класса можно безопасно привести Object к Student.
         * Это нужно, чтобы получить доступ к полям name, age и group.
         */
        Student student = (Student) obj;

        /*
         * Сравниваем все значимые поля объекта.
         * Для строк используем Objects.equals(), чтобы корректно обработать null.
         */
        return age == student.age
                && Objects.equals(name, student.name)
                && Objects.equals(group, student.group);
    }

    /*
     * Если переопределяется equals(), нужно переопределить и hashCode().
     * Равные объекты должны иметь одинаковый hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", group='" + group + "'}";
    }
}

public class EqualsPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Глеб", 19, "5030102/40001");
        Student student2 = new Student("Глеб", 19, "5030102/40001");
        Student student3 = new Student("Иван", 20, "5030102/40003");

        System.out.println("student1:");
        System.out.println(student1);

        System.out.println("\nstudent2:");
        System.out.println(student2);

        System.out.println("\nstudent3:");
        System.out.println(student3);

        /*
         * Оператор == сравнивает ссылки.
         * student1 и student2 — разные объекты в памяти, поэтому результат false.
         */
        System.out.println("\nstudent1 == student2: " + (student1 == student2));

        /*
         * Метод equals() сравнивает содержимое объектов.
         * student1 и student2 имеют одинаковые поля, поэтому результат true.
         */
        System.out.println("student1.equals(student2): " + student1.equals(student2));

        /*
         * У student1 и student3 разные поля, поэтому equals() вернёт false.
         */
        System.out.println("student1.equals(student3): " + student1.equals(student3));

        /*
         * Сравнение с null должно возвращать false.
         */
        System.out.println("student1.equals(null): " + student1.equals(null));
    }
}