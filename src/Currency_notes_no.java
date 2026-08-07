import java.util.Scanner;

public class Currency_notes_no {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            int notes[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};

            int totalNotes = 0;

            for (int i = 0; i < notes.length; i++) {
                if (amount >= notes[i]) {
                    int count = amount / notes[i];
                    System.out.println(notes[i] + " x " + count);
                    totalNotes += count;
                    amount = amount % notes[i];
                }
            }

            System.out.println( totalNotes);
        }
    }

