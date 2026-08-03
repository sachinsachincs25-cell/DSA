import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0) {
                c=c+1;
            }}
        if(c==2){
            System.out.println("Prime");

            }else{
                System.out.println("Not Prime");
            }
        }
    }

