public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "-->");
            current = current.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;
        
        private Node(int value) {
            this.value = value;
        }
        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}