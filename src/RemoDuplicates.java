import java.util.*;

public class RemoDuplicates {
    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[++i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = Funcarr.cArray(sc,n);
        Arrays.sort(a);
        int newI = removeDuplicates(a);
        for(int i=0;i<newI;i++){
            System.out.print(a[i]+" ");
        }
    }
}
