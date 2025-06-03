package Strings;

import java.util.Scanner;

public class Checkpalindrome {
    public static boolean checkPalindrome(String s,int left,int right){//Using recursion
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return checkPalindrome(s,left+1,right-1);
    }
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkPalindrome(str,0,str.length()-1)) System.out.print("The given string is a Palindrome");
        else System.out.println("Given string is not a palindrome!");
    }
}
