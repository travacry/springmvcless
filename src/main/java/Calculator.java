/**
 * Created by tr1o on 27.11.17.
 */
public class Calculator {

    private float result;

    /**
     * Сложение аргументов
     * @param params
     */
    void add(float ... params) {
        for (Float param: params) {
            result += param;
        }
    }

    /**
     * Вычитание агрументов
     * @param params
     */
    void sub(float ... params) {
        for (int i = 0; i < params.length; i++) {
            if (i == 0) result = params[i];
            else result -= params[i];
        }
    }

    /**
     * Деление аргументов
     * @param params
     */
    void div(float ... params) {
        for (int i = 0; i < params.length; i++) {
            if (params[i] == 0) result = 0;
            if (i == 0) result = params[i];
            else result /= params[i];
        }
    }

    /**
     * Пермножение аргуметов
     * @param params
     */
    void mul(float ... params) {
        for (Float param: params) {
            result *= param;
        }
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
