import java.util.Scanner;

public class sum_of_digit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            int d = a % 10;
            sum +=d;
            a /= 10;
        }

            System.out.print(sum);
        }
    }
