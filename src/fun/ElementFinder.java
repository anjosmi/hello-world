import java.util.*;

public class ElementFinder {

    public static List<Integer> sortAndFindDuplicate(int arr[]) {
        List<Integer> repeatedElements = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeatedElements.add(arr[i]);
            }
        }
        return repeatedElements;
    }

    public static List<Integer> findDuplicate(int arr[]) {
        List<Integer> elements = new ArrayList<>();
        List<Integer> duplicatedElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!elements.contains(arr[i])) {
                elements.add(arr[i]);
            } else {
                duplicatedElements.add(arr[i]);
            }
        }
        return duplicatedElements;
    }

    public static Set<Integer> removeDuplicateItems(int arr[]) {
        Set<Integer> duplicatedElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            duplicatedElements.add(arr[i]);
        }

        return duplicatedElements;
    }

    public static List<Integer> cleanDuplicates(int arr[]) {
        List<Integer> elements = new ArrayList<>();
        List<Integer> duplicatedElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!elements.contains(arr[i])) {
                elements.add(arr[i]);
            } else {
                duplicatedElements.add(arr[i]);
            }
        }
        return elements;
    }
}