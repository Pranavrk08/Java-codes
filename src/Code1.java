import java.util.*;
public class Code1 {
    public static void main(String[]args)
    {
        //int[] arr = {15,22,45,86,99};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
Scanner sc = new Scanner(System.in);
//        for(int i=4;i>=0;i--){
//            System.out.println(i+1+" The element is "+arr[i]);
//        }
        System.out.print("Enter upper limit: ");
        int a = sc.nextInt();
        System.out.println("Enter lower limit: ");
        int l = sc.nextInt();
        int c=0;
        for(int i=l+1;i<a;i++){
            if(i%2==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Total of no fo even numbers from "+l+" to "+a+" is : "+ c);



    }
}
