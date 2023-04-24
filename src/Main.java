import data.FileProvider;
import data.NumberFileProvider;
import exception.InvalidNumberException;
import feature.NumberWorker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileProvider<Integer> provider = new NumberFileProvider("luukitoo");

            Integer[] numbers = NumberWorker.generateFromRange(24).toArray(Integer[]::new);
            provider.writeToFile(numbers);

            try {
                NumberWorker.getNumbers(provider, 10).forEach(System.out::print);
                System.out.println("\n");
            } catch (InvalidNumberException | NumberFormatException e) {
                e.printStackTrace();
            }

            try {
                int sum = NumberWorker.getSum(provider.readFromFile(0));
                System.out.println(sum);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}