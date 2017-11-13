import java.util.Scanner;

public class c03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n ; j > i + 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1 ; k++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
