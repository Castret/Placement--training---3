import java.util.*;
class CountWords {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] x = s.split(" ");
        System.out.println(x.length);
    }
}