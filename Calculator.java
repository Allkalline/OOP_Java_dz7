package calculator;

public final class Calculator implements Calculable {

    private int realArg;
    private int imaginaryArg;

    public Calculator(int realArg, int imaginaryArg) {
        this.realArg = realArg;
        this.imaginaryArg = imaginaryArg;
    }

    @Override
    public Calculable sum(int arg, int iArg) {
        realArg += arg;
        imaginaryArg += iArg;
        return this;
    }

    @Override
    public Calculable multi(int arg, int iArg) {
        int a = realArg;
        realArg = realArg * arg - imaginaryArg * iArg;
        imaginaryArg = imaginaryArg * arg + a * iArg;
        
        
        return this;
    }

    @Override
    public String getResult() {
        return String.format("%d + %di", this.realArg, this.imaginaryArg);
    }
}
