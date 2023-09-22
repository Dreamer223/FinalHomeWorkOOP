package russian.gb.FinalHomeWorkOOP;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = ComplexCalculatorFactory.createCalculator();
        CalculatorObserver observer = new CalculatorLoggingObserver();
        View view = new View();
        view.run();
    }
}