import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5); //adds to the first
        list.add(7); //adds to the last
        list.addFirst(1);
        list.addLast(3); //adds to the last
        list.addLast(8);
        list.addLast(2);
        list.add(3);

        System.out.println(list);

        if (list.contains(7))
            System.out.println("List contains 7");

        System.out.println("element at index 4: " + list.get(4));

        list.removeFirstOccurrence(3);
        System.out.println(list);

    }
}
