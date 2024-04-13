package complexCalculator;

public class Complex {
    double dReal, dImaginary;

    public Complex(double dReal, double dImaginary) {
        this.dReal = dReal; // Действительное
        this.dImaginary = dImaginary; // Мнимое
    }

    public String toString() {
        if (dImaginary >= 0)
            return dReal + "+" + dImaginary + "i";
        else
            return dReal + "-" + -dImaginary + "i";
    }
}