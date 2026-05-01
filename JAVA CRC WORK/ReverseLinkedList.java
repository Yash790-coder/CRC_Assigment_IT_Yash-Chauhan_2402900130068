class Node2 {
    int data;
    Node2 next;
    Node2(int d) { data = d; next = null; }
}

public class ReverseLinkedList {
    Node2 head;

    void insert(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    void reverse() {
        Node2 prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.reverse();
        list.display();
    }
}
