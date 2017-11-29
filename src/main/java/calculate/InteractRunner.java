package calculate;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by tr1o on 27.11.17.
 */
public class InteractRunner {

    public static void main(String[] args) {

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8))
        ) {
            Calculator calculate = new Calculator();
            String exit = "";
            while (!exit.equals("yes")) {
                try {
                    Float valFirst, valSecond;
                    valFirst = getInParam(bufferedReader, "first");
                    valSecond = getInParam(bufferedReader, "second");

                    calculate.div(valFirst, valSecond);
                    System.out.println("result : " + calculate.getResult());
                    calculate.clearResult();
                    System.out.println("Exit: yes/no");
                    exit = bufferedReader.readLine();
                } catch (CalculatorException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Получить параметр
     * @param bufferedReader
     * @param msg
     * @return
     * @throws IOException
     */
    private static Float getInParam(BufferedReader bufferedReader, String msg) throws IOException {

        while (true) {
            try {
                System.out.println("Enter "+msg+" arg : ");
                String param = bufferedReader.readLine();
                return Float.valueOf(param);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
