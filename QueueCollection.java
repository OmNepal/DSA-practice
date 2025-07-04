import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>(); //Queue in Java is an interface so a queue object can be actually created using a Linked List or ArrayDeque
        //Queue<String> ticketQueue = new ArrayDeque<>();

        ticketQueue.add("Om");
        ticketQueue.add("Murdryk");
        ticketQueue.add("Minni");

        ticketQueue.forEach(n -> System.out.print(n + " - "));

        ticketQueue.remove();
        System.out.println();

        ticketQueue.forEach(n -> System.out.print(n + " - "));

        ticketQueue.add("Johnson");
        System.out.println();

        ticketQueue.forEach(n -> System.out.print(n + " - "));
        System.out.println();

        System.out.println(ticketQueue.contains("Om"));
        ticketQueue.removeIf(n -> Objects.equals(n, "Minni"));

        ticketQueue.forEach(n -> System.out.print(n + " - "));
    }
}
