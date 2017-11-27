import java.util.Calendar;

/**
 * Created by tr1o on 27.11.17.
 */
public class Calculate {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        float first = Float.valueOf(args[0]);
        float second = Float.valueOf(args[1]);

        calc.add(first,second);
        System.out.println(calc.getResult());
        calc.sub(first,second);
        System.out.println(calc.getResult());
        calc.div(first,second);
        System.out.println(calc.getResult());
        calc.mul(first,second);
        System.out.println(calc.getResult());
    }
}
