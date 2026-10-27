import java.util.Scanner;

public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.println("[i=" + i + "] ");   // debug sementara
            int j = 0;
            while (j < i) {
                System.out.println("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
