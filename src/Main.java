import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;



public class Main {
    private static Interface_Queue IQueue;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean checker = true;
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        do {
            System.out.println("Please choose one of the following operations by writing a number between 1 and 7:\n" +
                    "1.) add an item to the queue.\n" +
                    "2.) remove the first Item from the queue. \n" +
                    "3.) Check if queue is empty \n" +
                    "4.) check how much objects are in queue \n" +
                    "5.) Clear queue \n" +
                    "6.) Print Queue\n" +
                    "7.) end");


            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Please write something down to add it in queue: ");
                    String input = scanner.next();
                    System.out.println("You have added " + input + " to the queue");
                    IQueue.enter(input, queue);
                case 2:
                    Object obj = IQueue.leave(queue);
                    if (obj != null) {
                        System.out.println(obj + " was removed.");
                    }
                    System.out.println("can´t remove anything if queue is empty.");
                case 3:
                    boolean bool = IQueue.isEmpty(queue);
                    if (bool == true) {
                        System.out.println("Queue is Empty");
                    }
                    System.out.println("Queue is not empty");
                case 4:
                    int size = IQueue.size(queue);
                    System.out.println("The Queue contains " + size + " elements.");
                case 5:
                    IQueue.clear(queue);
                    System.out.println("The queue is now empty.");
                case 6:
                    printQueue(queue);
                case 7:
                    checker = false;
                default:
                    System.out.println("No match found, please select a number between 1 and 5");
            }
        }while (checker == true);

    }

    private static void printQueue(Queue queue){
        for(Object elm : queue){
            System.out.println(elm);
        }
    }
}