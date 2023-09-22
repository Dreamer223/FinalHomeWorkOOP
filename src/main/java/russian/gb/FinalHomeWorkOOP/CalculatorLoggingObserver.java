package russian.gb.FinalHomeWorkOOP;

public class CalculatorLoggingObserver implements CalculatorObserver{
    @Override
    public void update(String operation, ComplexNumber result) {
        System.out.println("Operation: " + operation);
        System.out.println("Result: " + result);
    }
}
