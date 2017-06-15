import java.util.Dictionary;
import java.util.List;

public class StringSplitter {

    public static String split(String stringToSplit) {

        //TODO - implement solution
        for (int i = 1; i < stringToSplit.length(); i++) {
            String left = stringToSplit.substring(0, i);
            String right = stringToSplit.substring(i, stringToSplit.length());

            //contains(left) && DICTIONARY.contains(right)){
            //  return left + " " + right;
            //}
        }

        return stringToSplit;
    }

}
