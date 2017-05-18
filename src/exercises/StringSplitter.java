import java.util.Dictionary;

public class StringSplitter{

    public static String split(String stringToSplit){

        for (int i = 1; i < stringToSplit.length() ; i++) {
            String left = stringToSplit.substring(0, i);
            String right = stringToSplit.substring(i, stringToSplit.length());

            //contains(left) && DICTIONARY.contains(right)){
              //  return left + " " + right;
            //}
        }

        return stringToSplit;
    }

}
