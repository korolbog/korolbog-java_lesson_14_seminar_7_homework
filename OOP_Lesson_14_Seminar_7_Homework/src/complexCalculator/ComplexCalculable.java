package complexCalculator;

public interface ComplexCalculable {
    ComplexCalculator add(Complex arg);

    ComplexCalculator mult(Complex arg);

    ComplexCalculator div(Complex arg);

    Complex getResult();
}
