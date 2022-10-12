package Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTask03 {
    public static void main(String[] args) {
        Integer[] ArreyIntArguments = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};

        Controller<Integer> iconvectorListController = new Controller<>();

        List<Integer> ArreyIntArgumentsCollection = new ArrayList<>(Arrays.asList(ArreyIntArguments));

        System.out.println(iconvectorListController.searchingSame(ArreyIntArgumentsCollection));

    }

}
