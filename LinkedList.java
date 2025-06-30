class LL {
    Node head;
    int size;

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
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void deleteAtFirst() {
        size--;
        if (head == null) {
            System.out.print("The list is empty!");
            return;
        }
        head = head.next;
    }

    void insertAtIndex(int index, String data) {
        if (index > size || index < 0) {
            System.out.print("Invalid Index!");
            return;
        }

        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        if (index == 0) {
            this.insertAtFirst(data);
        }

        Node currNode = head;

        for (int i = 1; i <= index; i++) {
            if (i == index) {
                newNode.next = currNode.next;
                currNode.next = newNode;
            }
            currNode = currNode.next;
        }
    }

    void insertAtLast(String data) {
        Node newNode = new Node(data);
        size++;
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
        size--;
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

    int getSize(){
        return size;
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
        System.out.println(list.getSize());

        list.deleteAtFirst();
        list.printList();
        System.out.println(list.getSize());

        list.deleteAtLast();
        list.printList();
        System.out.println(list.getSize());

        list.insertAtIndex(2, "linked");
        list.printList();

        list.insertAtIndex(0, "this");
        list.printList();

        list.insertAtIndex(5, "structure");
        list.printList();
    }








}