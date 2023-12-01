import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DsaQueue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. IsEmpty?");
            System.out.println("4. Checking size...");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add in the Queue: ");
                    int number = scanner.nextInt();
                    queue.add(number);
                    System.out.println("Enqueue: " + number);
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        int dequeued = queue.poll();
                        System.out.println("Dequeued: " + dequeued);
                    } else {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;

                case 3:
                    System.out.println("-" + (queue.isEmpty() ? "True" : "False"));
                    break;

                case 4:
                    System.out.println("-Queue size is " + queue.size());
                    break;

                case 5:
                    System.out.println("-Bye");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);
    }
}
