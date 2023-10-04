import java.util.*;
class DuplicateCharacters {
    public static void main(String[] args) {
        char[] arr = {'n', 'k', 'n', 's', 'l', 'a', 's'};
        
        for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               System.out.println("Duplicate characters are " + arr[i]);
          }
          }
        }
}
}