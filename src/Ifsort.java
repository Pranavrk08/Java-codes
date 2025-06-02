import java.util.Scanner;

public class Ifsort {
    public static boolean Ifsort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])  return false;

        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = cArray(sc,n);
        //System.out.print(Ifsort(c));
        array(c);

    }
    public static  int[] cArray(Scanner c,int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= c.nextInt();
        }
        return arr;
    }
    public static void array(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
