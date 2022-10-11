import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {


        CalcOccurrence<String> stringListDataWork = new CalcOccurrence<>();

        String[] dataList = "checkLis/aper/corn/paper/corn/apricots/bread/cleaner/rice/vegetables/salt".split("/");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(dataList));

        System.out.println(stringListDataWork.countOccurance(list,"corn"));


    }
}


//    // Let us create a list with 4 items

//    ArrayList<String> list = new ArrayList<String>();
//
//        list.add("code");
//        list.add("code");
//        list.add("quiz");
//        list.add("code");
//
//                // count the frequency of the word "code"
//                System.out.println("The frequency of the word code is: "+
//                Collections.frequency(list, "code"));