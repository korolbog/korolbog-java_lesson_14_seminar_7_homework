package calculator;

public class LogCalculableFactory implements calculator.ICalculableFactory {
    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
