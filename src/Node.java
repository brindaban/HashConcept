public class Node<T1,T2> {
    T1 element;
    T2 key;
    Node<T1,T2> next;

    public Node(T1 element, T2 key, Node<T1,T2> nextNode) {
        this.element = element;
        this.key = key;
        this.next = nextNode;
    }
}
