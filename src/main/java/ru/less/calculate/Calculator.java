package ru.less.calculate; /**
 * Created by tr1o on 27.11.17.
 */

/**
 * Калькулятор
 */
public class Calculator {

    private float result;

    /**
     * Сложение аргументов
     * @param params
     */
    void add(final float ... params) throws CalculatorException {
        if (params.length > 0) {
            for (float param : params) {
                result += param;
            }
        } else
            throw new CalculatorException("Error, you must enter min two arguments");
    }

    /**
     * Вычитание агрументов
     * @param params
     */
    void sub(final float ... params) throws CalculatorException {
        if (params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                if (i == 0) result = params[i];
                else result -= params[i];
            }
        } else
            throw new CalculatorException("Error, you must enter min two arguments");
    }

    /**
     * Деление аргументов
     * @param params
     */
    void div(final float ... params) throws CalculatorException {
        if (params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                if (params[i] == 0) {
                    // runtime exception
                    throw new IllegalArgumentException("Error, You try to div on 0");
                }
                if (i == 0) result = params[i];
                else result /= params[i];
            }
        } else
            throw new CalculatorException("Error, you must enter min two arguments");
    }

    /**
     * Пермножение аргуметов
     * @param params
     */
    void mul(final float ... params) throws CalculatorException {
        Float val = null;
        if (params.length > 0) {
            for (Float param : params) {
                if (val == null) val = param;
                else val *= param;
            }
            result = val;
        } else
            throw new CalculatorException("Error, you must enter min two arguments");
    }

    /**
     * Получить результат
     * @return
     */
    float getResult() {
        return result;
    }

    /**
     * Очистить результаты вычислений
     */
    void clearResult() {
        result = 0;
    }

}
