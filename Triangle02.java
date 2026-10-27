import java.util.Scanner;

public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            } System.out.println();
            i++;
        }

        int k = 1;
        while (k <= n) {
            int l = 0;
            while (l < i) {
                System.out.print("*");
                l++;
            } System.out.println();
            k++;
        }
        sc.close();
    }
}
