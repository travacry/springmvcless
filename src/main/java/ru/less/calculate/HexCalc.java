package ru.less.calculate;

/**
 * Created by tr1o on 28.11.17.
 */
public class HexCalc implements ICalculator {

    /**
     * Базовая реализация
     */
    private final Calculator calc;

    private String resultHex = "";

    /**
     * Конструктор
     *
     * @param calc
     */
    public HexCalc(final Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void add(final int... params) throws CalculatorException, ConvertorException {
        calc.add(getFloatArr(params));
        Integer num = Math.round(calc.getResult());
        resultHex = Integer.toHexString(num);
    }

    @Override
    public void sub(final int... params) throws CalculatorException, ConvertorException {
        calc.sub(getFloatArr(params));
        Integer num = Math.round(calc.getResult());
        resultHex = Integer.toHexString(num);
    }

    @Override
    public void div(final int... params) throws CalculatorException, ConvertorException {
        calc.div(getFloatArr(params));
        Integer num = Math.round(calc.getResult());
        resultHex = Integer.toHexString(num);
    }

    @Override
    public void mul(final int... params) throws CalculatorException, ConvertorException {
        calc.mul(getFloatArr(params));
        Integer num = Math.round(calc.getResult());
        resultHex = Integer.toHexString(num);
    }

    public String getResult() {
        return resultHex;
    }

    private float[] getFloatArr(final int... params) {
        float[] fParams = new float[params.length];
        for (int i = 0; i < params.length; i++) {
            fParams[i] = params[i];
        }
        return fParams;
    }

}
