import java.util.Stack;

public class reverse {

    public static void printReverseLinkedList(Node head) {
        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        System.out.println("Linked List in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }

    public static void main(String[] args) {
        Node A = new Node(10);
        A.next = new Node(20);
        A.next.next = new Node(30);
        A.next.next.next = new Node(40);

        printReverseLinkedList(A);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
