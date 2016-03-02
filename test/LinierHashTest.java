import org.junit.Assert;
import org.junit.Test;

public class LinierHashTest {
    @Test
    public void addAElementInMyHashSetAndReturnHowManyElementsInTheList(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        boolean result = myHashSet.addElementWithKey("Brindaban",20);
        Assert.assertEquals(result,true);
        Assert.assertEquals(1,myHashSet.getNoOfContent());
    }

    @Test
    public void testForAddMoreThanOneElementInMyHash(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        myHashSet.addElementWithKey("Sayoni",12);
        myHashSet.addElementWithKey("Baban",23);
        Assert.assertEquals(2,myHashSet.getNoOfContent());
    }

    @Test
    public void testForAddingAElementForWhichCollisionWillOccur(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        myHashSet.addElementWithKey("Hiya",5);
        myHashSet.addElementWithKey("Sayoni",13);
        myHashSet.addElementWithKey("Biman",22);
        myHashSet.addElementWithKey("Hunu",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals(4,myHashSet.getNoOfContent());
    }

//    @Test
//    public  void addADifferentValueWithSameKey(){
//        LinierHash<String,Integer> myHashSet = new LinierHash<>();
//        myHashSet.addElementWithKey("Hiya",5);
//        myHashSet.addElementWithKey("Sayoni",13);
//        myHashSet.addElementWithKey("Biman",22);
//        Assert.assertEquals("Sayoni",myHashSet.getElementByKey(13));
//        myHashSet.addElementWithKey("Mandal",13);
//        Assert.assertEquals("Mandal",myHashSet.getElementByKey(13));
//        Assert.assertNotEquals("Sayoni",myHashSet.getElementByKey(13));
////        Assert.assertEquals(3,myHashSet.getNoOfContent());
//    }

    @Test
    public void testForGetElementByTheKeyWhenThereIsJustOneElement(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        myHashSet.addElementWithKey("Brindaban",20);
        String element = myHashSet.getElementByKey(20);
        Assert.assertEquals("Brindaban",element);
    }

    @Test
    public void testForGetElementByTheKeyFromMultipleElementINTheList(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        myHashSet.addElementWithKey("Brindaban",20);
        myHashSet.addElementWithKey("Patra",23);
        myHashSet.addElementWithKey("Dibbo",12);
        Assert.assertEquals("Patra",myHashSet.getElementByKey(23));
        Assert.assertEquals("Brindaban",myHashSet.getElementByKey(20));
        Assert.assertEquals("Dibbo",myHashSet.getElementByKey(12));
    }

    @Test
    public void testForGetElementByTheKeyWhileCollisionOccur(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        myHashSet.addElementWithKey("Hiya",5);
        myHashSet.addElementWithKey("Sayoni",13);
        myHashSet.addElementWithKey("Biman",22);
        myHashSet.addElementWithKey("Hunu",11);
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex(11));
        Assert.assertEquals("Hunu",myHashSet.getElementByKey(11));
        Assert.assertEquals("Hiya",myHashSet.getElementByKey(5));
    }

    @Test
    public void testForHashFunctionWhenKeyIsAIntegerType(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        int key = myHashSet.getIndex(34);
        Assert.assertEquals(key,7);
    }

    @Test
    public void testForHashFunctionWhenKeyIsAStringType(){
        LinierHash<String,String> myHashSet = new LinierHash<>();
        int key = myHashSet.getIndex("gaata rahe mera dil, tuhi mera manjil");
        Assert.assertEquals(key,5);
    }

    @Test
    public void testForHashFunctionWhenCollisionOccurs(){
        LinierHash<String,Integer> myHashSet = new LinierHash<>();
        Assert.assertEquals(myHashSet.getIndex(5),myHashSet.getIndex((11)));
    }


}
