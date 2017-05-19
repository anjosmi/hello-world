public class MyApp {
    public static void main(String args[]) {
        ElementFinder duplicate = new ElementFinder();
        int arr[] = {1, 3, 5, 6, 3, 6, 7, 10};

        System.out.println("Given this array of elements {1, 3, 5, 6, 3, 6, 7, 10}");

        System.out.println(duplicate.findDuplicate(arr));

        System.out.println(duplicate.sortAndFindDuplicate(arr));

        System.out.println(duplicate.cleanDuplicates(arr));

        System.out.println(duplicate.removeDuplicateItems(arr));

        StringSelector stringSelector = new StringSelector();
        String str = stringSelector.reverseString("dlroW olleH");
        System.out.println(str);

    }
}