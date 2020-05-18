import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi của bạn:  ");
        String myString = scanner.nextLine();
        System.out.println(myString);

        for (int i = 0; i < myString.length(); i++) {
            if (list.size() > 1 && myString.charAt(i) <= list.getLast() &&
                    list.contains(myString.charAt(i))) {
                list.clear();
            }
            list.add(myString.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}
