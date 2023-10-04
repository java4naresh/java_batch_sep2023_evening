import java.util.*;
class DuplicateElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 3, 9, 6, 7, 6};
        
        System.out.println("Duplicate elements in the array are: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}