public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail ==null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int front = head.data;

            //for single element
            if (head == tail)
                tail = null;

            head = head.next;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();


        queue.remove();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();

        queue.add(1);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }

    }
}
