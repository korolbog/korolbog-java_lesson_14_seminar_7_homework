package complexCalculator;

import java.util.Scanner;

public class ViewComplexCalculator {
    private IComplexCalculableFactory complexCalculableFactory;

    public ViewComplexCalculator(IComplexCalculableFactory complexCalculableFactory) {
        this.complexCalculableFactory = complexCalculableFactory;
    }

    public void run() {
        while (true) {
            double dReal = promptDouble("Введите действительную часть первого комплексного числа: ");
            double dImaginary = promptDouble("Введите мнимую часть первого комплексного числа: ");
            Complex primaryArg = new Complex(dReal, dImaginary);
            ComplexCalculable complexCalculator = complexCalculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    Complex secondaryArg = createSecondaryArg();
                    complexCalculator.mult(secondaryArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    Complex secondaryArg = createSecondaryArg();
                    complexCalculator.add(secondaryArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    Complex secondaryArg = createSecondaryArg();
                    complexCalculator.div(secondaryArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    Complex result = complexCalculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }

    private Complex createSecondaryArg() {
        double dReal = promptDouble("Введите действительную часть второго комплексного числа: ");
        double dImaginary = promptDouble("Введите мнимую часть второго комплексного числа: ");
        return new Complex(dReal, dImaginary);
    }
}
