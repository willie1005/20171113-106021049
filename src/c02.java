import java.util.Scanner;

public class c02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        for (int i = n1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
