class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // Переопределяем toString(), чтобы объект User выводился как имя,
    // а не как стандартная строка вида User@4617c264.
    @Override
    public String toString() {
        return name;
    }
}

public class StringPlus {
    public static void main(String[] args) {
        User user = new User("Глеб");

        int age = 19;
        float height = 1.83F;
        boolean isTaskSubmitted = true;
        char grade = 'A';

        String info = "Пользователь: " + user
            + ", \nвозраст: " + age 
            + ", \nрост: " + height 
            + ", \nзадание сдано: " +  isTaskSubmitted 
            + ", \nоценка: " + grade;

        System.out.println("\nСоединение строки с переменными разных типов:");
        System.out.println(info);

        int a = 10;
        int b = 5;

        System.out.println("\nОтличие сложения чисел от соединения строк:");
        System.out.println("Без скобок: " + a + b);
        System.out.println("Со скобками: " + (a + b));
    }
}
