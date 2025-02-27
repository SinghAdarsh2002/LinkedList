public class Main {
    public static void main(String[] args) {
        SinglyLinkedList listAddedFirst = new SinglyLinkedList();
        listAddedFirst.addFirst(3);
        listAddedFirst.addFirst(2);
        listAddedFirst.addFirst(1);
        listAddedFirst.display();

        SinglyLinkedList listAddedLast = new SinglyLinkedList();
        listAddedLast.addLast(7);
        listAddedLast.addLast(8);
        listAddedLast.addLast(9);
        listAddedLast.display();
    }
}
