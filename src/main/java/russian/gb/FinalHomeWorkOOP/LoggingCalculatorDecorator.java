package russian.gb.FinalHomeWorkOOP;

public class LoggingCalculatorDecorator implements CalculatorDecorator{
    private Calculator calculator;

    public LoggingCalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        System.out.println("Added " + a + " and " + b + " to get " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        System.out.println("Multiplied " + a + " by " + b + " to get " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        System.out.println("Divided " + a + " by " + b + " to get " + result);
        return result;
    }
}
