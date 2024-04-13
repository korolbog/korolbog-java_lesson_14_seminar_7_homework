package complexCalculator;

public class LogComplexCalculator implements ComplexCalculable {
    private ComplexCalculable decorated;
    private Loggable logger;

    public LogComplexCalculator(ComplexCalculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexCalculator add(Complex secondaryArg) {
        Complex firstArg = decorated.getResult();
        logger.log("первое значение калькулятора: " + firstArg + " Начало вызова метода add с параметром " + secondaryArg);
        ComplexCalculator result = decorated.add(secondaryArg);
        logger.log("Вызов метода add произошел успешно");
        return result;
    }

    @Override
    public ComplexCalculator mult(Complex secondaryArg) {
        Complex firstArg = decorated.getResult();
        logger.log("первое значение калькулятора: " + firstArg + " Начало вызова метода mult с параметром " + secondaryArg);
        ComplexCalculator result = decorated.mult(secondaryArg);
        logger.log("Вызов метода mult произошел успешно");
        return result;
    }

    @Override
    public ComplexCalculator div(Complex secondaryArg) {
        Complex firstArg = decorated.getResult();
        logger.log("первое значение калькулятора: " + firstArg + " Начало вызова метода div с параметром " + secondaryArg);
        ComplexCalculator result = decorated.div(secondaryArg);
        logger.log("Вызов метода div произошел успешно");
        return result;
    }

    @Override
    public Complex getResult() {
        Complex result = decorated.getResult();
        logger.log("Полученный результат: " + result);
        return result;
    }
}
