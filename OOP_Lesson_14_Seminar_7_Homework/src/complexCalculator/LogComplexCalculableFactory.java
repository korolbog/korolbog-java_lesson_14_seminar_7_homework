package complexCalculator;

public class LogComplexCalculableFactory implements IComplexCalculableFactory {
    private Loggable logger;

    public LogComplexCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexCalculable create(Complex primaryArg) {
        return new LogComplexCalculator(new ComplexCalculator(primaryArg), logger);
    }
}
