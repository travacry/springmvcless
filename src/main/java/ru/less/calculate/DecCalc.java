package ru.less.calculate;

/**
 * Created by tr1o on 28.11.17.
 */
public class DecCalc implements ICalculator {

    /**
     * Базовая реализация
     */
    private final Calculator calc;


    /**
     * Конструктор
     *
     * @param calc
     */
    public DecCalc(final Calculator calc) {
        this.calc = calc;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(int ... params) throws CalculatorException, ConvertorException {
        calc.add(Convertor.IntToFloat(params));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sub(int... params) throws CalculatorException, ConvertorException {
        calc.sub(Convertor.IntToFloat(params));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void div(int... params) throws CalculatorException, ConvertorException {
        calc.div(Convertor.IntToFloat(params));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mul(int... params) throws CalculatorException, ConvertorException {
        calc.mul(Convertor.IntToFloat(params));
    }
}
