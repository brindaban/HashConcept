import java.lang.reflect.Array;

/**
 * Created by brindaba on 3/1/16.
 */
public class Hash<T1,T2>{
    private T1[] content;
    int  noOfContent;

    public Hash() {
        content = (T1[]) new Object(10)
        noOfContent = 0;
    }

    public int addElementWithKey(T1 element, T2 key) {
//        int index = key ^ 5;
//        if (index>=10){
//            index = index % 10;
//            content[index] = element;
//        }
//        else
//            content[index] = element;
//        return  noOfContent++;
    }

    public String getElementByKey(T2 key) {
//        int index = key ^ 5;
//        if(index>=10)
//            index = index % 10;
//        return  content[index];

    }
}
