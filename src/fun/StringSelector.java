import java.util.List;

public class StringSelector {

    public static String reverseString(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static Boolean containsString(List<String> list, String strToBeSearched) {

        for (int i = 1; i < list.size(); i++) {
            String currentElement = list.get(i);
            if (currentElement.contains(strToBeSearched)) {
                return true;
            }

        }

        return false;
    }

}