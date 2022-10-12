package Task01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTask0405 {
    public static void main(String[] args) {
        String [] Tolstoy = (

                "Arriving in Kyiv, Pierre called all the managers to the main office and explained to them his" +
                        " intentions and desires. He told them that measures would be taken immediately for the complete " +
                        "emancipation of the peasants from serfdom, that until then the peasants should not be burdened with " +
                        "work, that women with children should not be sent to work, that assistance should be given to the " +
                        "peasants, that punishments should be used. exhortations, and not bodily ones, that hospitals, asylums "
                        + "and schools should be established on every estate. Some managers (there were also semi-literate " +
                        "housekeepers) listened frightened, assuming the meaning of the speech was that the young count was" +
                        " dissatisfied with their management and concealment of money; others, after the first fear, found " +
                        "Pierre's lisping and new, unheard-of words amusing; still others simply found the pleasure of " +
                        "listening to the master speak; the fourth, the most intelligent, including the chief manager, " +
                        "understood from this speech how to deal with the master in order to achieve their " +
                        "goals").split(" ");

        Controller<String> searchForUniqueWords = new Controller<>();
        List<String> TolstoyToArrayList = new ArrayList<>(Arrays.asList(Tolstoy));

        List<String> searchForUniqueWordsInCollection = searchForUniqueWords.searchingSame(TolstoyToArrayList);
        searchForUniqueWords.calcOccurrence(TolstoyToArrayList, searchForUniqueWordsInCollection);

        searchForUniqueWords.calcOccurrenceStructure(TolstoyToArrayList, searchForUniqueWordsInCollection);
    }
}
