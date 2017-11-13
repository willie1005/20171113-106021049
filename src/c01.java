import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
