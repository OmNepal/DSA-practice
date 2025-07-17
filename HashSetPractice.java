import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(8);
        set.add(8);//duplicate element will not be added
        set.add(1);
        set.add(0);
        set.add(7);

        //prints the hashset in sorted order
        System.out.println(set);

        System.out.println("Contains 4: " + set.contains(4));

        set.remove(4);
        System.out.println("Removed");

        System.out.println("Contains 4: " + set.contains(4));

        Iterator<Integer> iterator = set.iterator();//Hashset has an iterator method which return an Iterator object

        //iterating over the set
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Removing elements greater than 5");
        set.removeIf(em -> em > 5);

        System.out.println(set);

    }
}
