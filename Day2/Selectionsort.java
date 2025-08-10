//Insertion sort using LinkedList
package Day2;
import java.util.*;

public class Selectionsort {

    public void selectionSort(List<Integer> nums, int size) {
        if (nums.size() == 0) return;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums.get(j) < nums.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = nums.get(minIndex);
            nums.set(minIndex, nums.get(i));
            nums.set(i, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        System.out.println("Enter the Elements to sort:");
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }

        Selectionsort s = new Selectionsort();
        s.selectionSort(nums, size);

        System.out.println("Sorted Elements: " + nums);
        sc.close();
    }
}
