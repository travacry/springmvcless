import java.util.Calendar;

/**
 * Created by tr1o on 27.11.17.
 */
public class Calculate {

    public static void main(String[] args) {
//        System.out.println("calculate");
//        int first = Integer.valueOf(args[0]);
//        int second = Integer.valueOf(args[1]);
//        int sum = first + second;
//        System.out.println("Sum : " + sum);

        Calculate calc = new Calculate();

        float first = Float.valueOf(args[0]);
        float second = Float.valueOf(args[1]);

        System.out.println(calc.add(first,second));
        System.out.println(calc.sub(first,second));
        System.out.println(calc.div(first,second));
        System.out.println(calc.sub(first,second));
        System.out.println(calc.mul(first,second));
    }

    float add(float a, float b) {
        return a += b;
    }

    float sub(float a, float b) {
        if (a >= b)
            return a - b;
        else
            return -1;
    }

    float div(float a, float b) {
        if (b != 0) {
            return a/b;
        }
        return -1;
    }

    float mul(float a, float b) {
        return a *= b;
    }
}
