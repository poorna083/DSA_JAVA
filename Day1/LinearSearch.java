// Linear Search using Array
package Day1;
import java.util.*;

public class LinearSearch {

    public int LinearSearch(List<Integer> element, int target) {
        for (int i = 0; i < element.size(); i++) {
            if (element.get(i) == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> element = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            element.add(sc.nextInt());
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        LinearSearch L = new LinearSearch();
        int index = L.LinearSearch(element, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
