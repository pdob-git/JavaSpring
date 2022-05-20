package pl.pdob.calc;

class CalculatorService {
    static double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Nieobsługiwany operator matematyczny");
        }
    }
}
