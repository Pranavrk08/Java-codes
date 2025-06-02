import java.util.Scanner;

public class NewProgram {
          public static void main(String[] Args){
              Scanner sc =  new Scanner(System.in);
              String str = sc.nextLine();
              for(int i=0;i<=str.length()-1;i++){
                  if(str.charAt(i)==' ') continue;
                  System.out.print(str.charAt(i));
              }

          }
}

