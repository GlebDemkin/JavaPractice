enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25),
    AUTUMN("Осень", 8);

    private final String title;
    private final int averageTemperature;

    /*
     * Конструктор задаёт данные для каждого времени года.
     */
    Season(String title, int averageTemperature) {
        this.title = title;
        this.averageTemperature = averageTemperature;
    }

    public String getTitle() {
        return title;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    /*
     * Дополнительный метод перечисления.
     * Он определяет, считается ли сезон тёплым.
     */
    public boolean isWarm() {
        return averageTemperature >= 15;
    }

    /*
     * Ещё один дополнительный метод.
     * Он возвращает текстовое описание сезона.
     */
    public String getDescription() {
        if (isWarm()) {
            return title + " - тёплый сезон";
        }

        return title + " - холодный сезон";
    }
}

public class SeasonExample {
    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;

        System.out.println("Текущее время года: " + currentSeason.getTitle());
        System.out.println("Средняя температура: " + currentSeason.getAverageTemperature());
        System.out.println(currentSeason.getDescription());

        System.out.println();

        /*
         * Через switch можно выполнять разный код
         * в зависимости от значения enum.
         */
        switch (currentSeason) {
            case WINTER:
                System.out.println("Нужно одеваться теплее.");
                break;
            case SPRING:
                System.out.println("Погода становится теплее.");
                break;
            case SUMMER:
                System.out.println("Можно отдыхать на каникулах.");
                break;
            case AUTUMN:
                System.out.println("Начинается учебный год.");
                break;
        }
    }
}