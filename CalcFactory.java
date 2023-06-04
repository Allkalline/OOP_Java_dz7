package calculator;

public class CalcFactory implements ICalculableFactory {
    Logger log;
    ICalculableFactory calculableFactory;
    
    public CalcFactory(Logger log, ICalculableFactory calculableFactory) {
        this.log = log;
        this.calculableFactory = calculableFactory;
    }

    @Override
    public Calculable create(int realArg, int iArg) {
       return new CalculatorLoger(log, calculableFactory.create(realArg, iArg));
    }
    
}
