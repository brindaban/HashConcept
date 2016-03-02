public class LinierHash<T1,T2> {
    private EachElement<T1,T2>[] content;
    int  noOfContent;

    public LinierHash() {
        this.content = new EachElement[10];
        this.noOfContent = 0;
    }

    public int getIndex(T2 key){
        return (7^Math.abs(key.hashCode()))%10;
    }

    public boolean addElementWithKey(T1 element, T2 key) {
        int index = getIndex(key);
        EachElement<T1,T2> newElement = new EachElement<>(element,key);
        if (content[index]==null){
            content[index] = newElement;
        }
        else {
            while (content[index]!=null)
                index++;
            content[index] = newElement;
        }
        noOfContent++;
        return true;
    }

    public T1 getElementByKey(T2 key) {
        int index = getIndex(key);
        EachElement<T1, T2> currentNode = content[index];
        while(content[index]!=null){
            if(currentNode.key == key)
                return currentNode.element;
            index++;
            currentNode = content[index];

        }

        return null;
    }

    public int getNoOfContent(){
        return noOfContent;
    }
}
