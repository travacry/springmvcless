/**
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
    void add(float ... params) throws CalculatorException {
        if (params.length > 0) {
            for (Float param : params) {
                result += param;
            }
        } else
            throw new CalculatorException("Error, you must enter min two arguments");
    }

    /**
     * Вычитание агрументов
     * @param params
     */
    void sub(float ... params) throws CalculatorException {
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
    void div(float ... params) throws CalculatorException {
        if (params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                if (params[i] == 0) {
                    throw new CalculatorException("Error, You try to div on 0");
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
    void mul(float ... params) throws CalculatorException {
        if (params.length > 0) {
            Float val = null;
            for (Float param : params) {
                if (val == null) val = param;
                else val *= param;
            }
            if (val != null) result = val;
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
