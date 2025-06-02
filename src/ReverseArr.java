public class ReverseArr {
    public static void Arr(int[] arr){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String[] args ){
        int [] a = {12,45,67,34,78,90,23};
        Arr(a);
    }
}
