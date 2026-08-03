import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        int org=a;
        while(a!=0){
            int d=a%10;
            rev=rev*10+d;
            a/=10;}
        if(rev==org){
            System.out.println("IsPalindrome");

            }else{
            System.out.println("NotPalindrome");

        }


    }

}
