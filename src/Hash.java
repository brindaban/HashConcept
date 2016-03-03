public class Hash<T1, T2> {
    private Node<T1, T2>[] content;
    int noOfContent;

    public Hash() {
        noOfContent = 0;
        content = new Node[10];
    }

    public int getIndex(T2 key) {
        return (7 ^ Math.abs(key.hashCode())) % 10;
    }

    public boolean addElementWithKey(T1 element, T2 key) {
        int index = getIndex(key);
        Node<T1, T2> newNode = new Node<>(element, key, null);
        if (content[index] == null)
            content[index] = newNode;
        else {
            Node<T1, T2> currentNode = content[index];
            while(currentNode!=null){
                if (currentNode.key == key){
                    currentNode.element = element;
                    return  true;
                }
                currentNode = currentNode.next;
            }
            newNode.next = content[index];
            content[index] = newNode;
        }
        noOfContent++;
        return true;
    }

    public T1 getElementByKey(T2 key) {
        int index = getIndex(key);
        Node<T1, T2> currentNode = content[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.element;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public int getNoOfContent() {
        return noOfContent;
    }
}
