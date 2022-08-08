package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double target1 = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        int summa = (int) target1;
        return summa;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double target2 = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        int multy = (int) target2;
        return multy;
    }

    @Override
    public int pow(int a, int b) {
        double target3 = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        int pow = (int) target3;
        return pow;
    }
}
