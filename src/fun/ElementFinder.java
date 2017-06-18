import java.util.*;

public class ElementFinder {

    public static List<Integer> sortAndFindDuplicate(int arr[]) {
        System.out.println("sortAndFindDuplicate");
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
        System.out.println("findDuplicate");
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
        System.out.println("removeDuplicateItems");
        Set<Integer> duplicatedElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            duplicatedElements.add(arr[i]);
        }

        return duplicatedElements;
    }

    public static List<Integer> cleanDuplicates(int arr[]) {
        System.out.println("cleanDuplicates");
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