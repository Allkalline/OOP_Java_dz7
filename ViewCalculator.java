package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int realArg = promptInt("Введите вещественную часть комплексного первого числа: ");
            int imaginaryArg = promptInt("Введите мнимую часть комплексного первого числа:");
            Calculable calculator = calculableFactory.create(realArg, imaginaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int realArg2 = promptInt("Введите вещественную часть комплексного второго числа: ");
                    int imaginaryArg2 = promptInt("Введите мнимую часть комплексного второго числа:");
                    calculator.multi(realArg2,imaginaryArg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    int realArg2 = promptInt("Введите вещественную часть комплексного второго числа: ");
                    int imaginaryArg2 = promptInt("Введите мнимую часть комплексного второго числа:");
                    calculator.sum(realArg2,imaginaryArg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
