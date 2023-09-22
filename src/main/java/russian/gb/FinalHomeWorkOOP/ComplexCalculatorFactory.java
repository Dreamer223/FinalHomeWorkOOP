package russian.gb.FinalHomeWorkOOP;

public class ComplexCalculatorFactory {
    public static Calculator createCalculator() {
        return new LoggingCalculatorDecorator(new ComplexCalculator());
    }
}
