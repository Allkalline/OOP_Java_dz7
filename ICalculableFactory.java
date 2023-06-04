package calculator;

public interface ICalculableFactory {
    Calculable create(int realArg, int imaginaryArg);
}
