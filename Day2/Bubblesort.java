//Bubble Sorting using arrayList
package Day2;
import java.util.*;

public class Bubblesort {
    public void Bubblesort(List<Integer> nums, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements to sort:");
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        Bubblesort b = new Bubblesort();
        b.Bubblesort(nums, size);
        System.out.println("Sorted Arraylist: " + nums);
    }
}
