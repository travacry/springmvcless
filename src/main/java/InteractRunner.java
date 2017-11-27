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
            Calculate calculate = new Calculate();
            String exit = "";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
                String first = bufferedReader.readLine();
                System.out.println("Enter second arg : ");
                String second = bufferedReader.readLine();
                calculate.add(Float.valueOf(first), Float.valueOf(second));
                System.out.println("getResult : "+ calculate.getResult());
                calculate.clearResult();
                System.out.println("Exit: yes/no");
                exit = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
