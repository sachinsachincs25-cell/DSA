import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println(i);

        }

    }
    }
}
