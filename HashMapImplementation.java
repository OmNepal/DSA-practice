import java.util.LinkedList;

public class HashMapImplementation {
    public static class HashMap<K, V> {
        static int n;
        static int N;
        static LinkedList[] buckets = new LinkedList[4];

        HashMap() {
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        class Node {
            K key;
            V value;

            Node (K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        int hash(K key){
            return 0;
        }

        private int searchLL(K key) {
            return 0;
        }

        void put(K key, V value) {
            int bi = hash(key);
            int di = searchLL(key);
            LinkedList ll = buckets[bi];
            if (ll.contains(key)) {
                Node node = (Node) ll.get(di);
                node.value = value;
            } else {
                ll.add(new Node(key, value));
            }
        }


    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("om", 19);

        for (LinkedList ll : map.buckets) {
            System.out.println();
        }
    }
}
