package complexCalculator;

public class ComplexCalculableFactory implements IComplexCalculableFactory {
    public ComplexCalculable create(Complex primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}
