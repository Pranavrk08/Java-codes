import java.util.Scanner;

public class oddEven {
    public static void oddEven(int[] arr) {
        int ec = 0;
        int oc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) ec++;
            else oc++;
        }
        System.out.print(ec + " " + oc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = carray(sc,n);
        oddEven(c);
    }
    public static int[] carray(Scanner s, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
