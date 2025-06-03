import java.util.*;

public class MoveZeros {
    public static void moveZeros(int[] arr){
        int p = 0;
        for(int i =0; i< arr.length;i++){
            if(arr[i]!=0){
                arr[p++]=arr[i];
            }
        }
        while(p<arr.length){
            arr[p++]=0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = new int[n];
        int[] a = Funcarr.cArray(sc,n);
        moveZeros(a);
        Funcarr.pArray(a);
    }
}
