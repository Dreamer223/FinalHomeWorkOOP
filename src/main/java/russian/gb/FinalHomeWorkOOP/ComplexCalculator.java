package russian.gb.FinalHomeWorkOOP;

public class ComplexCalculator implements Calculator{
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realSum = a.getReal() + b.getReal();

        return new ComplexNumber(realSum);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realProduct = a.getReal() * b.getReal();
        double imaginaryProduct = a.getReal() * b.getReal();
        return new ComplexNumber(realProduct);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double realQuotient = a.getReal() / b.getReal();
        return new ComplexNumber(realQuotient);
    }
}
