package data;

import java.io.IOException;
import java.util.List;

public interface FileProvider<T> {

    void writeToFile(T... writable) throws IOException;

    List<T> readFromFile(int limit) throws IOException;
}