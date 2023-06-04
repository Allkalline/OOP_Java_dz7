package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int realArg, int imaginaryArg) {
        return new Calculator(realArg, imaginaryArg);
    }
}
