package russian.gb.FinalHomeWorkOOP;

public class ComplexNumber {
    private double real;

    public ComplexNumber(double real) {
        this.real = real;
//        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

//    public double getImaginary() {
//        return imaginary;
//    }

    @Override
    public String toString() {
        return real + "";
    }
}
