class NodeStack {
    int data;
    NodeStack next;
    NodeStack(int d) { data = d; }
}

public class StackLinkedList {
    NodeStack top;

    void push(int data) {
        NodeStack newNode = new NodeStack(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void display() {
        NodeStack temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.display();
        s.pop();
        s.display();
    }
}
