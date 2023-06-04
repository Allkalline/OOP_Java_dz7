package calculator;

public interface Calculable {
    Calculable sum(int realArg, int imaginaryArg);
    Calculable multi(int realArg, int imaginaryArg);
    String getResult();
}
