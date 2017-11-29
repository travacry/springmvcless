package calculate; /**
 * Created by tr1o on 28.11.17.
 */

import static org.junit.Assert.*;

import calculate.Calculator;
import calculate.CalculatorException;
import org.junit.Test;

/**
 * Тестирование калькулятора
 */
public class CalculatorTest {


    /**
     * Проверка сложение двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void addTwoParams() throws CalculatorException {
        Calculator calculator = new Calculator();
        calculator.add(1, 2); //3
        assertEquals(3, calculator.getResult(), 0);
    }

    /**
     * Проверка вычитание двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void subTwoParams() throws CalculatorException {
        Calculator calculator = new Calculator();
        calculator.sub(3, 1); //2
        assertEquals(2, calculator.getResult(), 0);
    }

    /**
     * Проверка деления двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void divTwoParams() throws CalculatorException {
        Calculator calculator = new Calculator();
        calculator.mul(3, 2); //6
        assertEquals(6, calculator.getResult(), 0);
    }

    /**
     * Проверка умножения двух числе
     *
     * @throws CalculatorException
     */
    @Test
    public void mulTwoParams() throws CalculatorException {
        Calculator calculator = new Calculator();
        calculator.div(8, 2);
        assertEquals(4, calculator.getResult(), 0);
    }

}
