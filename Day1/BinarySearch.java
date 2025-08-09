package Day1;
import java.util.*;

public class BinarySearch {
    public int BinarySearch1(List<Integer> element, int target, int size) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (element.get(mid) == target) {
                return mid; 
            } 
            else if (element.get(mid) < target) {
                left = mid + 1; 
            } 
            else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> element = new ArrayList<>();

        System.out.println("Enter the size of the elements:");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            element.add(sc.nextInt());
        }

        Collections.sort(element);
        System.out.println("Sorted elements: " + element);

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        BinarySearch b = new BinarySearch();
        int result = b.BinarySearch1(element, target, size);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
