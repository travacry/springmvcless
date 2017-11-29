/**
 * Created by tr1o on 28.11.17.
 */
public interface ICalculator {

    /**
     * Сложение аргументов
     *
     * @param params
     */
    void add(final int... params) throws CalculatorException, ConvertorException;

    /**
     * Вычитание агрументов
     *
     * @param params
     */
    void sub(final int... params) throws CalculatorException, ConvertorException;

    /**
     * Деление аргументов
     *
     * @param params
     */
    void div(final int... params) throws CalculatorException, ConvertorException;

    /**
     * Пермножение аргуметов
     *
     * @param params
     */
    void mul(final int... params) throws CalculatorException, ConvertorException;

}