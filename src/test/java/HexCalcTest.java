import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tr1o on 29.11.17.
 */
public class HexCalcTest {

    /**
     * Проверка сложение двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void addTwoParams() throws CalculatorException, ConvertorException {
        HexCalc hexCalc = new HexCalc(new Calculator());
        hexCalc.add(15, 348, 55);
        assertEquals("", hexCalc.getResult(), "1a2");
    }

    /**
     * Проверка вычитание двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void subTwoParams() throws CalculatorException, ConvertorException {
        HexCalc hexCalc = new HexCalc(new Calculator());
        hexCalc.sub(240, 48, 55);
        assertEquals("", hexCalc.getResult(), "89");
    }

    /**
     * Проверка деления двух чисел
     *
     * @throws CalculatorException
     */
    @Test
    public void divTwoParams() throws CalculatorException, ConvertorException {
        HexCalc hexCalc = new HexCalc(new Calculator());
        hexCalc.div(240, 2, 3);
        assertEquals("", hexCalc.getResult(), "28");
    }

    /**
     * Проверка умножения двух числе
     *
     * @throws CalculatorException
     */
    @Test
    public void mulTwoParams() throws CalculatorException, ConvertorException {
        HexCalc hexCalc = new HexCalc(new Calculator());
        hexCalc.mul(2, 8, 5);
        assertEquals("", hexCalc.getResult(), "50");
    }
}
