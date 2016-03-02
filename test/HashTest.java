import org.junit.Assert;
import org.junit.Test;

public class HashTest {
    @Test
    public void addAElementInMyHashSetAndReturnHowManyElementsInTheList(){
        Hash<String,Integer> myHashSet = new Hash<>();
        boolean result = myHashSet.addElementWithKey("Brindaban",20);
        Assert.assertEquals(result,true);
    }

    @Test
    public void getElementTestByTheKey(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Brindaban",20);
        String element = myHashSet.getElementByKey(20);
    }

    @Test
    public void testForHashFunctionWhenKeyIsAIntegerType(){
        Hash<String,Integer> myHashSet = new Hash<>();
        int key = myHashSet.getIndex(34);
        Assert.assertEquals(key,7);
    }

    @Test
    public void testForHashFunctionWhenKeyIsAStringType(){
        Hash<String,String> myHashSet = new Hash<>();
        int key = myHashSet.getIndex("gaata rahe mera dil, tuhi mera manjil");
        Assert.assertEquals(key,5);
    }

    @Test
    public void testForHashFunctionWhenCollisionOccurs(){
        Hash<String,Integer> myHashSet = new Hash<>();
        int encodedKey = myHashSet.getIndex(5);
        int encodedCollisionKey = myHashSet.getIndex((11));
        Assert.assertEquals(encodedKey,encodedCollisionKey);
    }
}

