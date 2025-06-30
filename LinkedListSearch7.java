import java.util.Scanner;

public class LinkedListSearch7 {
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
        while (currNode.next != null) {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }

    int searchData(Integer data) {
        Node currNode = head;
        int index = 0;
        while (currNode != null) {
            if (currNode.data == data) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedListSearch7 list = new LinkedListSearch7();
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(3);
        list.insertAtFirst(7);
        list.insertAtFirst(5);
        list.insertAtFirst(1);

        list.printList();

        System.out.print("Enter the number to find: ");
        int num = scanner.nextInt();

        int numIndex = list.searchData(num);
        System.out.println(numIndex >= 0 ? "Number found at index: " + numIndex : "Number not found");
    }
}
