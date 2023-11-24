import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DsaQueue {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Display initial queue state
        System.out.println("Queue size = " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Enqueue elements based on user input
        enqueueFromUserInput(queue, scanner);

        // Display updated queue state
        displayQueueState(queue);

        // Dequeue an element
        dequeue(queue);

        // Display updated queue state
        displayQueueState(queue);

        // Dequeue another element
        dequeue(queue);

        // Display final queue state
        displayQueueState(queue);

        scanner.close();
    }

    // Function to enqueue elements based on user input
    private static void enqueueFromUserInput(Queue<Integer> queue, Scanner scanner) {
        System.out.print("Enter the number of elements to enqueue: ");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            queue.add(element);
            System.out.println("Enqueued: " + element);
        }
    }

    // Function to dequeue an element from the queue
    private static void dequeue(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            int removedElement = queue.poll();
            System.out.println("Dequeued: " + removedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Function to display the current state of the queu
    private static void displayQueueState(Queue<Integer> queue) {
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
