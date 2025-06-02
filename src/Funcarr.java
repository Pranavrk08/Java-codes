import java.util.*;
public class Funcarr {
    public static int[] cArray(Scanner sc,int x){
        int[] arr= new int[x];
        for(int i=0;i<x;i++){
            arr[i]= sc.nextInt();
        }
        return arr;

    }
    public static void pArray(int[] n,int x){
        for(int i=0;i<x;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
        int[] n= cArray(sc,x);
        pArray(n,x);
    }

}
