import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class binarySearch {

    private static int doBinarySearch (int[] listToSearch, int key) {
        // implements binary search from an input array and an int key.
        int high = listToSearch.length - 1;
        int low = 0;
        int mid = (high - low) / 2;

        while (high > low) {
            if (key == listToSearch[mid]) {
                return mid;
            } else if (key < listToSearch[mid]) {
                high = mid-1;
                mid = (high - low) / 2;
            } else if (key > listToSearch[mid]) {
                low = mid;
                mid = low + (high - low) / 2 + 1;
            }
        }
        return -1;
    }

    private static int getSearchKey () {
        // User inputs number to search for
        System.out.println("Enter an integer to search for.");
        Scanner getKey = new Scanner(System.in);
        int searchKey = getKey.nextInt();
        return searchKey;
    }

    private static int[] getUserListToSearch() {
        // get user-provided array to search in
        System.out.println("How long is your array?");
        Scanner getN = new Scanner(System.in);
        int n = getN.nextInt();

        int[] listToSearch = new int[n];
        Scanner getList = new Scanner(System.in);
        System.out.println("Enter a series of numbers.");

        for (int i = 0; i < n; i++) {
            listToSearch[i] = getList.nextInt();
        }
        Arrays.sort(listToSearch);
        return listToSearch;
    }

    private static int[] getRandomList() {
        // let computer provide random array to search.
        System.out.println("How long is the array?");
        Scanner getN = new Scanner(System.in);
        int n = getN.nextInt();

        int[] listToSearch = new int[n];

        Random rand = new Random();
        for (int i = 0; i < listToSearch.length; i ++) {
            listToSearch[i] = rand.nextInt(50);
        }
        Arrays.sort(listToSearch);
        return listToSearch;
    }

    public static void main (String[] args) {

        System.out.println("Do you want the computer to provide a random array? Enter y or n.");
        Scanner inputEntry = new Scanner(System.in);
        String inputType = inputEntry.nextLine();

        int[] searchList;

        if (inputType.equals("y")) {
            searchList = getRandomList();
        } else if (inputType.equals("n")){
            searchList = getUserListToSearch();
        } else {
            searchList = getRandomList();
        }

        int keyNumber = getSearchKey();
        System.out.println(Arrays.toString(searchList));
        int result = doBinarySearch(searchList, keyNumber);
        System.out.println(result);

    }
}
