import com.sun.tools.javac.util.ArrayUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by jacobpiskorik on 11/6/15.
*/

public class Property_Testing
{

    // testing to see if both 100 arrays have the same amount of elements
    @Test
    public void testArraySameSize()
    {
        Property_Based_Testing pt = new Property_Based_Testing();
        pt.makeArray();
        int testArray[] = pt.getArray(0);
        Property_Based_Testing test = pt;
        int testArray2[]= test.getArray(0);
        Assert.assertEquals(testArray.length, testArray2.length);
    }

    //testing to see if the value after the first index is greater
    //the first index
    @Test
    public void testValueAfterGreater()
    {
        Property_Based_Testing test = new Property_Based_Testing();
        test.makeArray();
        int testArray[] =test.getArray(0);
        int test0= testArray[0];                                          //getting the first int in the first array
        int test1= testArray[1];                                          //getting the second int in the array
        Assert.assertTrue(test0<test1);
    }

    //testing to make sure the value is never decreasing
    //from the previous one
    @Test
    public void testValueNeverDecreasing()
    {
        Property_Based_Testing test = new Property_Based_Testing();
        test.makeArray();
        int testArray[] =test.getArray(0);
        int length = testArray.length;                                       //getting length of first array
        for(int i =0; i<length;i++)
        {
            Assert.assertTrue(testArray[0]< testArray[1]);
        }
    }

    //test to make sure the number of elements in the array
    //is the correct number
    @Test
    public void EveryElementInArray()
    {
        Property_Based_Testing test = new Property_Based_Testing();
        test.makeArray();
        int testArray[] =test.getArray(0);
        int counter=0;
       for(int k=0; k<testArray.length; k++)
       {
           counter++;
       }
        Assert.assertEquals(counter, testArray.length);
    }

    //test to make sure if there is no elements in the array
    //then the size is 0
    @Test
    public void NoElementInArray()
    {
        Property_Based_Testing test = new Property_Based_Testing();
        test.makeArray();
        int testArray[] =test.getArray(0);
        int length = testArray.length;
        for(int i =0; i<length; i++)
        {
            testArray[i]=testArray[i+1];
        }
        Assert.assertEquals(0,testArray.length);

    }

    /*test to see if the array is resorted the values remain the same
    @Test
    public void SortingNotChanged()
    {
        Property_Based_Testing test = new Property_Based_Testing();
        int indexOne = test[0][1];
        int indexTwo = test[0][1];
        test= Arrays.sort(test, new Sorting(0));
        int indexO = test[0][1];
        int indexT = test[0][1];
        Assert.assertEquals(indexOne,indexO);
        Assert.assertEquals(indexTwo,indexT);
    }
    */

}
