public static void BubbleSort(int [] array)
	{
	    int temp;   // temp for  exchanging value
	    for (int i=1; i<array.length; i++)
	    {
	        for(int j=0; j<array.length-i; j++)
	        {
	            if (array[j] > array [j+1])
	            {
	                temp = array [j];
	                array [j] = array [j+1];
	                array [j+1] = temp;
	            }
	        }
	    }
	}
