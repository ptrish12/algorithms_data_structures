import java.util.Arrays;
import java.util.Random;

public class binarySearch {

    private static int doBinarySearch (int[] listToSearch, int key) {
        int high = listToSearch.length - 1;
        int low = 0;
        int mid = (high - low) / 2;

        while (high > low) {
            if (key == listToSearch[mid]) {
                return mid;
            } else if (key < listToSearch[mid]) {
                high = mid;
                mid = (high - low) / 2;
            } else if (key > listToSearch[mid]) {
                low = mid;
                mid = low + (high - low) / 2 + 1;
            }
        }
        return -1;

    }

    

    public static void main (String[] args) {
        int[] searchList = {0, 5, 9, 9, 13, 16, 20, 22, 23, 24, 27, 34, 37, 43, 45};
//        Random rand = new Random();
//        for (int i = 0; i < searchList.length; i ++) {
//            searchList[i] = rand.nextInt(50);
//        }
//        Arrays.sort(searchList);
        System.out.println(Arrays.toString(searchList));
        int result = doBinarySearch(searchList, 0);
        System.out.println(result);
        result = doBinarySearch(searchList, 5);
        System.out.println(result);
        result = doBinarySearch(searchList, 20);
        System.out.println(result);
        result = doBinarySearch(searchList, 22);
        System.out.println(result);
        result = doBinarySearch(searchList, 45);
        System.out.println(result);
    }
}
