package complexCalculator;

import java.lang.Math;

public class ComplexCalculator implements ComplexCalculable {
    private Complex primaryArg;

    public ComplexCalculator(Complex primaryArg) {
        this.primaryArg = primaryArg;
    }

    public ComplexCalculator add(Complex arg) {

        primaryArg.dReal = primaryArg.dReal + arg.dReal;
        primaryArg.dImaginary = primaryArg.dImaginary + arg.dImaginary;

        return this;
    }


    public ComplexCalculator mult(Complex arg) {

        double tempdReal = primaryArg.dReal * arg.dReal - primaryArg.dImaginary * arg.dImaginary;
        primaryArg.dImaginary = primaryArg.dImaginary * arg.dReal + primaryArg.dReal * arg.dImaginary;
        primaryArg.dReal = tempdReal;
        return this;
    }


    public ComplexCalculator div(Complex arg) {
        double dR, dDen, tempReal;
        if (Math.abs(arg.dReal) >= Math.abs(arg.dImaginary)) {
            dR = arg.dImaginary / arg.dReal;
            dDen = arg.dReal + dR * arg.dImaginary;
            tempReal = (primaryArg.dReal + dR * primaryArg.dImaginary) / dDen;
            primaryArg.dImaginary = (primaryArg.dImaginary - dR * primaryArg.dReal) / dDen;
            primaryArg.dReal = tempReal;

        } else {
            dR = arg.dReal / arg.dImaginary;
            dDen = arg.dImaginary + dR * arg.dReal;
            tempReal = (dR * primaryArg.dReal + primaryArg.dImaginary) / dDen;
            primaryArg.dImaginary = (dR * primaryArg.dImaginary - primaryArg.dReal) / dDen;
            primaryArg.dReal = tempReal;
        }
        return this;
    }

    public Complex getResult() {
        return primaryArg;
    }
}