package Patterns;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=0;i<n;i++) {
            for (int j = 0; j<n-i ; j++) {
//                if ((i+j)%2==0) System.out.print(1+" ");
//                else
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}
