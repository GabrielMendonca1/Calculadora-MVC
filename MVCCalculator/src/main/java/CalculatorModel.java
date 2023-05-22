public class CalculatorModel {
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor nao pode ser 0");
        }
        return dividend / divisor;
    }
}