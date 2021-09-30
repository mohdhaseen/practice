package mmt;

public class LinkList {
    public LinkList(Node header) {
        this.header = header;
        header.next = null;
    }

    Node header;

    public void insert(int value) {
        Node node = new Node(value, null);
        Node temp = header;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void print() {
        Node temp = header;
        do {
            System.out.print(temp.value + "-");
            temp = temp.next;
        } while (temp.next != null);
        System.out.print(temp.value);
    }

    public void printReverse(Node node) {
        if (node.next == null) {
            System.out.print(node.value + " ");
            return;
        }

        printReverse(node.next);
        System.out.print(node.value + " ");
    }

}
