import java.util.*;

/**
 * Created by jacobpiskorik on 11/6/15.
 */
public class Property_Based_Testing
{
    private int [][]HundredArray;

    public Property_Based_Testing(int[][] t)
    {
        HundredArray= t;
    }

    public Property_Based_Testing()
    {
        HundredArray = new int[100][];
    }

    public int[] getArray(int index)
    {
        return HundredArray[index];
    }

    public void makeArray()
    {
        Random rn = new Random();
        for (int i = 0; i < 100; i++)
        {
            int sizeofarray = rn.nextInt(50) + 1;       //making the size of array
            HundredArray[i]=new int[sizeofarray];
            for (int j=0; j<sizeofarray;j++)        //adding random numbers to array
            {
               HundredArray[i][j]=rn.nextInt();
            }
            Arrays.sort(HundredArray[i]);

        }

    }


}

