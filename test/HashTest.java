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
        myHashSet.addElementWithKey("Silsila",12);
        myHashSet.addElementWithKey("Baban",23);
        Assert.assertEquals(2,myHashSet.getNoOfContent());
    }

    @Test
    public void testForAddingAElementForWhichCollisionWillOccur(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Mastani",5);
        myHashSet.addElementWithKey("Silsila",13);
        myHashSet.addElementWithKey("Brindaban",17);
        myHashSet.addElementWithKey("Bepanha",22);
        myHashSet.addElementWithKey("Hazare",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals(5,myHashSet.getNoOfContent());
    }

    @Test
    public  void addADifferentValueWithSameKey(){
        Hash<String,Integer> myHashSet = new Hash<>();
        myHashSet.addElementWithKey("Mastani",5);
        myHashSet.addElementWithKey("Silsila",13);
        myHashSet.addElementWithKey("Bepanha",22);
        Assert.assertEquals("Silsila",myHashSet.getElementByKey(13));
        myHashSet.addElementWithKey("Bajirao",13);
        Assert.assertEquals("Bajirao",myHashSet.getElementByKey(13));
        Assert.assertNotEquals("Silsila",myHashSet.getElementByKey(13));
        Assert.assertEquals(3,myHashSet.getNoOfContent());
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
        myHashSet.addElementWithKey("Mastani",5);
        myHashSet.addElementWithKey("Silsila",13);
        myHashSet.addElementWithKey("Brindaban",17);
        myHashSet.addElementWithKey("Bepanha",22);
        myHashSet.addElementWithKey("Hazare",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals("Mastani",myHashSet.getElementByKey(5));
        Assert.assertEquals("Hazare",myHashSet.getElementByKey(11));
        Assert.assertEquals("Bepanha",myHashSet.getElementByKey(22));
        Assert.assertEquals("Brindaban",myHashSet.getElementByKey(17));


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
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals(myHashSet.getIndex(11),myHashSet.getIndex(17));
    }
}
