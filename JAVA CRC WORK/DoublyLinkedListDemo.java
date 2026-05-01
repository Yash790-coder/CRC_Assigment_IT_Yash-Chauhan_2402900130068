class DNode {
    int data;
    DNode prev, next;
    DNode(int d) { data = d; }
}

public class DoublyLinkedListDemo {
    DNode head;

    void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayBackward() {
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListDemo list = new DoublyLinkedListDemo();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();
        list.displayBackward();
    }
}
