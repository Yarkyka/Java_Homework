package feature;

import data.FileProvider;
import exception.InvalidNumberException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberWorker {

    private NumberWorker() { }

    public static List<Integer> getNumbers(
        FileProvider<Integer> fileProvider,
        int limit
    ) throws IOException, InvalidNumberException {
        var numbers = fileProvider.readFromFile(limit);
        for (Integer number : numbers) {
            if (number < 0) throw new InvalidNumberException();
        }
        return numbers;
    }

    public static int getSum(List<Integer> numberList) {
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> generateFromRange(int range) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
