package russian.gb.FinalHomeWorkOOP;

public class ComplexNumber {
    private double real;

    public ComplexNumber(double real) {
        this.real = real;

    }

    public double getReal() {
        return real;
    }


    @Override
    public String toString() {
        return real + "";
    }
}
