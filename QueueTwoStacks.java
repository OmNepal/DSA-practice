import java.util.Stack;

public class QueueTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void enqueue(int data){
            while (!s1.isEmpty())
                s2.push(s1.pop());

            s1.push(data);

            while (!s2.isEmpty())
                s1.push(s2.pop());
        }

        public static int dequeue() {
            if (isEmpty()){
                System.out.println("Empty queue!");
                return -1;
            }

            return s1.pop();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (!q.isEmpty())
            System.out.print(q.dequeue() + " ");
    }
}
