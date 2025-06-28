class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }

    void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.print("The list is empty!");
            return;
        }
        head = head.next;
    }

    void insertAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    void deleteAtLast() {
        if (head == null) {
            System.out.print("The list is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }

        currNode.next = null;

    }

    void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst("a");
        list.insertAtFirst("is");
        list.insertAtFirst("It");

        list.printList();

        list.insertAtLast("data");
        list.insertAtLast("structure");
        list.printList();

        list.deleteAtFirst();
        list.printList();

        list.deleteAtLast();
        list.printList();
    }








}