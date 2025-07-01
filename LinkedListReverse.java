
public class LinkedListReverse {
    Node head;

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    void reverseListIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node reverseListRecursive(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;



    }


    public static void main(String[] args) {


        LinkedListReverse list = new LinkedListReverse();
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(3);
        list.insertAtFirst(7);
        list.insertAtFirst(5);
        list.insertAtFirst(1);

        System.out.println("Original List: ");
        list.printList();

        list.reverseListIterative();
        System.out.println("Reversed List: ");
        list.printList();

        System.out.println("Reversed List: ");
        list.head = list.reverseListRecursive(list.head);
        list.printList();


    }
}
