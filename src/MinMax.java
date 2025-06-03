import java.util.*;
public class MinMax {
    public static void minMax(int[] arr){
        int h = Integer.MIN_VALUE;
        int l = Integer.MAX_VALUE;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>h) h=arr[i];
            if(arr[i]<l) l=arr[i];
        }
        System.out.println("Lowest value:"+l);
        System.out.print("Highest value: "+h);

    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        //int[] x = {15,22,26,17,9,18};
        //minMax(x);
        int[] p = cArray(sc,n);
        int sum = arraySum(p);
        System.out.println(sum);

    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] cArray(Scanner s,int n) {
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        return arr;

    }
}
