import java.awt.*;
import java.util.Collections;
import java.util.List;

public class CalcOccurrence <T> {

public int countOccurance(List<T> inputSentences, T dataOccurrence) {
    return Collections.frequency(inputSentences, dataOccurrence);

    }
}
