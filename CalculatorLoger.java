package calculator;

public class CalculatorLoger implements Calculable {

    private Logger log;
    private Calculable calc;

    public CalculatorLoger(Logger log, Calculable calc){
        this.log = log;
        this.calc = calc;
        log.log("Первый аргумент равен: " + calc.getResult());

    }
    @Override
    public Calculable sum(int arg, int iArg) {
        log.log("Суммируем: " + arg + " + " + iArg + "i");
        return calc.sum(arg, iArg);
    }

    @Override
    public Calculable multi(int arg, int iArg) {
        log.log("Умножаем: " + arg + " + " + iArg + "i");
        return calc.multi(arg, iArg);
    }

    @Override
    public String getResult() {
        String temp = calc.getResult();
        log.log("Полученный результат: " + temp);
        return temp;
    }
    
}
