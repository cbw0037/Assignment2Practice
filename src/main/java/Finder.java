public class Finder
{

    public Integer findMax(int[] intArray)
    {
        if (intArray == null || intArray.length == 0)
        {
            return null;
        }
        int temp = intArray[0];
        for (int i = 1; i < intArray.length; i++)
        {
            if (temp < intArray[i])
            {
                temp = intArray[i];
            }
        }
        return temp;
    }

    public Integer findMin(int[] intArray)
    {
        if (intArray == null || intArray.length == 0)
        {
            return null;
        }
        int temp = intArray[0];
        for (int i = 1; i < intArray.length; i++)
        {
            if (temp > intArray[i])
            {
                temp = intArray[i];
            }
        }
        return temp;
    }

    public static void main(String[] args)
    {
       int[] array1 = {1,2,3,4,5,6,7};
       int[] array2 = {9,5,10,24,86,3,-71};

       Finder find = new Finder();

       int max1 = find.findMax(array1);
       int min1 = find.findMin(array1);
       int max2 = find.findMax(array2);
       int min2 = find.findMin(array2);

        System.out.println("Max of array1 is " + max1 + ".\n" +
                            "Min of array1 is " + min1 + ".\n" +
                            "Max of array2 is " + max2 + ".\n" +
                            "Min of array2 is " + min2 + ".\n");
    }
}
