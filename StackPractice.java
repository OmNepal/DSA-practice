public class StackPractice {
//implementing stack using LinkedList

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        static Node head; //head of the LL is the top of the Stack

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) { //pushes value to the top of the Stack
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() { //removes and returns the top value of the Stack
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() { //just returns the top value of the Stack
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void pushAtBottom(int data){//recursive method to push provided value at the bottom of the stack
            if (isEmpty()){
                push(data);
                return;
            }

            int top = pop();
            pushAtBottom(data); //Recursion
            push(top);
        }

    }



    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pushAtBottom(7);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
    

}