package Patterns;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1 + " ");
            }
            for (int h = i + 1; h > 1; h--) {
                System.out.print(h - 1 + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                System.out.print("  ");
            }
            for(int k=1;k<n-i;k++){
                System.out.print(k+" ");
            }
            for(int h=1;h<n-i-1;h++){
                System.out.print(h+" ");
            }
            System.out.println();
        }
    }
}
