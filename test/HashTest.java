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
    public void testForAddMoreThanOneElementInMyHash(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Sayoni",12);
        myHashSet.addElementWithKey("Baban",23);
        Assert.assertEquals(2,myHashSet.getNoOfContent());
    }

    @Test
    public void testForAddingAElementForWhichCollisionWillOccur(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Hiya",5);
        myHashSet.addElementWithKey("Sayoni",13);
        myHashSet.addElementWithKey("Biman",22);
        myHashSet.addElementWithKey("Hunu",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals(4,myHashSet.getNoOfContent());
    }

    @Test
    public void testForGetElementByTheKeyWhenThereIsJustOneElement(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Brindaban",20);
        String element = myHashSet.getElementByKey(20);
        Assert.assertEquals("Brindaban",element);
    }

    @Test
    public void testForGetElementByTheKeyFromMultipleElementINTheList(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Brindaban",20);
        myHashSet.addElementWithKey("Patra",23);
        myHashSet.addElementWithKey("Dibbo",12);
        Assert.assertEquals("Patra",myHashSet.getElementByKey(23));
        Assert.assertEquals("Brindaban",myHashSet.getElementByKey(20));
        Assert.assertEquals("Dibbo",myHashSet.getElementByKey(12));
    }

    @Test
    public void testForGetElementByTheKeyWhileCollisionOccur(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Hiya",5);
        myHashSet.addElementWithKey("Sayoni",13);
        myHashSet.addElementWithKey("Biman",22);
        myHashSet.addElementWithKey("Hunu",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals("Hiya",myHashSet.getElementByKey(5));
        Assert.assertEquals("Hunu",myHashSet.getElementByKey(11));

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
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex((11)));
    }
}

