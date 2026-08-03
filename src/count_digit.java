import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){

            c=c+1;
            a/=10;
        }
        System.out.println(c);
    }
}
