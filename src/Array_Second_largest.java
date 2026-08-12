import java.util.*;

public class Array_Second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b[] = new int[a];

        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);

        int secondLargest = -1;

        for(int j = a - 2; j >= 0; j--) {
            if(b[j] < b[a - 1]) {
                secondLargest = b[j];
                break;
            }
        }

        System.out.println(secondLargest);
    }
}