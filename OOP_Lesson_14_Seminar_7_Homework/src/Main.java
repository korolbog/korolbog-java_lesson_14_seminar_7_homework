import complexCalculator.*;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        IComplexCalculableFactory complexCalculableFactory = new LogComplexCalculableFactory(new ConsoleLogger());
        ViewComplexCalculator view = new ViewComplexCalculator(complexCalculableFactory);
        view.run();
    }
}
