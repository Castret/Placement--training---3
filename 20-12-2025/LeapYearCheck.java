import java.util.*;
class LeapYearCheck {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y % 4 == 0)
            System.out.println("leap");
        else
            System.out.println("not");
    }
}